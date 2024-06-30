/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncoderAndDecoder;

/**
 *
 * @author HP
 */
public class DeCoder {
    public static String shiftDecode(String shift){
        switch (shift){
            case "M":return "MORNING";
            case "E":return "EVENING";
            case "N":return "NOON";
            }
    return shift;   
}
    
     public static String groupDecode(String group){
        switch (group){
            case "M":return "MEDICAL";
            case "E":return "ENGINEERING";
            case "C":return "COMMERCE";
            case "G":return "GENERAL";
            }
    return group;   
}
      public static String genderDecode(String gender){
        switch (gender){
            case "M":return "MALE";
            case "F":return "FEMALE";
       
            }
    return gender;
      }
}