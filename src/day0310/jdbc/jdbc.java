package day0310.jdbc;

import java.sql.*;

public class jdbc {

    public static Connection conn() {
        Connection conn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC", "root", "2218675712");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
