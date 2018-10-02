package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalcTest extends BaseClass {

    @Test(dataProvider = "valuesForCosTest")
    public void cosDoubleTest(double a, double expectedResult) {
        double actualResult = calculator.cos(a);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result in Cos operation.");

    }

    @DataProvider(name = "valuesForCosTest")
    public static Object[][] valuesForCosTest() {
        return new Object[][]
                {
                        {0.0, Math.cos(0.0)},
                        {1.0, Math.cos(1.0)},
                        {3.0, Math.cos(3.0)},
                        {-4.0, Math.cos(-4.0)},
                };
    }
}
