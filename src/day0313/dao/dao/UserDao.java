package day0313.dao.dao;

import day0313.dao.model.User;

public interface UserDao {
    User login(String username, String pwd);

    int addUser(String username, String pwd, String nickname);

    int updataPw(int id, String password);

    int deleteUser(int id);
}
