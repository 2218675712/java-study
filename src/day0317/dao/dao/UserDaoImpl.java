package day0317.dao.dao;

import day0317.dao.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao{
    @Override
    public User login(String username, String password) {
        Connection conn=null;
        PreparedStatement pstm=null;
        User user=null;
        ResultSet rs=null;
        try {
            conn=conn();
            String sql="SELECT * FROM student WHERE username=? and password=?";
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,username);
            pstm.setString(2,password);
            rs=pstm.executeQuery();
            if (rs.next()){
                user=new User();
                user.setId(rs.getInt("id"));
                user.setUserName(rs.getString("username"));
                user.setPassWord(rs.getString("password"));
                user.setNickName(rs.getString("nickname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,null,pstm,conn);
        }
        return user;
    }

    @Override
    public int addUser(String username, String password, String nickname) {
        String sql="INSERT INTO student (username,password,nickname) VALUES(?,?,?)";
        List params=new ArrayList();
        params.add(username);
        params.add(password);
        params.add(nickname);
        int num = userExecuteUpdate(sql,params);
        return num;
    }

    @Override
    public int updatePw(int id, String password) {
        String sql="UPDATE student SET password=? where id=?";
        List params=new ArrayList();
        params.add(password);
        params.add(id);
        int num = userExecuteUpdate(sql,params);
        return num;
    }

    @Override
    public int deleteUser(int id) {
        String sql="delete from student WHERE id=?";
        List params = new ArrayList();
        params.add(id);
        int num = userExecuteUpdate(sql,params);
        return num;
    }
}
