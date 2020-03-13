package day0313.dao.jdbc;

import java.sql.*;
import java.util.Scanner;

public class UserLogin {
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = scanner.next();
        System.out.println("请输入密码");
        String pwd = scanner.next();
        Connection conn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC",//连接的数据库地址
                    "root",//账号
                    "2218675712"//密码
            );
            String sql = "SELECT * FROM student t WHERE t.username=? and t.pwd=? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, userName);
            pstm.setString(2, pwd);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                System.out.println("登录成功！欢迎用户" + rs.getString("nickname"));
            } else {
                System.out.println("登录失败！账号密码输入有误！");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
