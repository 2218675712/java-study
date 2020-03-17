package day0317.dao.dao;

import java.util.Scanner;

public class DaoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("请输入用户名：");
        String userName=input.next();
        System.out.println("请输入密码：");
        String password=input.next();
*/
        UserDao userDao=new UserDaoImpl();
       /* //登录
        User user = userDao.login(userName,password);
        if (user==null){
            System.out.println("用户名或密码输入有误！");
        }else {
            System.out.println("用户："+user.getName()+"登录成功！");
        }*/
       /*//添加
        System.out.println("请输入姓名：");
        String name=input.next();
        int num = userDao.addUser(userName,password,name);
        if (num<=0){
            System.out.println("添加失败！");
        }else{
            System.out.println("添加成功！");
        }*/

        //更新密码
        System.out.println("请输入ID：");
        int id=input.nextInt();
        System.out.println("请输入新密码：");
        String npassrowd=input.next();
        int num = userDao.updatePw(id,npassrowd);
        if (num<=0){
            System.out.println("更新失败！");
        }else{
            System.out.println("更新成功！");
        }

        /*//删除用户
        System.out.println("请输入ID：");
        int id=input.nextInt();
        int num = userDao.deleteUser(id);
        if (num<=0){
            System.out.println("删除失败！");
        }else{
            System.out.println("删除成功！");
        }*/
    }
}
