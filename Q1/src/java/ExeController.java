/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author tungl
 */
public class ExeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        PrintWriter out = response.getWriter();
        int n1, n2;
        if (num1.isEmpty() || num2.isEmpty()) {
            out.println("Not empty!");
        }
        try {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            if (n1 < 0 || n2 < 0) {
                out.println("input > 0");
            }
             out.print("Number 1 = " + n1 + " and Number2 = " + n2 + "-> Output: ");
            int arr[] = findCommonMultiples(n1, n2);
            for (int i = 0; i < arr.length; i++) {
                out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            out.println("Must be integer!");
        }
    }

    public int[] findCommonMultiples(int num1, int num2) {
        int[] commonMultiples = new int[3];
        int count = 0; // Count of common multiples found

        // Start from 1 and continue until we find 3 common multiples
        for (int i = 1; count < 3; i++) {
            int multiple = num1 * i;

            // Check if the multiple is also a multiple of num2
            if (multiple % num2 == 0) {
                commonMultiples[count] = multiple;
                count++;
            }
        }
        return commonMultiples;
    }
}
