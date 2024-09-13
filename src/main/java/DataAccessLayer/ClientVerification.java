package DataAccessLayer;


import mysqlconnection.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientVerification {

    public static boolean clientExist(String email,String password){
        try{
            Connection con= ConnectionProvider.getConnection();
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("select * From user where email= ? and password = ? ");
            ps.setString(1,email);
            ps.setString(2,password);
            ResultSet rs= ps.executeQuery();
            return rs.next();
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
