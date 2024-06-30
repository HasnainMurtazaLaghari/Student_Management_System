package DBConnect;
import java.sql.*;

public class facultyDBC {
       public static void main (String arg[]) throws Exception{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("connect");
        try (Connection con = DriverManager.getConnection("jdbc:ucanaccess://E:\\dru\\usindh.accdb")) {
            System.out.println("Successfully Connected with Database");
            String query ="Select fac_id, fac_name, remarks from faculty";
            System.out.println(query);
            try (Statement st = con.createStatement(); ResultSet result = st.executeQuery(query)) {
                while(result.next()){
                    String facId=result.getString("fac_id");
                    String facName=result.getString("fac_Name");
                    String remarks=result.getString("remarks");
                    System.out.println("Fac_id:"+facId);
                    System.out.println("Fac_Name:"+facName);
                    System.out.println("Remarks:"+remarks);
                    System.out.println("*******");
                }
            }
        }
        System.out.println("Close Connection");
        }
  
    
}


//
//

//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class facultyDBC {
//    public static void main(String[] args) throws Exception {
//        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";
//        String username = "your_username";
//        String password = "your_password";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Connecting to the database...");
//            Connection con = DriverManager.getConnection(jdbcURL, username, password);
//                System.out.println("Successfully Connected with the MySQL Database");
//                String query = "SELECT fac_id, fac_name, remarks FROM faculty";
//                System.out.println(query);
//                Statement st = con.createStatement();
//                ResultSet result = st.executeQuery(query);
//                    while (result.next()) {
//                        String facId = result.getString("fac_id");
//                        String facName = result.getString("fac_name");
//                        String remarks = result.getString("remarks");
//                        System.out.println("Fac_id: " + facId);
//                        System.out.println("Fac_Name: " + facName);
//                        System.out.println("Remarks: " + remarks);
//                        System.out.println("*******");
//                    }
//            System.out.println("Database connection closed.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
