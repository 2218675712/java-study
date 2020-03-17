package day0317.dao.jdbc;

import java.sql.*;

public class MyJdbc {
    /**
     * 数据库连接
     */
    public Connection conn() {
        Connection conn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接
            conn = DriverManager.getConnection(
                    "jdbc:jdbc:mysql://localhost:3306/test03?useSSL=false&serverTimezone=UTC",//连接的数据库地址
                    "root",//账号
                    "2218675712"//密码
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /*
     * statement
     * 方式操作数据库
     */
    public void myState() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            //创建连接
            conn = conn();
            //创建数据库操作statement
            statement = conn.createStatement();
            StringBuffer strB = new StringBuffer();
            strB.append("INSERT INTO student values(0,'xl','333333','小李')");
            int num = statement.executeUpdate(strB.toString()); //增，删，改用executeUpdate
            System.out.println("受影响的行数：" + num);
            /*strB.append("SELECT id,name,age from student");
            rs = statement.executeQuery(strB.toString());
            while (rs.next()){
                System.out.print("姓名："+rs.getString("name"));
                System.out.println("年龄："+rs.getInt("age"));
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * preparedStatement
     * 方式操作数据库
     */
    public void myPrepa(int id, String username, String password, String nickname) {
        Connection conn = conn();
        PreparedStatement pstm = null;
        try {
            //?是占位符
            String sql = "INSERT INTO student VALUES(?,?,?,?)";
//            String sql="delete from my_user where id =?";
            //创建pstm
            pstm = conn.prepareStatement(sql);
            //填充占位符，
            pstm.setInt(1, id);
            pstm.setString(2, username);
            pstm.setString(3, password);
            pstm.setString(4, nickname);
            int num = pstm.executeUpdate();
            System.out.println("受影响的行数：" + num);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
