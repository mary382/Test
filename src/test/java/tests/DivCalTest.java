package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DivCalTest extends BaseClass {

    @Test(expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDivOnZero() {
        calculator.div(1, 0);
    }

    @Test(expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDoubleDivOnZero() {
        calculator.div(3.2, 0);
    }

    @Test(dataProvider = "valuesForLongDivTest")
    public void longDivTest(long a, long b, long expectedValue) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation.");
    }

    @DataProvider(name = "valuesForLongDivTest")
    public Object[][] valuesForLongDivTest() {
        return new Object[][]{
                {0, 5, 0},
                {5, 5, 1},
                {5, -5, -1},
                {-5, 5, -1},
                {-5, -5, 1},
                {30, 12, (30/12)}
        };
    }

    @Test(dataProvider = "valuesForDoubleDivTest")
    public void doubleDivTest(double a, double b, double expectedValue) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation.");
    }

    @DataProvider(name = "valuesForDoubleDivTest")
    public Object[][] valuesForDoubleDivTest() {
        return new Object[][]{
                {0, 5, 0},
                {5, 5, 1},
                {5.3, -5.3, -1.0},
                {-5.3, 5.3, -1.0},
                {-5, -5, 1},
                {30.0, 12.0, 2.5},
                {0.3, 0.4, 0.75}
        };

    }




}
