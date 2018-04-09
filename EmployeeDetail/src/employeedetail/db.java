
package employeedetail;
import java.sql.*;
import javax.swing.*;

public class db {
    Connection conn = null;
    public static  Connection  java_db(){
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/employeepayrol","root","1234");
        return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
        }   
    }
    
}
