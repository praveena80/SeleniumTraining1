package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccount extends BaseTest {
    @Test
    public void createAccount() {

        //Registering Account
        driver.findElement(By.name("username")).sendKeys("Automation");
        driver.findElement(By.name("password")).sendKeys("Testing");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Testing");
    }
}
