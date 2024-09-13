package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    private ConnectionProvider() { }

    public static Connection con=null;

    public static Connection getConnection(){
        if(con==null) {
            try {
                Class.forName(DBConnectionData.DB_DRIVER);
                con = DriverManager.getConnection(DBConnectionData.DB_URL,
                                                  DBConnectionData.DB_USER,
                                                  DBConnectionData.DB_PASSWORD);
                return con;
            } catch (Exception e) {
                e.printStackTrace();
                return con;
            }
        }else{
            return con;
        }
    }
}
