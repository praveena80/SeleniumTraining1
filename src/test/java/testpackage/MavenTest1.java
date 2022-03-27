package testpackage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MavenTest1 {

    static ExtentTest test;
    static ExtentReports reports;
    public WebDriver driver ;
    public String baseUrl = "https://www.gmail.com/";
    String driverPath = "C:\\Users\\prave\\Downloads\\chromedriver_win32\\chromedriver.exe";

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../Reports/" + System.currentTimeMillis()
                + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

    @BeforeClass
    public void startClass() {
        reports = new ExtentReports(System.getProperty("src/../Reports/")+"ExtentReport.html");
        test = reports.startTest("Demo Test");
    }

    @AfterClass
    public void endClass() throws IOException {
        reports.endTest(test);
        test.log(LogStatus.FAIL, test.addScreenCapture(capture(driver))+ "Test Failed");
        reports.flush();
    }
    @Test
    public void test() {
// set the system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", driverPath);
// Create driver object for CHROME browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
// get the current URL of the page
        String URL= driver.getCurrentUrl();
        System.out.print(URL);
//get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Verify the expected and actual result is same
        Assert.assertEquals(URL, title, "Text not found!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }
    @AfterTest
    public void afterTest() {
        test.log(LogStatus.PASS, "test passed");
        driver.quit();
        System.out.println("after test");
    }
}
