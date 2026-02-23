package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;
import com.edutech.progressive.service.TeacherService;

import java.util.Collections;
import java.util.List;

public class TeacherServiceImplJdbc implements TeacherService {

    private final TeacherDAO teacherDAO;

    public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return Collections.emptyList(); // placeholder
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        return -1; // placeholder
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        return Collections.emptyList(); 
    }

    @Override
    public void updateTeacher(Teacher teacher) throws Exception {

    }

    @Override
    public void deleteTeacher(int teacherId) throws Exception {
        
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws Exception {
        return null; 
    }
}