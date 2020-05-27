package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends DefaultPage {

    @FindBy(id = "navigation-admin")
    private WebElement AdministratorButton;

    @FindBy(xpath = "//*[@id=\"fav-16\"]/div[2]/div[1]/a")
    private WebElement toTestRunButton;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDashboardPageDisplayed() {
        return isElementDisplayed(AdministratorButton);
    }

    public OverviewPage openOverviewPage() {
        clickElement(AdministratorButton);
        return new OverviewPage(driver);
    }

    public TestPage openTestPage() {
        clickElement(toTestRunButton);
        return new TestPage(driver);
    }
}
