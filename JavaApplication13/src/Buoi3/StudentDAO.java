/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tungl
 */
public class StudentDAO implements IStudent {

    private List<Student> list;

    public StudentDAO() {
        list = new ArrayList<>();
    }

    @Override
    public boolean addStudent(Student s) {
        if (getStudentByID(s.getId()) != null) {
            return false;
        }
        list.add(s);
        return true;
    }

    @Override
    public boolean updateStudent(Student s) {
        Student studentUpdate = getStudentByID(s.getId());
        if (studentUpdate != null) {
            studentUpdate.setAddress(s.getAddress());
            studentUpdate.setDepartment(s.getDepartment());
            studentUpdate.setName(s.getName());
            studentUpdate.setAge(s.getAge());
            return true;
        }
        return false;
    }

    @Override
    public List<Student> getAllStudent() {
        return list;
    }

    @Override
    public Student getStudentByID(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        Student studentUpdate = getStudentByID(id);
        if (studentUpdate != null) {
            list.remove(studentUpdate);
            return true;
        }
        return false;
    }

}
