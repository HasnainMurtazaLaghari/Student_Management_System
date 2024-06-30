/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class batchDBC {
    
    public static void main (String arg[]) throws Exception{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\dru\\usindh.accdb")) {
            System.out.println("Successfully Connected with Database");
            String query ="Select * from batch";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String progId=result.getString("prog_id");
                    String batchId=result.getString("batch_id");
                    String batcYear=result.getString("batch_year");
                    String shift=result.getString("shift");
                    String groupDesc=result.getString("group_desc");
                    String remarks=result.getString("remarks");
                    System.out.println("ProgId    :"+progId);
                    System.out.println("BatchId   :"+batchId);
                    System.out.println("BatchYear :"+batcYear);
                    System.out.println("Shift     :"+shift);
                    System.out.println("groupDesc :"+groupDesc);
                    System.out.println("Remarks:"+remarks);
                    System.out.println("*******");
                }
            }
        }
        System.out.println("Close Connection");
        }
}
