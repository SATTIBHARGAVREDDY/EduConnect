package com.edutech.progressive.controller;

import com.edutech.progressive.entity.Student;
import com.edutech.progressive.service.impl.StudentServiceImplArraylist;
import com.edutech.progressive.service.impl.StudentServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentServiceImplJpa studentServiceImplJpa;
    private final StudentServiceImplArraylist studentServiceImplArraylist;

    @Autowired
    public StudentController(StudentServiceImplJpa studentServiceImplJpa,
                             StudentServiceImplArraylist studentServiceImplArraylist) {
        this.studentServiceImplJpa = studentServiceImplJpa;
        this.studentServiceImplArraylist = studentServiceImplArraylist;
    }

    // GET /student
    @GetMapping
    public List<Student> getAllStudents() throws Exception {
        return studentServiceImplJpa.getAllStudents();
    }

    // GET /student/{studentId}
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) throws Exception {
        return studentServiceImplJpa.getStudentById(studentId);
    }

    // GET /student/fromArrayList
    @GetMapping("/fromArrayList")
    public List<Student> getAllStudentFromArrayList() {
        return studentServiceImplArraylist.getAllStudents();
    }

    // GET /student/fromArrayList/sorted
    @GetMapping("/fromArrayList/sorted")
    public List<Student> getAllStudentSortedByNameFromArrayList() {
        return studentServiceImplArraylist.getAllStudentSortedByName();
    }

    // POST /student  (JPA) -> MUST return 201 Created
    @PostMapping
    public ResponseEntity<Integer> addStudent(@RequestBody Student student) throws Exception {
        Integer id = studentServiceImplJpa.addStudent(student);
        if (id == null) id = -1;
        return ResponseEntity.status(201).body(id);
    }

    // POST /student/toArrayList  (ArrayList) -> MUST return 201 Created
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
        Integer sizeOrId = studentServiceImplArraylist.addStudent(student);
        if (sizeOrId == null) sizeOrId = -1;
        return ResponseEntity.status(201).body(sizeOrId);
    }

    // PUT /student/{studentId}
    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student) throws Exception {
        student.setStudentId(studentId);
        studentServiceImplJpa.updateStudent(student);
    }

    // DELETE /student/{studentId}
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable int studentId) throws Exception {
        studentServiceImplJpa.deleteStudent(studentId);
    }
}