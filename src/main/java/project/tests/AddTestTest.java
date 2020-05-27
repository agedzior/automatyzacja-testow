package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.DashboardPage;

import java.util.Date;

public class AddTestTest extends DefaultTest {
    @Test
    public void successAddTestTest() {
        Assert.assertTrue(
                new DashboardPage(driver)
                        .openTestPage()
                        .openAddTestPage()
                        .fillAddTestForm("Test Run_" + new Date().getTime(), "description_" + new Date().getTime())
                        .submitAddTestForm()
                        .isDashboardPageDisplayed());
    }
}
