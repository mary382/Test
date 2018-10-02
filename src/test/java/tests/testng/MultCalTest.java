package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTest extends BaseClass {

    @Test(dataProvider = "valuesForPositiveMultDoubleTest",groups = {"ArifmeticFunctions"})
    public void positiveMultDoubleTest(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result,expectedValue,"Invalid result of mult operation.");
    }

    @DataProvider(name = "valuesForPositiveMultDoubleTest")
    public Object[][] valuesForPositiveMultDoubleTest() {
        return new Object[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
                {15, 5, 75},
                {-15, 5, -75},
                {15, -5, -75},
                {-15, -5, 75},
                {0.3, 0.4, 0.12},
                {-0.5, -0.3, 0.15},
                {-10.2, 2, -20.4},
                {-3.1, 5.757, -17.8467}
        };
    }

    @Test(dataProvider = "valuesForMultLongTest",groups = {"ArifmeticFunctions"})
    public void positiveMultLongTest(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result,expectedValue,"Invalid result of mult operation.");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMultLongTest() {
        return new Object[][]{
                {1, 0, 0},
                {0,1,0},
                {0, 0, 0},
                {15,5,75},
                {-15,5,-75},
                {15,-5,-75},
                {-15,-5,75},
                {17, 7, 119}
        };
    }

}
