package controller;

import model.Course;
import service.CourseService;

import java.sql.SQLException;

public class CourseController {
    CourseService courseService =new CourseService();
    public void addCourse(Course course) throws SQLException {
        courseService.addCourse(course);
    }
    public void editCourse(Course course) throws SQLException {
        courseService.editCourse(course);
    }
}
