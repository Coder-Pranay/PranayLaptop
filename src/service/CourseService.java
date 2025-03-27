package service;

import dao.CourseDao;
import model.Course;

import java.sql.SQLException;

public class CourseService {
    CourseDao courseDao= new CourseDao();
    public void addCourse(Course course) throws SQLException {
        courseDao.addCourse(course);
    }

    public void editCourse(Course course) throws SQLException {
        courseDao.editCourse(course);
    }
}
