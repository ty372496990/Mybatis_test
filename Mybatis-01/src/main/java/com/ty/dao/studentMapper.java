package com.ty.dao;

import com.ty.pojo.Student;

import java.util.List;

public interface studentMapper {
    List<Student> getStudent();
    Student getStudentById(int id);
    int addStudent(Student student);
    int updateStudent(Student student);
    void deleteStudent(int id);
}
