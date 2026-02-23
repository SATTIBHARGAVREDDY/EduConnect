package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

import java.util.Collections;
import java.util.List;

public class StudentServiceImplJdbc implements StudentService {

    private final StudentDAO studentDAO;

    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        return Collections.emptyList(); // placeholder
    }

    @Override
    public Integer addStudent(Student student) throws Exception {
        return -1;
    }

    @Override
    public List<Student> getAllStudentSortedByName() throws Exception {
        return Collections.emptyList(); 
    }

    @Override
    public void updateStudent(Student student) throws Exception {

    }

    @Override
    public void deleteStudent(int studentId) throws Exception {

    }

    @Override
    public Student getStudentById(int studentId) throws Exception {
        return null; 
    }
}