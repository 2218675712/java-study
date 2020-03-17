package day0317.dao.dao;

import day0317.dao.model.User;

public interface UserDao {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    /**
     * 添加用户
     * @param username
     * @param password
     * @param nickname
     * @return
     */
    int addUser(String username,String password,String nickname);

    /**
     * 更改密码
     * @param id
     * @param password
     * @return
     */
    int updatePw(int id,String password);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);
}
