package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{

    private static final String HOMEPAGE_URL = "https://xm.com";

    @FindBy(className = "main_nav_research")
    WebElement researchAndEducation;

    @Override
    public HomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void researchAndEducationClick() {
        researchAndEducation.click();
    }

    public HomePage(WebDriver driver){
        super(driver);
    }
}
