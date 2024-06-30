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
public class batchBean{
   
    private int progId;
    private int batchId;
    private String  batchYear;
    private String shift;
    private String group;
    private String remarks;
    
    
    
    public void setProgId(int progId){
        this.progId = progId;
    }
    public void setBatchId(int batchId ){
        this.batchId = batchId;
    }
    public void setBatchYear(String batchYear){
        this.batchYear = batchYear; 
    }
   
     public void setShift(String shift){
        this.shift = shift; 
    }
     public void setGroupDesc(String group){
        this.group = group; 
    }
      public void setRemarks(String remarks){
        this.remarks = remarks; 
    }
   
     
        public int getProgId(){
         return progId;
      }
     public int getBatchId(){
         return batchId;
     }
     public String getBatchYear(){
         return batchYear;
     }
     public String getShift(){
         return shift;
     }
     public String getGroupDesc(){
         return group;
     }
      public String getRemarks(){
         return remarks;
     }
      public String toString(){
          return batchYear;
      }
    
}
