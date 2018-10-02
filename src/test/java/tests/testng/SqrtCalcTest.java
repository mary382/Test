package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalcTest extends BaseClass {

    @Test(dataProvider = "valuesForSqrtTest",groups = {"ArifmeticFunctions"})
    public void doubleSqrtTest(double a, double expectedValue) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Root of negative number.");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrtTest() {
        return new Object[][]{
                {100, 10},
                {-100, (Math.sqrt(-100))},
                {1.69, 1.3},
                {0, 0}
        };
    }

}
