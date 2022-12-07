package bva.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(xpath = "//*[@id='bs-example-navbar-collapse-1']/ul/li[6]/a")
    private WebElement logoutBtn;

    //define locator of link account
    @FindBy(id = "accountLink")
    private WebElement accountLink;

    //show link account
    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    //method for push button of logout from account
    public void userLogout() {
        logoutBtn.click();
    }

}
