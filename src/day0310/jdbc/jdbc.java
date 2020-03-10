package day0310.jdbc;

import java.sql.*;

public class jdbc {
    public Connection conn() {
        Connection conn = null;
        Statement statement = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC", "root", "2218675712");
            //创建数据库操作statement
            statement = conn.createStatement();
            System.out.println("数据库连接成功！");
            StringBuffer sb = new StringBuffer();
/*            sb.append("INSERT INTO student VALUES (4,'小照',18)");
//            增删改用这个
            int num = statement.executeUpdate(sb.toString());
            System.out.println("受影响的行" + num);*/
//查询用这个
            ResultSet resultSet = statement.executeQuery("select * from student");
//            找它下一个
            while (resultSet.next()) {
                System.out.print("id" + resultSet.getInt("id"));
                System.out.print("姓名" + resultSet.getString("username"));
                System.out.println("年龄" + resultSet.getInt("age"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return conn;
    }

}
