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
public class EnCoder {
    public static String  shiftEncode(String shift){
        switch (shift){
                case "MORNING":return "M";
                case "EVENING":return "E";
                case "NOON":return "N";
                }
        return shift;
    }    

    public static String groupEncode(String group){
            switch (group){
                case "MEDICAL":return "M";
                case "ENGINEERING":return "E";
                case "COMMERCE":return "C";
                case "GENERAL":return "G";
                }
        return group;   
    }
      public static String genderEncode(String gender){
        switch (gender){
            case "MALE"  :return "M";
            case "FEMALE":return "F";
       
            }
            return gender;
      }
}
