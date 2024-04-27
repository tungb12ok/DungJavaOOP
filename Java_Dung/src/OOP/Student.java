/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author tungl
 */
// access modify, class: key,  Student: tên class- tên d?i tu?ng
// 1 c
public class Student extends Person {

    // Student infor -- Attribute: thu?c tính
    String name;
    int age;
    boolean gender;
    String classes;
    String rollno;

    // constructor default
    public Student() {
    }

    public Student(String name, int age, boolean gender, String classes, String rollno, String identify, String address) {
        // super: key tham chieu 
        super(identify, address);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.classes = classes;
        this.rollno = rollno;
    }

    // get and set method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return super.identify + " " + name;
    }

}
