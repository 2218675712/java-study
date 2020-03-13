package day0313.dao;

import day0313.dao.dao.UserDao;
import day0313.dao.dao.UserDaoImpl;
import day0313.dao.jdbc.UserLogin;

public class Main {
    public static void main(String[] args) {
//        登录
//        UserLogin ul = new UserLogin();
//        ul.login();
//        用户验证
//        UserDaoImpl userDao=new UserDaoImpl();
//        userDao.login("wcc","123456");
//        添加用户
//        UserDaoImpl userDao = new UserDaoImpl();
//        userDao.addUser("xy", "xy12345", "小杨");
//        更改密码
//        UserDaoImpl userDao = new UserDaoImpl();
//        userDao.updataPw(5,"xyxyxy");
//        删除用户
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.deleteUser(5);
    }
}
