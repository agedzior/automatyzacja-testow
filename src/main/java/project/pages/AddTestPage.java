package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddTestPage extends DefaultPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "description")
    private WebElement descriptionField;

    @FindBy(id = "accept")
    private WebElement addTestRunButton;


    public AddTestPage(WebDriver driver) {
        super(driver);
    }

    public AddTestPage fillAddTestForm(String testName, String versionDescription) {
        fillElement(nameField, testName);
        fillElement(descriptionField, versionDescription);
        return this;
    }

    public DashboardPage submitAddTestForm() {
        clickElement(addTestRunButton);
        return new DashboardPage(driver);
    }
}
