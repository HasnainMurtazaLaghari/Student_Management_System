/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanClass;

/**
 *
 * @author HP
 */
public class studentBean {
    
    private int batchId;
    private int stdId;
    private String rollNo;
    private String stdName;
    private String fName;
    private String surname;
    private String gender;
    private String Remarks;
   
    
    
    
    
    public void setBatchId(int batchId ){
        this.batchId = batchId;
    }
    public void setStdId(int stdId ){
        this.stdId = stdId;
    }
    public void setStdName(String stdName ){
        this.stdName = stdName;
    }
    public void setFName(String fName ){
        this.fName = fName;
    }
    public void setSurname(String surname ){
        this.surname = surname;
    }
    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
   
     
      public void setRemarks(String Remarks){
        this.Remarks = Remarks; 
    }
     
     
    
     
    

     
     public int getBatchId(){
         return batchId;
     }
     public int getStdId(){
         return stdId;
     }
     
     public String getStdName(){
         return stdName;
     }
     public String getFName(){
         return fName;
     }
      public String getSurname(){
         return surname;
     }
      public String getRollNo(){
          return rollNo;
      }
      public String getGender(){
          return gender;
      }
     public String getRemarks(){
         return Remarks;
     }
     @ Override
     public String toString(){
         return " "+rollNo;
     }
    
}
