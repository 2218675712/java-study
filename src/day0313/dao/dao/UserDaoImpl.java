package day0313.dao.dao;

import day0313.dao.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static day0310.jdbc.jdbc.conn;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User login(String username, String pwd) {
        Connection conn = null;
        PreparedStatement pstm = null;
        User user = null;
        ResultSet rs = null;
        try {
            conn = conn();
            String sql = "SELECT * FROM student WHERE username=? and pwd=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, pwd);
            rs = pstm.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("username"));
                user.setPwd(rs.getString("pwd"));
                user.setNickName(rs.getString("nickname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return user;
    }

    @Override
    public int addUser(String username, String pwd, String nickname) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int num = 0;
        try {
            conn = conn();
            String sql = "insert into student values (?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, 0);
            pstm.setString(2, username);
            pstm.setString(3, pwd);
            pstm.setString(4, nickname);
            num = pstm.executeUpdate();
            System.out.println("受影响的行" + num);
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
        return num;
    }

    @Override
    public int updataPw(int id, String pwd) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int num = 0;
        try {
            conn = conn();
            String sql = " UPDATE student SET pwd=? WHERE id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pwd);
            pstm.setInt(2, id);
            num = pstm.executeUpdate();
            System.out.println("受影响的行" + num);
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
        return num;
    }

    @Override
    public int deleteUser(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int num = 0;
        try {
            conn = conn();
            String sql = " DELETE FROM student WHERE id=?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            num = pstm.executeUpdate();
            System.out.println("受影响的行" + num);
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
        return num;
    }
}
