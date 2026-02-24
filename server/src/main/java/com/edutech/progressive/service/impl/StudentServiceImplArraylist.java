package com.edutech.progressive.service.impl;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.StudentService;

@Service
public class StudentServiceImplArraylist {

    private static List<Student> studentList = new ArrayList<>();

    // Returns a list of all students stored in the ArrayList
    public List<Student> getAllStudents() {
        return studentList;
    }

    // Adds a new student to the ArrayList and returns the current list size
    public Integer addStudent(Student student) {
        studentList.add(student);
        return studentList.size();
    }

    // Returns all students from the ArrayList sorted by full name
    public List<Student> getAllStudentSortedByName() {
        List<Student> copy = new ArrayList<>(studentList);
        copy.sort(Comparator.comparing(
                s -> s.getFullName() == null ? "" : s.getFullName(),
                String.CASE_INSENSITIVE_ORDER
        ));
        return copy;
    }

    // Clears all students from the ArrayList
    public void emptyArrayList() {
        studentList = new ArrayList<>();
    }
}