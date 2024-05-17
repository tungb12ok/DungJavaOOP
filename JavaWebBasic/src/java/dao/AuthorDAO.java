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
            System.err.println(e);
            // Xử lý ngoại lệ, có thể throw hoặc log
        }
        return list;
    }

    public Author getAuthor(String id) {
        Author a = null;

        String sql = "SELECT TOP (1000) [au_id]\n"
                + "      ,[au_lname]\n"
                + "      ,[au_fname]\n"
                + "      ,[phone]\n"
                + "      ,[address]\n"
                + "      ,[city]\n"
                + "      ,[state]\n"
                + "      ,[zip]\n"
                + "      ,[contract]\n"
                + "  FROM [pubs].[dbo].[authors]"
                + "     WHERE au_id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                // nếu có thì tạo mới
                a = new Author();

                a.setAuthorId(rs.getString("au_id"));
                a.setAuthorLastname(rs.getString("au_lname"));
                a.setAuthorFirstname(rs.getString("au_fname"));
                a.setPhone(rs.getString("phone"));
                a.setCity(rs.getString("city"));
                a.setAddress(rs.getString("address"));
                a.setState(rs.getString("state"));
                a.setZip(rs.getString("zip"));
                a.setContract(rs.getBoolean("contract"));
            }
        } catch (SQLException e) {
            System.err.println(e);
            // Xử lý ngoại lệ, có thể throw hoặc log
        }
        return a;
    }

    public boolean addAuthor(Author a) {
        String sql = "INSERT INTO [dbo].[authors]\n"
                + "           ([au_id]\n"
                + "           ,[au_lname]\n"
                + "           ,[au_fname]\n"
                + "           ,[phone]\n"
                + "           ,[address]\n"
                + "           ,[city]\n"
                + "           ,[state]\n"
                + "           ,[zip]\n"
                + "           ,[contract])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";

        try {
            PreparedStatement sm = connection.prepareStatement(sql);

            sm.setString(1, a.getAuthorId());
            sm.setString(2, a.getAuthorLastname());
            sm.setString(3, a.getAuthorFirstname());
            sm.setString(4, a.getPhone());
            sm.setString(5, a.getAddress());
            sm.setString(6, a.getCity());
            sm.setString(7, a.getState());
            sm.setString(8, a.getZip());
            sm.setBoolean(9, a.isContract());

            int flag = sm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static void main(String[] args) {
        AuthorDAO aDAO = new AuthorDAO();
//        Author author = new Author("998-72-3569", "Lưu", "Tùng", "0972074620", "Cầu Giấy", "Anytown", "CA", "12345", true);

//        aDAO.addAuthor(author);
        System.out.println(aDAO.getAuthor("648-92-1872"));
    }
}
