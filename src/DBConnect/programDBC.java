/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import java.sql.*;

/**
 *
 * @author HP
 */
public class programDBC {
     public static void main (String arg[]) throws Exception{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("connect");
            try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\dru\\usindh.accdb")) {
            System.out.println("Successfully Connected with Database");
            String query ="Select * from classes";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String deptId=result.getString("dept_id");
                    String progId=result.getString("prog_id");
                    String progName=result.getString("prog_name");
                    String durationInSem=result.getString("duration_in_sem");
                    String remarks=result.getString("remarks");
                    System.out.println("Dept_id:"+deptId);
                    System.out.println("Prog_id:"+progId);
                    System.out.println("Prog_Name:"+progName);
                     System.out.println("duration_in_sem:"+durationInSem);
                    System.out.println("Remarks:"+remarks);
                    System.out.println("*******");
                }
            }
        }
        System.out.println("Close Connection");
        }
}
