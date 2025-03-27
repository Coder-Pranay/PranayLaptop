package dao;

import model.Course;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDao {
    public void addCourse(Course course) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into course(name,description,duration,fees)values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,course.getName());
        preparedStatement.setString(2,course.getDescription());
        preparedStatement.setString(3,course.getDuration());
        preparedStatement.setInt(4,course.getFees());
        System.out.println("data inserted successfully");
        preparedStatement.executeUpdate();
        connection.close();


    }

    public void editCourse(Course course) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String sql ="update course set name=?,description=?,duration=?,fees=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,course.getName());
        preparedStatement.setString(2,course.getDescription());
        preparedStatement.setString(3,course.getDuration());
        preparedStatement.setInt(4,course.getFees());
        preparedStatement.setInt(5,course.getId());
        preparedStatement.executeUpdate();
        connection.close();
    }

}
