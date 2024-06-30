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
public class programBean {
    
    private int deptId;
    private int progId;
    private String progName;
    private String durationInSem;
    private String remarks;
    
     
    
    
    public void setDeptId(int deptId){
        this.deptId = deptId;
    }
    public void setProgId(int progId){
        this.progId = progId;
    }
    public void setDurationInSem(String durationInSem){
        this.durationInSem = durationInSem;
    }
    public void setProgName(String progName){
        this.progName = progName; 
    }
     public void setRemarks(String remarks){
        this.remarks = remarks; 
    }
     
    public int getProgId(){
         return progId;
     }
     
     public int getDeptId(){
         return deptId;
     }
     public String getDurationInSem(){
         return durationInSem;
     }
     public String getProgName(){
         return progName;
     }
      public String getRemarks(){
         return remarks;
     }
      @ Override
      public String toString(){
          return progName;
      }

}

    

