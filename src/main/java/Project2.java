import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Project2 {
	

    /**
     * Returns all even numbers in the given list.
     * 
     * @param numbers List of integers to filter.
     * @return List of even integers.
     */
	
	
	public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        
		List<Integer> evens = new ArrayList<>();
        
        for (Integer num : numbers) {
            
        	if (num % 2 == 0) {
                evens.add(num);
           
            }//end of if statement 
        	
        }//end of for loop 
        
        return evens;
    
	}//end of getEvenNumbers method
	
	
	
	 /**
     * Converts all characters in the given string to uppercase.
     * 
     * @param input The string to convert.
     * @return A new string with all characters in uppercase.
     */
	
	
	public static String convertToUpperCase(String input) {
        
		if (input == null) {
            
        	throw new IllegalArgumentException("Input string cannot be null.");
        
        }//end of if statement
        
        return input.toUpperCase();
    
	}//end of convertToUpperCase
	
	
	
	
	public static String getLongestString(List<String> strings) {
		
        if (strings == null || strings.isEmpty()) {
        	
            throw new IllegalArgumentException("Input list cannot be null or empty.");
        
        }//end of if statement 
        
        String longest = "";
        
        for (String str : strings) {
            
        	if (str.length() > longest.length()) {
                
            	longest = str;
                
            }//end of if statement
            
        }//end of for loop 
        
        return longest;
    
	}//end of getLongestString

}//end of class 
