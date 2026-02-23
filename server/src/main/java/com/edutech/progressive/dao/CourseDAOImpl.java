package com.edutech.progressive.dao;
import com.edutech.progressive.dao.CourseDAO;
import com.edutech.progressive.entity.Course;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public int addCourse(Course course) throws SQLException {
        return -1;
    }

    @Override
    public Course getCourseById(int courseId) throws SQLException {
        return null;
    }

    @Override
    public void updateCourse(Course course) throws SQLException {
     
    }

    @Override
    public void deleteCourse(int courseId) throws SQLException {
        
    }

    @Override
    public List<Course> getAllCourses() throws SQLException {
        return Collections.emptyList(); 
    }
}