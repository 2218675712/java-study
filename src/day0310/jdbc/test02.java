/*
 * 时间:       2020年3月11日15:21:04
 * 目的:       学习jdbc
 * 结果:
 *       ----------------------------------
 *          加入缓冲流
 *       ----------------------------------
 * */
package day0310.jdbc;


import java.sql.*;

public class test02 {
    public static void main(String[] args) {
        myState(9, "admin", 18);

    }

    /*
     * preparedStatement
     * 方式操作数据库
     */
    public static void myState(int id, String username, int age) {
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            //创建连接
            conn = jdbc.conn();
            System.out.println("数据库连接成功");
            //?是占位符
            String sql = "INSERT INTO student VALUES(?,?,?)";
//            创建psvm
            pstm = conn.prepareStatement(sql);
            //填充占位符
            pstm.setInt(1, id);
            pstm.setString(2, username);
            pstm.setInt(3, age);
            int num = pstm.executeUpdate();
            System.out.println("受影响的行数：" + num);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


