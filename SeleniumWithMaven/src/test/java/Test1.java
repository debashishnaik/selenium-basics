import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;

public class Test1 {
    WebDriver driver;
    Actions actions;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions=new Actions(driver);

    }
    @AfterClass
    public void close(){
        driver.quit();
    }
    @BeforeMethod
    public void lunchUrl(){
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
    }
    @Test(priority = 1,description = "login to the app",invocationCount = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        Action seriesOfActions=  actions.moveToElement(driver.findElement(By.xpath("//input[@autocomplete='username']"))).click()
                .sendKeys("demo", Keys.TAB)
                .sendKeys("1234",Keys.ENTER).build();
        seriesOfActions.perform();
        Thread.sleep(3000);

    }


}
