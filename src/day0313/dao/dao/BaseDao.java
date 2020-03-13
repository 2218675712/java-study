package day0313.dao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 通用dao
 */
public class BaseDao {
    /**
     * 数据库连接
     */
    public Connection conn(){
        Connection conn=null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC",//连接的数据库地址
                    "root",//账号
                    "2218675712"//密码
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}