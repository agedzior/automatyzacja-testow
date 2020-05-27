package project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import project.utils.BaseProperties;

public class AddUserPage extends DefaultPage {

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "invite_no")
    private WebElement manualRadioButton;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirm")
    private WebElement passwordCField;


    @FindBy(xpath = "//*[@id=\"accept\"]")
    private WebElement addButton;


    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public AddUserPage fillAddUserForm(String versionName, String versionEmail, String password) {
        fillElement(nameField, versionName);
        if (versionEmail != null) {
            fillElement(emailField, versionEmail);
        }
        clickElement(manualRadioButton);
        fillElement(passwordField, password);
        fillElement(passwordCField, password);
        return this;
    }

    public DashboardPage submitAddUserForm() {
        clickElement(addButton);
        return new DashboardPage(driver);
    }
}


