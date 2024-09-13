package DataAccessLayer;

import beans.Employee;
import mysqlconnection.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEmployee {

    public static boolean isObjExist(String id){
        try{
            Connection con=ConnectionProvider.getConnection();
            PreparedStatement ps=con.prepareStatement("");
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    public static boolean saveData(Employee employee){
        try{

        }catch (Exception exception){
            exception.printStackTrace();
        }

    }


}
