package Test_HOMEWORK1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import HomeWork1.TheHomeWork1;
/*The home work 1 is solved by the students:
1-  נגים אלדין זועבי 324887983
2-  אחמד זועבי 213027667
 * */

public class AppTst_HW1 {
	TheHomeWork1 NumberComparison=new TheHomeWork1();
	// bring the calss and its methods
	
	public void testRegularComparison() {
        // Positive Test Case 1: A > B
        assertEquals(7, TheHomeWork1.compareNumbers(7, 5, "regular"));

        // Positive Test Case 2: B > A
        assertEquals(15, NumberComparison.compareNumbers(10, 15, "regular"));
    }
	
	 @Test
	    public void testOppositeComparison() {
	        // Positive Test Case 1: Larger negative number
	        assertEquals(5, NumberComparison.compareNumbers(7, 5, "opposite"));
	 }
	 
	 public void testInverseComparison() {
	        // Positive Test Case 1: Reciprocal comparison
	        assertEquals(2, NumberComparison.compareNumbers(4, 2, "inverse"));
	    }
	 
	 //test if there is invalid mode
	 
	    public void testInvalidMode() {
	        // Negative Test Case: Invalid mode
	        NumberComparison.compareNumbers(7, 5, "invalid_mode");
	    }
	    
	    public void testZeroInInverseComparison() {
	        // Negative Test Case: Division by zero
	        NumberComparison.compareNumbers(0, 2, "inverse");
	    }
}
