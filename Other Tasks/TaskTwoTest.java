package MasterCardAssessment;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TaskTwoTest {
    @Test
    public void testReverseStringRecursive() {
        String test1 = "Read this string backwards";
        String test2 = "sdrawkcab gnirts siht daeR";
        String test3 = "";
        assertEquals(test1, TaskTwo.reverseStringRecursive(test2));
        assertEquals(test2, TaskTwo.reverseStringRecursive(test1));
        assertEquals("", TaskTwo.reverseStringRecursive(test3));
    } 
    @Test
    public void testReverseStringIterative() {
        String test1 = "Read this string backwards";
        String test2 = "sdrawkcab gnirts siht daeR";
        String test3 = "";
        assertEquals(test1, TaskTwo.reverseStringIterative(test2));
        assertEquals(test2, TaskTwo.reverseStringIterative(test1));
        assertEquals("", TaskTwo.reverseStringRecursive(test3));
    }
    
}
