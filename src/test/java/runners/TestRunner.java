package runners;

import com.williamhill.sports.utils.BaseTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue={"com.williamhill.sports.stepdefs"})

public class TestRunner {

    @BeforeClass
    public static void setUp(){
        BaseTests.launchApplication();
    }

    @AfterClass
    public static void tearDown(){
        BaseTests.closeBrowser();
    }


}
