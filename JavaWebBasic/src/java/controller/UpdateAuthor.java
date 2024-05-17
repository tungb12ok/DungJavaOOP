/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.AuthorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Author;

/**
 *
 * @author tungl
 */
@WebServlet(name = "UpdateAuthor", urlPatterns = {"/updateAuthor"})
public class UpdateAuthor extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AuthorDAO aDAO = new AuthorDAO();
        String id = request.getParameter("id");

        List<Author> list = aDAO.getAllUsers();
        request.setAttribute("list", list);
        
        request.setAttribute("a", aDAO.getAuthor(id));
        request.getRequestDispatcher("listAuthor.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("Id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String contract = request.getParameter("contract");

        boolean flag = contract == null ? false : true;
        AuthorDAO aDAO = new AuthorDAO();

        Author a = new Author(id, lastName, firstName, phone, address, city, state, zip, flag);
        try {
            aDAO.addAuthor(a);
        } catch (Exception e) {
            response.getWriter().print(e.getMessage());
            return;
        }

        request.getRequestDispatcher("listAuthor.jsp").forward(request, response);
    }

}
