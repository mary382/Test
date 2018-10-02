import listeners.Listeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNG=new TestNG();
        testNG.addListener(new Listeners());

        XmlSuite suite=new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resourses/testng.xml"));

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
