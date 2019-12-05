package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static java.util.concurrent.TimeUnit.SECONDS;

public class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void initializeBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    @AfterClass
    public void closeBrowser() {
        //driver.quit();
    }
}
