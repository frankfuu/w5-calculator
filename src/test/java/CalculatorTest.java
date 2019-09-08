import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void addZeroTest() {
        assertEquals(c.add(1,333), 1, "1+0 should be 1");
    }

    @Test
    public void addNegativeTest() {
        assertEquals(c.add(1,-3), -2, "1+(-3) should be -2");
    }

    @Test
    public void addPositiveTest() {
        assertEquals(c.add(1, 7), 8, "1+7 should be 8");
    }

    @Test
    public void subtractZeroTest() {
        assertEquals(c.subtract(1,0), 1, "1-0 should be 1");
    }

    @Test
    public void subtractNegativeTest() {
        assertEquals(c.subtract(1,-3), 4, "1-(-3) should be 4");
    }

    @Test
    public void subtractTwoNegativeTest() {
        assertEquals(c.subtract(-4,-5), 1, "-4-(-5) should be 1");
    }

    @Test
    public void multplyByOneTest() {
        assertEquals(c.multiply(1, 7), 7, "1*7 should be 7");
    }

    @Test
    public void multiplyByZeroTest() {
        assertEquals(c.multiply(1,0), 0, "1*0 should be 0");
    }

    @Test
    public void multiplyNegativeToPositiveTest() {
        assertEquals(c.multiply(1,-3), -3, "1*(-3) should be -3");
    }

    @Test
    public void multiplyTwoNegativeTest() {
        assertEquals(c.multiply(-3, -7), 21, "-3*(-7) should be 21");
    }

    @Test
    public void DivideByZeroTest() {
        assertThrows(NumberFormatException.class, () -> {
            c.divide(4,0);
        });
    }

    @Test
    public void divideTwoNegativeTest() {
        assertEquals(c.divide(-4,-2), 2, "-4/-2 should be 2");
    }

    @Test
    public void divideNegativePositiveTest() {
        assertEquals(c.divide(-4, 4), -1, "-4/4 should be -1");
    }

    @Test
    public void divideTwoPositiveTest() {
        assertEquals(c.divide(10,2), 5, "10/2 should be 5");
    }

    @Test
    public void divideToFloatTest() {
        assertEquals(c.divide(5,2), 2, "5/2 = 2.5 -> 2");
    }
}
