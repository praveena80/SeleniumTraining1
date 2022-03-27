import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class basicTest {


    @Test
    public void openBrowser() throws InterruptedException {
//        String driverPath = "C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe"; - local path. which is coming from your laptop
//        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
//        driver.get("https://www.expedia.com/");
//        driver.findElement(By.linkText("Flights")).click();
//        driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[1]")).click();
//        driver.findElement(By.id("location-field-leg1-origin")).sendKeys("phoenix");


        driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]//div[2]/div/button")).click();
//        driver.findElement(By.linkText("Sign up, it’s free")).click(); // This is not working
        driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]//div[1]/div/div/a[2]")).click();
        driver.findElement(By.id("create-account-firstname")).sendKeys("Abc Test");
        driver.get("https://www.amazon.com/");
////        Assert.assertTrue(driver.findElement(By.linkText("Enter the Store")).isDisplayed());
//        driver.findElement(By.linkText("Enter the Store")).click();
//        driver.findElement(By.linkText("Sign In")).click();
//        driver.wait(2000);
//        driver.findElement(By.linkText("Register Now!")).click();
////
//        //Registering Account
////        driver.findElement(By.name("username")).click(); // this line comes only depends on the application
//        driver.findElement(By.name("username")).sendKeys("Automation1");
//        driver.findElement(By.name("password")).sendKeys("Auto1");
//        driver.findElement(By.name("repeatedPassword")).sendKeys("Auto1");
//        driver.findElement(By.id("stripes-1459873587")).sendKeys("Automation");
//        driver.findElement(By.name("password")).sendKeys("Testing");
//        driver.findElement(By.name("repeatedPassword")).sendKeys("Testing");
////        driver.close();  //close one window only
//
//        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[contains(text(),'Pharmacy')]")).click();
//        driver.findElement(By.linkText("Get started")).click();
//        driver.quit(); //close all windows and close the session

    }


    @Test
    public void login() {

//        driver.findElement(By.linkText("Enter the Store")).click();
//        driver.findElement(By.linkText("Sign In")).click();
    }

}
