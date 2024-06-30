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
public class studentDBC {
     public static void main (String arg[]) throws Exception{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("connect");
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\dru\\usindh.accdb")) {
            System.out.println("Successfully Connected with Database");
            String query ="Select batch_id,std_id,std_name,fname,surname,roll_no , remarks from student";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String batchId=result.getString("batch_id");
                    String stdId=result.getString("std_id");
                    String stdName=result.getString("std_name");
                    String fName=result.getString("fname");
                    String surName=result.getString("surname");
                    String rollNo=result.getString("roll_no");
                    String remarks=result.getString("remarks");
                    System.out.println("ProgId    :"+batchId);
                    System.out.println("BatchId   :"+stdId);
                    System.out.println("BatchYear :"+stdName);
                    System.out.println("fName     :"+fName);
                    System.out.println("surName   :"+surName);
                    System.out.println("rollNo    :"+rollNo);
                    System.out.println("Remarks:"+remarks);
                    System.out.println("*******");
                }
            }
        }
        System.out.println("Close Connection");
        }
}
