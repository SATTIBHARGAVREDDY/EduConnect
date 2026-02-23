package com.edutech.progressive.service;

import com.edutech.progressive.dto.StudentDTO;
import com.edutech.progressive.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents() throws Exception;
    Integer addStudent(Student student) throws Exception;
    List<Student> getAllStudentSortedByName() throws Exception; // used from Day-2 onward
    default void emptyArrayList() {}
    default void updateStudent(Student student) throws Exception {}
    default void deleteStudent(int studentId) throws Exception {}
    default Student getStudentById(int studentId) throws Exception { return null; }
}