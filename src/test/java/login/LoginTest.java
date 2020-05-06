package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.setEmail("arnoldberkeczi@gmail.com");
        loginPage.setPassword("123456");
        MyAccountPage myAccountPage = loginPage.clickSignInButton();
        assertEquals(myAccountPage.getAlertText(), "MY ACCOUNT", "Alert text is incorrect");
    }
}
