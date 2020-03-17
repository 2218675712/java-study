/*
 * 时间:       2020年03月17日21:00:19
 * 目的:       学习jdbc
 * 结果:
 *       ----------------------------------
 *          加入缓冲流
 *       ----------------------------------
 * */
package day0317.dao;

import day0317.dao.jdbc.UserLogin;

public class Main {
    public static void main(String[] args) {
//        MyJdbc myJdbc=new MyJdbc();
//        myJdbc.myPrepa(3,"wcc","qweasd","韦成成");
        UserLogin ul=new UserLogin();
        ul.login();
    }
}
