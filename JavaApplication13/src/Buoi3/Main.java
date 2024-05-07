/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.util.List;

/**
 *
 * @author tungl
 */
public class Main {

    public static void main(String[] args) {
        Student s = new Student(1, "SE", "Tung", 20, "HN");

        StudentDAO sDAO = new StudentDAO();
        boolean flag = sDAO.addStudent(s);

        System.out.println("Sau khi add");

        if (flag) {
            System.out.println("add Successfuly!");
        } else {
            System.out.println("add failed!");
        }
        
        Display.displayList(sDAO.getAllStudent());

    }
}
