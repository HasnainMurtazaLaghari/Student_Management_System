/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

/**
 *
 * @author HP
 */
import java.sql.*;

public class departmentDBC {
    public static void main (String arg[]) throws Exception{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("connect");
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\dru\\HostelManagementSystem.accdb")) {
            System.out.println("Successfully Connected with Database");
            String query ="Select fac_id,dept_id ,dept_name, remarks from department";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String facId=result.getString("fac_id");
                    String deptId=result.getString("dept_id");
                    String deptName=result.getString("dept_name");
                    String remarks=result.getString("remarks");
                    System.out.println("Fac_id:"+facId);
                    System.out.println("Dept_id:"+deptId);
                    System.out.println("Dept_Name:"+deptName);
                    System.out.println("Remarks:"+remarks);
                    System.out.println("*******");
                }
            }
        }
        System.out.println("Close Connection");
        }
    
}
