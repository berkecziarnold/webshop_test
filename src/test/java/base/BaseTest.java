package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
