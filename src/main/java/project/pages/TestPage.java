package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage extends DefaultPage {
    @FindBy(xpath = "//*[@id=\"sidebar-runs-add\"]")
    private WebElement AddTestRun;

    public TestPage(WebDriver driver) {
        super(driver);
    }

    public AddTestPage openAddTestPage() {
        clickElement(AddTestRun);
        return new AddTestPage(driver);
    }

}
