package day0313.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myjdbc {
    //    数据库连接
    public Connection conn() {
        Connection conn = null;
        try {
//            加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            创建连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC", "root", "2218675712");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
