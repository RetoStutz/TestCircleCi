import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator myCalculator = new Calculator();

    @Test
    public void testAdd (){
        Assert.assertEquals(myCalculator.add(2,3),5);
    }


}
