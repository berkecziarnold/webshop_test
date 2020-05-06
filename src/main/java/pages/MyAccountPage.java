package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    private WebDriver driver;
    private By statusAlert = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
