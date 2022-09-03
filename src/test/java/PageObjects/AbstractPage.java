package PageObjects;

import org.openqa.selenium.WebDriver;

import java.security.ProtectionDomain;

public abstract class AbstractPage {

    protected WebDriver driver;
    protected abstract AbstractPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 5;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
