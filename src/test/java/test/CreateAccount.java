package test;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccount extends BaseTest { // inheritance

    @Test
    public void createAccount() {
        HomePage homePage = new HomePage(driver); //Object for Pages. this is initializing and we can use all the methods and elements from that calss
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        homePage.clickEnterStore();
        System.out.println("User landed on Sign in page");
        String signInText = homePage.getSignInText(); //If i create this variable then i can use this in my assertion
        System.out.println("Getting Text from Website: " + homePage.getSignInText());
        Assert.assertEquals(homePage.getSignInText(), "Sign In");
        //or i can use like below
        Assert.assertEquals(signInText, "Sign In"); // This is another way of using assertion with variable.
        // I can use this only when i create Line 17 variable

        
//        homePage.clickSignInLink();
//        homePage.clickRegisterLink();
//        createAccountPage.setUserName();
//        createAccountPage.setPassword();
//        createAccountPage.setRepeatPassword();
        System.out.println("dsfs" + "dfaj");
    }

    @Test
    public void createAccount1() {
        HomePage homePage = new HomePage(driver); //Object for Pages. this is initializing and we can use all the methods and elements from that calss
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);

        homePage.clickEnterStoreAndSignIn();
        homePage.clickRegisterLink();
        createAccountPage.setUserName();
        createAccountPage.setPassword();
        createAccountPage.setRepeatPassword();
        System.out.println("dsfs" + "dfaj");
    }

}
