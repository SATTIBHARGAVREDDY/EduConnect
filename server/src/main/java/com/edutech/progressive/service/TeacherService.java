package com.edutech.progressive.service;

import com.edutech.progressive.dto.TeacherDTO;
import com.edutech.progressive.entity.Teacher;

import java.util.List;
public interface TeacherService {
    List<Teacher> getAllTeachers() throws Exception;
    Integer addTeacher(Teacher teacher) throws Exception;
    List<Teacher> getTeacherSortedByExperience() throws Exception; // used from Day-2 onward
    default void emptyArrayList() {}
    default void updateTeacher(Teacher teacher) throws Exception {}
    default void deleteTeacher(int teacherId) throws Exception {}
    default Teacher getTeacherById(int teacherId) throws Exception { return null; }
}