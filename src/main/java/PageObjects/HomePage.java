package PageObjects;

import frameWork.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase {
    WebDriver driver;
    String a=  "test";

    @FindBy (linkText = "Enter the Store")
    WebElement enterStoreLink;

    @FindBy (linkText = "Sign In")
    WebElement signInLink;

    @FindBy (linkText = "Register Now!")
    WebElement registerLink;

    public HomePage(WebDriver driver) {
        super(driver);
//        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEnterStore() {
        enterStoreLink.click();
    }

    public String getSignInText() {
        return signInLink.getText();
    }

    public void clickEnterStoreAndSignIn() {
        enterStoreLink.click();
        signInLink.click();
    }

    //This method is to click on signIn button
    public HomePage clickRegisterLink() {
        registerLink.click();
        return new HomePage(driver);
    }
}
