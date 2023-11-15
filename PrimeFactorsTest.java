// tests
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

//tests
public class PrimeFactorsTest 
{
    @Test
    public void testOne()
    {
        assertEquals(listOf(), factorsOf(1));
    }

    @Test
    public void testTwo()
    {
        assertEquals(listOf(2), factorsOf(2));
    }

    @Test
    public void testThree()
    {
        assertEquals(listOf(3), factorsOf(3));
    }

    @Test
    public void testFour()
    {
        assertEquals(listOf(2, 2), factorsOf(4));
    }

    @Test
    public void testFive()
    {
        assertEquals(listOf(2, 3), factorsOf(6));
    }

    @Test
    public void testSix()
    {
        assertEquals(listOf(2, 2, 2), factorsOf(8));
    }

    @Test
    public void testSeven()
    {
        assertEquals(listOf(3, 3), factorsOf(9));
    }

    /**
     * Generates a list of values from the provided sequence
     * @param values sequence of values to create a list of
     * @return list of values
     */
    private static List<Integer> listOf(int... values)
    {
        List<Integer> result = new ArrayList<Integer>();
        for(int value : values)
        {
            result.add(value);
        }
        return result;
    }

    /**
     * Resolves list of prime factors for value
     * @param value given value to resolve
     * @return list of prime factors
     */
    private static List<Integer> factorsOf(int value)
    {
        PrimeFactors primeFactors = new PrimeFactors();
        return primeFactors.resolve(value);
    }
}