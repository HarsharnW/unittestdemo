import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperator {

    CalculateValues calc = new CalculateValues();

    @Test
    public void testAdd()
    {
        Assert.assertEquals(70, calc.addValues(30, 40));
    }

    @Test
    public void testSubtract()
    {
        Assert.assertEquals(60, calc.subtractValues(100, 40));
    }

    @Test
    public void testMultiply()
    {
        Assert.assertEquals(200, calc.multiplyValues(2, 100));
    }
    
    @Test
    public void testDivide()
    {
        Assert.assertEquals(50, calc.divideValues(100, 2));
    }
}
