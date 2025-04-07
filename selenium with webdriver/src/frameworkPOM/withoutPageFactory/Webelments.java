package frameworkPOM.withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Webelments {
    WebDriver driver;
    public Webelments(WebDriver driver) {
        this.driver = driver;
    }
    By loginBtn=By.xpath("//a[@id='login-link']//div[text()=' Login ']");
    By userName=By.xpath("//input[@autocomplete='username']");
    By password=By.xpath("//input[@autocomplete='password']");

    By submitbtn=By.xpath("//span[text()='Submit']");

    public void loginLink(){
        driver.findElement(loginBtn).click();
    }
    public void enterUserName(String uname){
        driver.findElement(userName).sendKeys(uname);
    }
    public void enterPass(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void submitbtn(){
        driver.findElement(submitbtn).click();
    }


}
