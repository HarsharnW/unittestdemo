import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd()
    {
        Assert.assertEquals(70, calc.add(30, 40));
    }

    @Test
    public void testSubtract()
    {
        Assert.assertEquals(60, calc.subtract(100, 40));
    }

    @Test
    public void testMultiply()
    {
        Assert.assertEquals(200, calc.multiply(2, 100));
    }
    
    @Test
    public void testDivide()
    {
        Assert.assertEquals(50, calc.divide(100, 2));
    }
}
