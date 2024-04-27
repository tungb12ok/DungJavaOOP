/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tungl
 */
public class IColection {

    public static void main(String[] args) {
        String s1 = "String 1";
        String s2 = "String 2";
        String s3 = "String 3";
        String s4 = "String 4";
        String s5 = "String 5";

        List<String> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        int index = 0;
        list.remove(1);
        
        for (String i : list) {
            System.out.println("index " + index + ": " + i);
            index++;
        }
    }
}
