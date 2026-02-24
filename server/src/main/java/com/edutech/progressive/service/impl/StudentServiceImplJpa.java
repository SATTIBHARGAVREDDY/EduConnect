package com.edutech.progressive.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Student;
import com.edutech.progressive.repository.StudentRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
@Transactional
public class StudentServiceImplJpa {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplJpa(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() throws Exception {
        try {
            return studentRepository.findAll();
        } catch (DataAccessException ex) {
            throw new Exception("Failed to fetch students", ex);
        }
    }

    public Integer addStudent(Student student) throws Exception {
        try {
            Student saved = studentRepository.save(student);
            return saved != null ? saved.getStudentId() : -1;
        } catch (DataAccessException ex) {
            throw new Exception("Failed to add student", ex);
        }
    }

    public List<Student> getAllStudentSortedByName() throws Exception {
        try {
           
        } catch (DataAccessException ex) {
            throw new Exception("Failed to fetch students sorted by name", ex);
        }
        return null;
    }

    public void updateStudent(Student student) throws Exception {
        try {
            int id = student.getStudentId();
            java.util.Optional<Student> existing = studentRepository.findById(id);
            if (existing.isEmpty()) {
                throw new Exception("Student not found with id: " + id);
            }
            // Make sure the ID remains consistent
            student.setStudentId(id);
            studentRepository.save(student);
        } catch (DataAccessException ex) {
            throw new Exception("Failed to update student", ex);
        }
    }

    public void deleteStudent(int studentId) throws Exception {
        try {
            if (!studentRepository.existsById(studentId)) {
                throw new Exception("Student not found with id: " + studentId);
            }
            studentRepository.deleteById(studentId);
        } catch (DataAccessException ex) {
            throw new Exception("Failed to delete student", ex);
        }
    }

    public Student getStudentById(int studentId) throws Exception {
        try {
            return studentRepository.findById(studentId).orElse(null);
        } catch (DataAccessException ex) {
            throw new Exception("Failed to fetch student by id", ex);
        }
    }

    // Not required on Day-5; kept as a stub for future days
    public void modifyStudentDetails(/* StudentDTO studentDTO */) {
        // No-op for Day-5
    }
}