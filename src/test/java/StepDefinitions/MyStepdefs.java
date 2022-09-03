package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.HomePage;

public class MyStepdefs {

    Dimension dimension;
    public WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Given("^open HomePage$")
    public void openHomePage() {
        driver.get("xm.com");
    }

    @And("^click Research and Education$")
    public void clickResearchAndEducation() {
    }

    @Given("^open Economic Calendar$")
    public void openEconomicCalendar() {
    }

    @When("^click date check that it is correct$")
    public void clickDateCheckThatItIsCorrect() {
    }

    @And("^click here$")
    public void clickHere() {
    }

    @Then("^Check that Risk Disclosure document was opened in a new tab$")
    public void checkThatRiskDisclosureDocumentWasOpenedInANewTab() {
    }

    @And("set browser \"([^\"]*)\"")
    public void setBrowserScreenSize(String screenSize) {
        switch(screenSize) {
            case "800x600":
                dimension = new Dimension(800, 600);
                driver.manage().window().setSize(dimension);
            case "1024x768":
                dimension = new Dimension(1024, 768);
                driver.manage().window().setSize(dimension);
            case "fullscreen":
                driver.manage().window().fullscreen();
        }
    }

    @After
    public void cleanUp() {
        driver.close();
    }
}
