/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DBContext.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Author;

/**
 *
 * @author tungl
 */
public class AuthorDAO extends DBContext {

    public List<Author> getAllUsers() {
        List<Author> list = new ArrayList<>();

        String sql = "SELECT TOP (1000) [au_id]\n"
                + "      ,[au_lname]\n"
                + "      ,[au_fname]\n"
                + "      ,[phone]\n"
                + "      ,[address]\n"
                + "      ,[city]\n"
                + "      ,[state]\n"
                + "      ,[zip]\n"
                + "      ,[contract]\n"
                + "  FROM [pubs].[dbo].[authors]";

        try (PreparedStatement statement = connection.prepareStatement(sql); ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                Author a = new Author();
                a.setAuthorId(rs.getString("au_id"));
                a.setAuthorLastname(rs.getString("au_lname"));
                a.setAuthorFirstname(rs.getString("au_fname"));
                a.setPhone(rs.getString("phone"));
                a.setCity(rs.getString("city"));
                a.setAddress(rs.getString("address"));
                a.setState(rs.getString("state"));
                a.setZip(rs.getString("zip"));
                a.setContract(rs.getBoolean("contract"));
                list.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý ngoại lệ, có thể throw hoặc log
        }
        return list;
    }
    
    public static void main(String[] args) {
        AuthorDAO aDAO = new AuthorDAO();
        
        System.out.println(aDAO.getAllUsers().get(0));
    }
}
