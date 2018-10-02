package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalcTest extends BaseClass {
    @Test(dataProvider = "valuesForCtgTest",groups = {"TrigonometricFunctions"})
    public void ctgDoubleTest(double a, double expectedResult) {
        double actualResult = calculator.ctg(a);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result in ctg operation.");

    }

    @DataProvider(name = "valuesForCtgTest")
    public static Object[][] valuesForCtgTest() {
        return new Object[][]
                {
                        {0.0, 1 / Math.tan(0.0)},
                        {1.0, 1 / Math.tan(1.0)},
                        {3.0, 1 / Math.tan(3.0)},
                        {-4.0, 1 / Math.tan(-4.0)}
                };
    }
}

