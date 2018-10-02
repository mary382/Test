package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTest extends BaseClass {
    @Test(dataProvider = "valuesForSinTest",groups = {"TrigonometricFunctions"})
    public void sinDoubleTest(double a, double expectedResult) {
        double actualResult = calculator.sin(a);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result in Cos operation.");

    }

    @DataProvider(name = "valuesForSinTest")
    public static Object[][] valuesForSinTest() {
        return new Object[][]
                {
                        {0.0, Math.sin(0.0)},
                        {1.0, Math.sin(1.0)},
                        {3.0, Math.sin(3.0)},
                        {-4.0, Math.sin(-4.0)},
                };
    }
}
