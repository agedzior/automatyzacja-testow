package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.DashboardPage;

import java.util.Date;

public class AddProjectTest extends DefaultTest {

    @Test
    public void successAddProjectTest() {
        Assert.assertTrue(
                new DashboardPage(driver)
                        .openOverviewPage()
                        .openProjectPage()
                        .openAddProjectPage()
                        .fillAddProjectForm("projekt_" + new Date().getTime(), "announcement_" + new Date().getTime())
                        .submitAddProjectForm()
                        .isDashboardPageDisplayed());
    }
}
