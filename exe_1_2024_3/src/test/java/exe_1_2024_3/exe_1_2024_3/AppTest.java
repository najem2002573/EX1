package exe_1_2024_3.exe_1_2024_3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
	quest4 tester=new quest4();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    public void test_case_1() {
    	String expected_result="A";
    	int a=28, b=24;
    	String mod="regular";
    	String acttester=tester.compare(a, b, mod);
    	
    	assertEquals(expected_result,acttester);
    }
  
}

