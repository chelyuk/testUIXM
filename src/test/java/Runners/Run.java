package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/resources/Test.feature",
        glue = {"StepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser", "resolution"})
    public void setUpClass(String browser, String resolution) throws Exception {

        DesiredCapabilities capability= new DesiredCapabilities();
        capability.setCapability(CapabilityType.BROWSER_NAME, browser);
        capability.setCapability("resolution","");
    }
}
