package cyclosTestNg;

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

import java.time.Duration;

public class LoginUsingActions {
    WebDriver driver;
    Actions actions;

    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterClass
    public void close(){
        driver.quit();
    }
    @BeforeMethod
    public void lunchurl(){
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
    }
    @Test(description = "login using only actions class methods")
    public void loginActions() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        Action seriesOfActions=  actions.moveToElement(driver.findElement(By.xpath("//input[@autocomplete='username']"))).click()
                .sendKeys("demo", Keys.TAB)
                .sendKeys("1234",Keys.ENTER).build();
        seriesOfActions.perform();
        Thread.sleep(3000);

    }

}
