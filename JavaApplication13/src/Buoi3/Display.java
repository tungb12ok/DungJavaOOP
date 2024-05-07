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
public class Display {
    public static void displayList(List<Student> list){
        System.out.format("%-10s%-17s%-25s%-10s%-25s", "ID", "Department", "Name", "Age", "Address");
        System.out.println("");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
