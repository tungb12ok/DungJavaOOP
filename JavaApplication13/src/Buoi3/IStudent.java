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
public interface IStudent {
    public boolean addStudent(Student s);
    public boolean updateStudent(Student s);
    public List<Student> getAllStudent();
    public Student getStudentByID(int id);
    public boolean deleteStudent(int id);
}
