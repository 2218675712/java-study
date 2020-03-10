package day0310.jdbc;


import java.sql.Connection;

public class test01 {
    public static void main(String[] args) {
        Connection connection = new jdbc().conn();
        System.out.println(connection);
    }

}
