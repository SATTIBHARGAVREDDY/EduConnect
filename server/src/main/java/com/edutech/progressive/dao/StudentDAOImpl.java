package com.edutech.progressive.dao;

import com.edutech.progressive.dao.StudentDAO;
import com.edutech.progressive.entity.Student;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public int addStudent(Student student) throws SQLException {
        return -1;
    }

    @Override
    public Student getStudentById(int studentId) throws SQLException {
        return null; 
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
      
    }

    @Override
    public void deleteStudent(int studentId) throws SQLException {
    }

    @Override
    public List<Student> getAllStudents() throws SQLException {
        return Collections.emptyList();
    }
}
