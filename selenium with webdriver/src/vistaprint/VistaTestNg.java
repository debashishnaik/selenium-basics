package vistaprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VistaTestNg {
    static WebDriver driver;
    static Actions actions;

    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @AfterClass
    public void close(){
//        driver.quit();
    }
    @BeforeMethod
    public void lunchUrl(){
        driver.get("https://www.vistaprint.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(priority = 1)
    public void mouseHoverOnStampsAndInks(){
        WebElement element = driver.findElement(By.xpath("//span[text()='Stamps and Ink']"));
        actions.moveToElement(element).build().perform();
    }
    @Test(priority = 2)
    public void loginIconHoverThenClickOnLogin(){
        WebElement element = driver.findElement(By.xpath("//button[@id='header-my-account-link']"));
        actions.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    }
    @Test(priority = 3)
    public void login(){
        driver.findElement(By.xpath("//input[@id='sign-in-email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("signInPassword")).sendKeys("abc123");
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }


}
