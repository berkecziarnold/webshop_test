package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By signInLink = By.linkText("Sign in");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickSignIn(){
        driver.findElement(signInLink).click();
        return new LoginPage(driver);
    }

}
