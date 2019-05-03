import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class CaculatorTests {

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        final int expected = 4;
        final int actual = Calculator.add(2, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void multiply_result() {
        final double expected = 4.0;
        final double actual = Calculator.multiply(2, 2);
        assertEquals(actual, expected);
    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;
        final double actual = Calculator.divide(10, 5);
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        Calculator.divide(10, 0);
    }

    @Test
    public void motNghiem() {
        double a = 0;
        double b = 2;
        double c = 1;
        double[] expectedResult = {-0.5};
        double[] result = Calculator.Quadratic(a, b, c);
        assertEquals(expectedResult, result);
    }

    @Test
    public void haiNghiem() {
        double a = 1;
        double b = 2;
        double c = -3;
        double[] expectedResult = {-3, 1};
        double[] result = Calculator.Quadratic(a, b, c);
        assertEquals(expectedResult, result);
    }

    @Test
    public void voSo_voNghiem() {
        double a = 0;
        double b = 0;
        double c = 1;
        double[] result = Calculator.Quadratic(a, b, c);
        assertNull(result);
    }
}
