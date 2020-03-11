package day0310.jdbc;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test01 {
    public static void main(String[] args) {
        myState();

    }

    /*
     * statement
     * 方式操作数据库
     */
    public static void myState() {
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            //创建连接
            conn = jdbc.conn();
            //创建数据库操作statement
            statement = conn.createStatement();
            System.out.println("数据库连接成功");
            StringBuffer strB = new StringBuffer();
            strB.append("INSERT INTO student values(5,'张三',20)");
            int num = statement.executeUpdate(strB.toString()); //增，删，改用executeUpdate
            System.out.println("受影响的行数：" + num);
            /*
            strB.append("SELECT * from student");
            rs = statement.executeQuery(strB.toString());
            while (rs.next()){
                System.out.print("姓名："+rs.getString("username"));
                System.out.println("年龄："+rs.getInt("age"));
            }
            */
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            release(rs, statement, conn);
        }
    }

    public static void release(ResultSet rs, Statement statement, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}


