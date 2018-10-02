package tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    protected Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator=new Calculator();
    }

    @AfterClass
    public void tearDown(){
        calculator=null;
    }
}
