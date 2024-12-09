
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Project2 {
	
	
	public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        
		List<Integer> evens = new ArrayList<>();
        
        for (Integer num : numbers) {
            
        	if (num % 2 == 0) {
                evens.add(num);
           
            }//end of if statement 
        	
        }//end of for loop 
        
        return evens;
    
	}//end of getEvenNumbers method

}//end of class 
