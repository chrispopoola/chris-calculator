package MasterCardAssessment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TaskTwoTest {

    @Test
    public void testReverseStringRecursiveNull() {
        String test = null;
        assertNull(TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeNull() {
        String test = null;
        assertNull(TaskTwo.reverseStringIterative(test));
    }
    @Test
    public void testReverseStringRecursiveEmpty() {
        String test = "";
        assertEquals("", TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeEmpty() {
        String test = "";
        assertEquals("", TaskTwo.reverseStringIterative(test));
    }
    @Test
    public void testReverseStringRecursiveOneChar() {
        String test = "a";
        assertEquals("a", TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeOneChar() {
        String test = "z";
        assertEquals("z", TaskTwo.reverseStringIterative(test));
    }
    @Test 
    public void testReverseStringRecursiveTwoChar() {
        String test = "ab";
        assertEquals("ba", TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeTwoChar() {
        String test = "ba";
        assertEquals("ab", TaskTwo.reverseStringIterative(test));
    }
    @Test
    public void testReverseStringRecursiveThreeChar() {
        String test = "raw";
        assertEquals("war", TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeThreeChar() {
        String test = "war";
        assertEquals("raw", TaskTwo.reverseStringIterative(test));
    }
    @Test
    public void testReverseStringRecursiveBackForward() {
        String test = "rats";
        assertEquals("stars", TaskTwo.reverseStringRecursive(test));
    }
    @Test
    public void testReverseStringIterativeBackForward() {
        String test = "stars";
        assertEquals("rats", TaskTwo.reverseStringIterative(test));
    }

    @Test
    public void testReverseStringRecursiveSentence() {
        String test1 = "Read this string backwards";
        String test2 = "sdrawkcab gnirts siht daeR";
        assertEquals(test1, TaskTwo.reverseStringRecursive(test2));
        assertEquals(test2, TaskTwo.reverseStringRecursive(test1));
    } 
    @Test
    public void testReverseStringIterativeStentence() {
        String test1 = "Read this string backwards";
        String test2 = "sdrawkcab gnirts siht daeR";
        assertEquals(test1, TaskTwo.reverseStringIterative(test2));
        assertEquals(test2, TaskTwo.reverseStringIterative(test1));
    }
}
