package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection con;

    public static Connection getDbConnection() throws Exception{
        if(con == null ){
            ResourceBundle bundle = ResourceBundle.getBundle("day8/dbconfig");

            String dc = bundle.getString("jdbc.driverclass");
            String url = bundle.getString("jdbc.url");
            String user = bundle.getString("jdbc.username");
            String pass = bundle.getString("jdbc.password");

            Class.forName(dc);
            con = DriverManager.getConnection(url, user, pass);
        }
        return con;
    }
}
