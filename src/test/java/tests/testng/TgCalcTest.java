package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalcTest extends BaseClass {
    @Test(dataProvider = "valuesForTgTest",groups = {"TrigonometricFunctions"})
    public void tgDoubleTest(double a, double expectedResult) {
        double actualResult = calculator.tg(a);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result in tg operation.");

    }

    @DataProvider(name = "valuesForTgTest")
    public static Object[][] valuesForTgTest() {
        return new Object[][]
                {
                        {0.0, Math.tan(0.0)},
                        {1.0, Math.tan(1.0)},
                        {3.0, Math.tan(3.0)},
                        {-4.0, Math.tan(-4.0)},
                };
    }
}
