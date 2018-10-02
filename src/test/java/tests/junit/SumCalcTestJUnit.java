package tests.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

@RunWith(value = Parameterized.class)
public class SumCalcTestJUnit {

    private long a;
    private long b;
    private long expectedResult;
    private Calculator calculator;

    public SumCalcTestJUnit(long a, long b, long expectedResult) {
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
        long actualResult = calculator.sum(a, b);
        assertEquals(expectedResult, actualResult);
    }


    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {10, 11, 21},
                {10, -1, 9},
                {0, 0, 0},
                {-1, -3, -4},
                {0, 1, 1},
                {1, 10, 11}
        });
    }

}