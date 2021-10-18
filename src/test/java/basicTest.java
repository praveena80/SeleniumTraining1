import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicTest {
    @Test
    public void openBrowser() {
//        String driverPath = "C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe"; - local path. which is coming from your laptop
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.expedia.com/");
//        driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]//div[2]/div/button")).click();
////        driver.findElement(By.linkText("Sign up, it’s free")).click(); // This is not working
//        driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]//div[1]/div/div/a[2]")).click();
//        driver.findElement(By.id("create-account-firstname")).sendKeys("Abc Test");
        driver.get("https://petstore.octoperf.com/");
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.linkText("Sign In")).click();
//        driver.wait(2000);
        driver.findElement(By.linkText("Register Now!")).click();

        //Registering Account
        driver.findElement(By.name("username")).sendKeys("Automation");
        driver.findElement(By.name("password")).sendKeys("Testing");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Testing");
//        driver.quit();

    }

//    @Test
//    public void registeringAccount() {
//        driver.
//    }driver

}
