package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.cssSelector("#login_form button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickSignInButton(){
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }
}
