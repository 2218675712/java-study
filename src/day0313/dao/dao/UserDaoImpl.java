package day0313.dao.dao;

import day0313.dao.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static day0310.jdbc.jdbc.conn;

public class UserDaoImpl implements UserDao {

    @Override
    public User login(String username, String pwd) {
        Connection conn = null;
        PreparedStatement pstm = null;
        User user = null;
        ResultSet rs = null;
        try {
            conn = conn();
            String sql = "SELECT * FROM my_user t WHERE t.username=? and t.password=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, pwd);
            pstm.executeQuery();
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
        return 0;
    }

    @Override
    public int updataPw(int id, String password) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
