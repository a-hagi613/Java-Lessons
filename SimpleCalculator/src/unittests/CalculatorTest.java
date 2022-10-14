package unittests;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
    private Calculator objCalcUnderTest;

    @Before
    public void setUp() {
        objCalcUnderTest = new Calculator();
    }



    @Test
    public void testAdd() {
        int a = 15; int b = 20;
        int expectedResult = 35;
        int result = objCalcUnderTest.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void testSubtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        int result = objCalcUnderTest.subtract(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 10; int b = 25;
        int expectedResult = 250;
        int result = objCalcUnderTest.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int a = 100; int b = 10;
        int expectedResult = 10;
        int result = objCalcUnderTest.divide(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15; int b = 0;
        objCalcUnderTest.divide(a, b);
    }
}