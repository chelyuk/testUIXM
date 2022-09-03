package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends AbstractPage{

    @FindBy(id = "timeFrame_yesterday")
    WebElement yesterdayButton;

    @FindBy(id = "timeFrame_today")
    WebElement todayButton;

    @FindBy(id = "timeFrame_tomorrow")
    WebElement tomorrowButton;

    @FindBy(id = "timeFrame_thisWeek")
    WebElement thisWeekButton;

    @FindBy(id = "widgetFieldDateRange")
    WebElement date;

    @FindBy(xpath = "//a[contains(text(),'here')]")
    WebElement here;

    public CalendarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CalendarPage openPage() {
        return null;
    }

    public CalendarPage selectTimeFrame(WebElement element) {
        element.click();
        return this;
    }

    public String getDate() {
        return date.getText();
    }
}
