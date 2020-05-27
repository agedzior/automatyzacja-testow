package project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import project.utils.BaseProperties;
import project.utils.CustomDriverFactory;
import project.utils.CustomFile;

public abstract class DefaultTest {

    protected static WebDriver driver;

    protected CustomFile customFile;

    @Parameters({"browserType", "implicitlyWait", "windowMaximize"})
    @BeforeSuite
    public void setUp(String browserType, String implicitlyWait, String windowMaximize) {
        customFile = new CustomFile();
        driver = new CustomDriverFactory().getConfiguredDriver(
                browserType,
                Long.parseLong(implicitlyWait),
                windowMaximize.equalsIgnoreCase("true")
        );
        driver.get(BaseProperties.BASE_URL);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
