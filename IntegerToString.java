import java.util.*;
import java.io.*;
 
class IntegerToString {
 
    
    public static void main(String[] args)
    {
        
        int number = 110102;
 
        
        String string_number = Integer.toString(number);
 
        
        for (int i = 0; i < string_number.length(); i++) {
 
            
            System.out.println(string_number.charAt(i));
        }
    }
}
