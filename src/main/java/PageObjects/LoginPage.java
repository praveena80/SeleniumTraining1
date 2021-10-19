package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy (linkText = "Enter the Store")
    WebElement enterStoreLink;

    @FindBy (linkText = "Sign In")
    WebElement signInLink;

    @FindBy (linkText = "Register Now!")
    WebElement registerLink;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink() {
        enterStoreLink.click();
        signInLink.click();
    }

    //This method is to click on signIn button
    public LoginPage clickSignInButton() {
        registerLink.click();
        return new LoginPage(driver);
    }
}
