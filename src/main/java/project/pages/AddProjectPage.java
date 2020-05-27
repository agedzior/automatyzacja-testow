package project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProjectPage extends DefaultPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "announcement")
    private WebElement announcementField;

    @FindBy(xpath = "//*[@id=\"accept\"]")
    private WebElement acceptButton;


    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage fillAddProjectForm(String versionName, String versionAnnouncement) {
        fillElement(nameField, versionName);
        if (versionAnnouncement != null) {
            fillElement(announcementField, versionAnnouncement);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        return this;
    }

    public DashboardPage submitAddProjectForm() {
        clickElement(acceptButton);
        return new DashboardPage(driver);
    }
}




