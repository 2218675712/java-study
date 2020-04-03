package jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestPageAccessURL {
    public void testJNDI() throws NamingException, SQLException {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:comp/env/jndi/mybatis");
        Connection conn = ds.getConnection();
        System.out.println(conn.isClosed());

    }
}
