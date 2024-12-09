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

}//end of class
