package day0317.dao.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public class BaseDao {
    private static String driver;
    private static String url;
    private static String userName;
    private static String passWord;

    //静态块
    static {
        init();
    }

    /*
     * 读取配置文件
     */
    public static void init() {
        Properties pts = new Properties();
        String fileName = "database.properties";
        InputStream is = day0313.dao.dao.BaseDao.class.getClassLoader().getResourceAsStream(fileName);
        try {
            pts.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = pts.getProperty("drive");
        url = pts.getProperty("url");
        userName = pts.getProperty("username");
        passWord = pts.getProperty("password");
    }

    /*
     * 数据库连接
     */
    public Connection conn() {
        Connection conn = null;
        try {
//            加载驱动
            Class.forName(BaseDao.driver);
//            创建连接
            conn = DriverManager.getConnection(
                    BaseDao.url,//连接的数据库地址
                    BaseDao.userName,//账号
                    BaseDao.passWord //密码
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭所有连接
     *
     * @param rs
     * @param st
     * @param pstm
     * @param conn
     */
    public void closeAll(ResultSet rs, Statement st, PreparedStatement pstm, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 增删改操作
     * @param sql
     * @param params
     * @return
     */
    public int userExecuteUpdate(String sql, List params){
        Connection conn=null;
        PreparedStatement pstm=null;
        int num =0;
        try{
            conn=conn();
            pstm=conn.prepareStatement(sql);
            for (int i = 0; i < params.size(); i++) {
                pstm.setObject(i+1,params.get(i));
            }
            num = pstm.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(null,null,pstm,conn);
            return num;
        }
    }
}