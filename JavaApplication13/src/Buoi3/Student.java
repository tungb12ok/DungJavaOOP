/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

/**
 *
 * @author tungl
 */
public class Student extends Person {

    private int id;
    private String department;

    public Student() {
    }

    public Student(int id, String department) {
        this.id = id;
        this.department = department;
    }

    public Student(int id, String department, String name, int age, String address) {
        super(name, age, address);
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%-10d%-17s", id, department) + super.toString();
    }

}
