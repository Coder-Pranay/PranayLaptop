package util;

import constant.Mysql;
import lombok.Getter;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constant.Mysql.*;

@Getter
public class ConnectionUtil {
    @Getter
   private static Connection connection;

    static {
        try {
            Class.forName(Mysql.DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection not found");
        }
    }
}
