package tests.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

@RunWith(value = Parameterized.class)
public class MultCalcTestJUnit {

    private double a;
    private double b;
    private double expectedResult;
    private Calculator calculator;

    public MultCalcTestJUnit(double a, double b, double expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void sumLongTest() {
        double actualResult = calculator.mult(a, b);
        assertEquals(expectedResult, actualResult);
    }


    @Parameterized.Parameters(name = "{index}:sumOf({0}*{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
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
        });
    }

}