package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isNegativeCalcTest extends BaseClass {

    @Test(dataProvider = "valuesForIsNegativeLongTest")
    public void isNegativeLongTest(long a, boolean expectedValue) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of isNegative operation.");
    }


    @DataProvider(name = "valuesForIsNegativeLongTest")
    public static Object[][] valuesForIsNegativeLongTest() {
        return new Object[][]
                {
                        {0, false},
                        {3, false},
                        {-7, true}
                };
    }
}
