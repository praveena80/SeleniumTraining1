import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicTest {
    @Test
    public void openBrowser() {
//        String driverPath = "C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe"; - local path. which is coming from your laptop
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();


    }

}
