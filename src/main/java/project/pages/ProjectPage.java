package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends DefaultPage {

    @FindBy(xpath = "//*[@id=\"content-inner\"]/div[1]/a")
    private WebElement addProjectButton;

    @FindBy(xpath = "//*[@id=\"content-inner\"]/table/tbody/tr[6]/td[1]/span/a/div")
    private WebElement dBox;

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage openAddProjectPage() {
        clickElement(addProjectButton);
        return new AddProjectPage(driver);
    }
}

