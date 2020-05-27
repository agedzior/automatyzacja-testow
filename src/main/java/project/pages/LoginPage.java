package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DefaultPage {

    @FindBy(id = "name")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "rememberme")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "button_primary")
    private WebElement loginpageButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillLoginForm(String email, String password, boolean remember) {
        fillElement(emailField, email);
        fillElement(passwordField, password);
        selectCheckbox(rememberMeCheckbox, remember);
        return this;
    }

    public DashboardPage submitLoginForm() {
        clickElement(loginpageButton);
        return new DashboardPage(driver);
    }
}