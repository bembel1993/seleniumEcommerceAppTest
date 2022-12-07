package bva.factory.factorytests;

import bva.factory.factorypages.LoginPage;
import bva.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.*;


public class MainFactoryTest extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    //--1--//Input Login Password click Log Button
    @Test
    public void loginTestOne() {
        loginPage.inputEmail(LoginPage.EMAIL_VALID);
        loginPage.inputPassword(LoginPage.PASSWORD_VALID);
        loginPage.clickBtnSignIn();
        Assert.assertTrue(loginPage.showHeaderWithNewInterface(), "error");
    }

    //--2--//
    @Test
    public void assertMainFactoryPage() {
        Assert.assertTrue(loginPage.isFullSignInForm(), "Not load");
        loginPage.inputEmail(LoginPage.EMAIL_VALID);
        loginPage.inputPassword(LoginPage.PASSWORD_VALID);
        loginPage.clickBtnSignIn();
        mainFactoryPage.userLogout();
       // Assert.assertTrue(mainFactoryPage.isAccountLinkDisplayed(), "Login page isn't loaded properly");
    }
}


