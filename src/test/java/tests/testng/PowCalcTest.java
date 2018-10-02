package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalcTest extends BaseClass {

    @Test(dataProvider = "valuesForPowTest",groups = {"ArifmeticFunctions"})
    public void powDoubleCalcTest(double a, double b, double expectedValue) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of pow operation.");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPowTest() {
        return new Object[][]{
                {1, 100, 1},
                {2, 5, 32},
                {12, 0, 1},
                {100, -1, 0.01},
                {-5, 2, 25},
                {10, 2.7, (Math.pow(10, 2.7))}
        };

    }
}
