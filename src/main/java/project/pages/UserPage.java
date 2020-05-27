package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserPage extends DefaultPage {

    @FindBy(xpath = "//*[@id=\"users-tab-frame\"]/div[1]/div[3]/a[1]")
    private WebElement UserButton;

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public AddUserPage openAddUserPage() {
        clickElement(UserButton);
        return new AddUserPage(driver);
    }

}
