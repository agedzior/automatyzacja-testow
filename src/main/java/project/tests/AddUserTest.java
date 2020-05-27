package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.DashboardPage;
import project.utils.BaseProperties;

import java.util.Date;

public class AddUserTest extends DefaultTest {

    @Test
    public void successAddUserTest() {
        Assert.assertTrue(
                new DashboardPage(driver)
                        .openOverviewPage()
                        .openUserPage()
                        .openAddUserPage()
                        .fillAddUserForm("imie i nazwisko_" + new Date().getTime(), "email_" + new Date().getTime() + "@gmail.com", BaseProperties.BASE_USER_PASSWORD)
                        .submitAddUserForm()
                        .isDashboardPageDisplayed());
    }
}
