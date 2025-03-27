import controller.CourseController;
import model.Course;

import java.sql.SQLException;

public class CourseApp {
    public static void main(String[] args) throws SQLException {
        CourseController courseController = new CourseController();
//        Course course = Course.builder()
//                .name("Coder Pranay")
//                .description("Complete coding")
//                .duration("1 Year")
//                .fees(100000)
//                .build();
//        courseController.addCourse(course);

        Course course = Course.builder()
                .id(1)
                .name("Coder Pranay")
                .description("Complete coding")
                .duration("1 Year")
                .fees(100000)
                .build();
        courseController.editCourse(course);
    }
}
