package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().fullscreen();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
