package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isPositiveCalcTest extends BaseClass {
    @Test(dataProvider = "valuesForIsPositiveLongTest")
    public void isPositiveLongTest(long a,boolean expectedValue){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result,   expectedValue,"Invalid result of isPositive operation.");
    }



    @DataProvider(name = "valuesForIsPositiveLongTest")
    public static Object[][] valuesForIsPositiveLongTest() {
        return new Object[][]
                {
                        {0,false},
                        {3,true},
                        {-7,false}
                };
    }
}
