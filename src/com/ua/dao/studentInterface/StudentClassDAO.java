package com.ua.dao.studentInterface;

import entities.Student;

import java.util.List;

/**
 * Created by Максим on 14.02.2016.
 */
public interface StudentClassDAO {
    public List<Student> getAllStudents();
    public void addAllStudents(List<Student> students);
    public void deleteStudent(Student student);
    public void saveStudent(Student student);
    public void updateStudent(Student student);

}
