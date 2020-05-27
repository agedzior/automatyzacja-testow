package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.pages.LoginPage;
import project.utils.BaseProperties;

public class LoginTest extends DefaultTest {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                new LoginPage(driver)
                        .fillLoginForm(
                                BaseProperties.BASE_ADMIN_EMAIL,
                                BaseProperties.BASE_ADMIN_PASSWORD,
                                true)
                        .submitLoginForm()
                        .isDashboardPageDisplayed());
    }

}