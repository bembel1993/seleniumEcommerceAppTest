package bva.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {

    public static final String EMAIL_VALID = "vit";
    public static String PASSWORD_VALID = "111";
    ///////////////////
    @FindBy(xpath = "//*[@id='logininput']")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id='passinput']")
    private WebElement passwordField1;
    @FindBy(xpath = "//*[@id='login-form']/div[3]/div[2]/button")
    private WebElement btnSignIn;
    @FindBy(xpath = "/html/body/div[1]")
    private WebElement HeaderWithNewInterface;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]")
    private WebElement fullSignInForm;
    //method email
    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    //method pass
    public void inputPassword(String password) { passwordField1.sendKeys(password); }

    //method enter button
    public void clickBtnSignIn() {
        btnSignIn.click();
    }

    //method show login container
    public boolean showHeaderWithNewInterface() {
        return HeaderWithNewInterface.isDisplayed();
    }

    //full sign in form
    public boolean isFullSignInForm() {
        return fullSignInForm.isDisplayed();
    }

}
