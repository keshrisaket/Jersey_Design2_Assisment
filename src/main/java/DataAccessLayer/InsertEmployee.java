package DataAccessLayer;

import beans.Employee;
import mysqlconnection.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertEmployee {

    public static boolean isObjExist(String id){
        try{
            Connection con=ConnectionProvider.getConnection();
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("SELECT * FROM employee where sno = ?");
            ps.setInt(1,Integer.parseInt(id));
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
       return false;
    }



    public static boolean saveData(Employee employee){
        try{
            Connection con=ConnectionProvider.getConnection();
            System.out.println(con);
            PreparedStatement ps=con.prepareStatement("insert into employee (name, age, address, sal) value(?, ? , ? , ? )");
            ps.setString(1,employee.getName());
            ps.setFloat(2,employee.getAge());
            ps.setString(3,employee.getAddress());
            ps.setDouble(4,employee.getSal());
            int res=ps.executeUpdate();
            return res > 0;
        }catch (Exception exception){
            exception.printStackTrace();
            return false;
        }
    }


}
