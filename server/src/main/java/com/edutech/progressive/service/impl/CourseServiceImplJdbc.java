package com.edutech.progressive.service.impl;

import com.edutech.progressive.dao.CourseDAO;
import com.edutech.progressive.entity.Course;
import com.edutech.progressive.service.CourseService;

import java.util.Collections;
import java.util.List;

public class CourseServiceImplJdbc implements CourseService {

    private final CourseDAO courseDAO;

    public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> getAllCourses() throws Exception {
        return Collections.emptyList(); // placeholder
    }

    @Override
    public Course getCourseById(int courseId) throws Exception {
        return null; // placeholder
    }

    @Override
    public Integer addCourse(Course course) throws Exception {
        return -1; // placeholder
    }

    @Override
    public void updateCourse(Course course) throws Exception {
        // placeholder
    }

    @Override
    public void deleteCourse(int courseId) throws Exception {
        // placeholder
    }
}