package test;

import PageObjects.CreateAccountPage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class CreateAccount extends BaseTest {
    @Test
    public void createAccount() {
        LoginPage loginPage = new LoginPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        loginPage.clickSignInLink();
        loginPage.clickRegisterLink();
        createAccountPage.setUserName();
        createAccountPage.setPassword();
        createAccountPage.setRepeatPassword();
    }
}
