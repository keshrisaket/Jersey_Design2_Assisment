package ServiceLayer;

import DataAccessLayer.InsertEmployee;
import beans.Employee;


public class InsertObject {

    public  static boolean checkObjectExist(Employee employee){
        boolean objExist=InsertEmployee.isObjExist(employee.getId());
        if(objExist){
            return true;
        }else {
           return false;
        }
    }

    public  static boolean saveObject(Employee employee){
       boolean val=InsertEmployee.saveData(employee);
       return val;
    }

}