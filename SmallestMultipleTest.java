package smallest.multiple;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Szmolke
 */
public class SmallestMultipleTest {
    
    /**
     * Test of smallestMultiple method, of class SmallestMultiple.
     */
    @Test
    public void testSmallestMultiple() {
        System.out.println("smallestMultiple");
        int upperLimit = 10;
        int expResult = 2520;
        int result = SmallestMultiple.smallestMultiple(upperLimit);
        assertEquals(expResult, result);
    }

    /**
     * Test of highestPrime method, of class SmallestMultiple.
     */
    @Test
    public void testHighestPrime() {
        System.out.println("highestPrime");
        short maxNum = 100;
        short expResult = 97;
        short result = SmallestMultiple.highestPrime(maxNum);
        assertEquals(expResult, result);
    }    
}
