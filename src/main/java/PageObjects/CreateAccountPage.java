package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    WebDriver driver;

    @FindBy (name = "username")
    WebElement userNameTextBox;

    @FindBy (name = "password")
    WebElement passwordTextBox;

    @FindBy (name = "repeatedPassword")
    WebElement repeatPasswordTextBox;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName() {
        userNameTextBox.sendKeys("Automation");
    }

    public void setPassword() {
        passwordTextBox.sendKeys("Testing");
    }

    public void setRepeatPassword() {
        repeatPasswordTextBox.sendKeys("Testing");
    }

    public  CreateAccountPage submitButton() {

        return new CreateAccountPage(driver);
    }

}
