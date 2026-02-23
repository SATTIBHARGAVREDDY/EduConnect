package com.edutech.progressive.dao;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class TeacherDAOImpl implements TeacherDAO {

    @Override
    public int addTeacher(Teacher teacher) throws SQLException {
        return -1;
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws SQLException {
        return null; 
    }

    @Override
    public void updateTeacher(Teacher teacher) throws SQLException {
      
    }

    @Override
    public void deleteTeacher(int teacherId) throws SQLException {

    }

    @Override
    public List<Teacher> getAllTeachers() throws SQLException {
        return Collections.emptyList();
    }
}