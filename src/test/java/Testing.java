import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Testing {

	 @Test
	    public void testGetEvenNumbers() {
	        
		 	List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
	        
		 	List<Integer> expected = Arrays.asList(2, 4, 6);

	        List<Integer> actual = Project2.getEvenNumbers(input);

	        assertEquals(expected, actual, "getEvenNumbers() did not return the expected list of even numbers.");
	    }//end of testGetEvenNumbers method
	 
	 
	 @Test
	    public void testConvertToUpperCase() {
	        String input = "hello world";
	        String expected = "HELLO WORLD";

	        String actual = Project2.convertToUpperCase(input);

	        assertEquals(expected, actual, "convertToUpperCase() did not return the expected uppercase string.");

	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            Project2.convertToUpperCase(null);
	        });

	        assertEquals("Input string cannot be null.", exception.getMessage(), "Expected IllegalArgumentException for null input.");
	    
	 }//end of testConverttoUpperCase

}//end of class
