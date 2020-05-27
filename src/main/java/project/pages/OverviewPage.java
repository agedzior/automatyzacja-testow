package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends DefaultPage {

    @FindBy(id = "navigation-sub-projects")
    private WebElement toProjectButton;

    @FindBy(id = "navigation-sub-users")
    private WebElement toUserButton;


    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public ProjectPage openProjectPage() {
        clickElement(toProjectButton);
        return new ProjectPage(driver);
    }

    public UserPage openUserPage() {
        clickElement(toUserButton);
        return new UserPage(driver);
    }
}
