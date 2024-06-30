package databaseManager;

import beanClass.*;
import java.sql.*;
import java.util.*;
import java.awt.*;


public class DatabaseManager {
    
private static Connection con;

    
static {
    try{
        init();
    }catch(Exception e){
        e.printStackTrace();
    }
}

private static void init() throws Exception{
     Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        System.out.println("connect");
         con = DriverManager.getConnection("jdbc:ucanaccess://E:\\1.Java\\2.Database\\usindh.accdb");
            System.out.println("Successfully Connected with Database");
     
}


    /**
     *
     * @return
     * @throws Exception
     */
    public static Vector  getFaculty() throws Exception{
        String  query = "select * from faculty";
        System.out.println(query);
        Statement st = null;
        ResultSet result=null;

		try{
		st=con.createStatement();
		result=st.executeQuery(query);
		Vector v= new Vector();

		while(result.next()){
			facultyBean bean = new facultyBean();
			bean.setFacId(result.getInt("fac_id"));
			bean.setFacName(result.getString("fac_name"));
			bean.setRemarks(result.getString("remarks"));
			v.addElement(bean);
		}
		return v;
				
				}finally{
			if (result!=null)
				result.close();
			if(st!=null)
				st.close();
			}

	}
	


public static Vector  getDepartment(int facId) throws Exception{
String  query = "select * from department where fac_id = "+facId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    departmentBean bean = new departmentBean();
    bean.setFacId(result.getInt("fac_id"));
    bean.setDeptId(result.getInt("dept_id"));
    bean.setDeptName(result.getString("dept_name"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }

public static Vector  getProgram(int deptId) throws Exception{
String  query = "select * from program where dept_id= "+deptId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    programBean bean = new programBean();
    
    bean.setDeptId(result.getInt("dept_id"));
    bean.setProgId(result.getInt("prog_id"));
    bean.setProgName(result.getString("prog_name"));
    bean.setDurationInSem(result.getString("duration_in_sem"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }

public static Vector  getBatch(int progId) throws Exception{
String  query = "select * from batch where prog_id = "+progId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    batchBean bean = new batchBean();
    
    bean.setProgId(result.getInt("prog_id"));
     bean.setBatchId(result.getInt("batch_id"));
      bean.setBatchYear(result.getString("batch_year"));
    bean.setShift(result.getString("shift"));
    bean.setGroupDesc(result.getString("group_desc"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }
public static Vector  getStudent(int batchId) throws Exception{
String  query = "select * from student where batch_id = "+batchId;
System.out.println(query);
Statement st = null;
ResultSet result=null;

try{
st=con.createStatement();
result=st.executeQuery(query);
Vector v= new Vector();

while(result.next()){
    studentBean bean = new studentBean();
    
    
     bean.setBatchId(result.getInt("batch_id"));
     bean.setStdId(result.getInt("std_id"));
    bean.setStdName(result.getString("std_name"));
    bean.setFName(result.getString("fname"));
    bean.setSurname(result.getString("surname"));
     bean.setRollNo(result.getString("roll_no"));
     bean.setGender(result.getString("gender"));
    bean.setRemarks(result.getString("remarks"));
    v.addElement(bean);
}
return v;
        
        }finally{
    if (result!=null)
        result.close();
    if(st!=null)
        st.close();
    }

 }

public static int  deleteFaculty (int facId) throws Exception{
    String query= "delete from faculty where fac_id=" +facId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deleteDepartment (int deptId) throws Exception{
    String query= "delete from department where dept_id=" +deptId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deleteProgram (int progId) throws Exception{
    String query= "delete from program where prog_id = " +progId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deleteBatch (int batchId) throws Exception{
    String query= "delete from batch where batch_id = " +batchId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  deleteStudent (int stdId) throws Exception{
    String query= "delete from student where std_id = " +stdId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateFaculty (int facId, String facName,String remarks) throws Exception{
    String query= "update  faculty set  fac_name ='"+facName+"',remarks ='"+remarks+"' where fac_id= " +facId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateDepartment (int facId,int deptId,String deptName,String remarks) throws Exception{
    String query= "update  department set fac_id = "+facId+",dept_Name ='"+deptName+"', remarks='"+remarks+"' where dept_id = " +deptId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateProgram (int deptId,int progId,String progName,String durationInSem,String remarks) throws Exception{
    String query= "update  program set dept_id = "+deptId+" ,prog_name ='"+progName+"',duration_in_sem ='"+durationInSem+"' ,remarks='"+remarks+"'where prog_id =" +progId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateBatch (int progId,int batchId,String batchYear,String shift,String groupDesc,String remarks) throws Exception{
    String query= "update  batch set prog_id ='"+progId+"' ,batch_year ='"+batchYear+"',shift ='"+shift+"' ,group_desc ='"+groupDesc+"',remarks='"+remarks+"' where batch_id =" +batchId ;
  System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  updateStudent (int batchId,int stdId,String stdName,String fName,String surname,String rollNo,String gender,String remarks) throws Exception{
    String query= "update  student set batch_id ="+batchId+" ,std_name ='"+stdName+"',fname ='"+fName+"' ,surname ='"+surname+"',roll_no ='"+rollNo+"',gender ='"+gender+"' ,remarks='"+remarks+"' where std_id = " +stdId ;
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}


public static int  addFaculty(String facName,String remarks) throws Exception{
    String query= "insert into faculty (fac_name,remarks) values('"+facName+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  addDepartment(int facId,String deptName,String remarks) throws Exception{
    String query= "insert into department (fac_id,dept_name,remarks) values("+facId+",'"+deptName+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
 
public static int  addProgram(int deptId,String progName,String durationInSem,String remarks) throws Exception{
    String query= "insert into program (dept_id,prog_name,duration_in_sem,remarks) values("+deptId+",'"+progName+"',"+durationInSem+",'"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

public static int  addBatch(int progId,String batchYear,String shift,String groupDesc,String remarks) throws Exception{
    String query= "insert into batch (prog_id,batch_year,shift,group_desc,remarks) values("+progId+",'"+batchYear+"','"+shift+"','"+groupDesc+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}
public static int  addStudent(int batchId,String stdName,String fName,String surname,String rollNo,String gender,String remarks) throws Exception{
    String query= "insert into student (batch_id,std_name,fname,surname,roll_no,gender,remarks) values("+batchId+",'"+stdName+"','"+fName+"','"+surname+"','"+rollNo+"','"+gender+"','"+remarks+"')"; 
    System.out.println(query);
    Statement st=null;
    try{
        st=con.createStatement();
        int rows=st.executeUpdate(query);
        return rows;
    }finally{
        if(st!=null)
            st.close();
    }
}

    public static int addDepartment(String deptName, String remarks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String arg[]){
        
        
    }

}