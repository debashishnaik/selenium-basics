package cyclosTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class LandingPage_BAnner {
    WebDriver driver;
    Actions actions;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions=new Actions(driver);
    }
    @AfterClass
    public void close(){
//        driver.quit();
    }
    @BeforeMethod
    public void lunchUrl(){
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
    }
    @Test(priority = 1,description = "the tast case is part of smoke to verify banner option using soft assert")
    public void bannerVerification(){
        //soft assert=> it will ignore the line where soft asser used
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(driver.findElement(By.xpath("//div[@class='navbar-brand flex-grow-1']")).isDisplayed(),false,"veryfing logo");
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='Information']"))).build().perform();

        sa.assertEquals(driver.findElement(By.id("help-link")).isDisplayed(),false,"verify help link");
        sa.assertEquals(driver.findElement(By.id("help-link")).isEnabled(),false,"verify help link");
        sa.assertEquals(driver.findElement(By.id("register-link")).isEnabled(),true,"verify register link");
        driver.findElement(By.xpath("//div[text()=' Login ']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        sa.assertAll();
        //it is used to pass all the soft assert cases other wise it will give error

    }
    @Test(priority = 2,description = "verifying using hard assert")
    public void bannerverifyHardAssert(){
        //hard Assert =>actual result and expected result should be same
        Assert.assertEquals(driver.findElement(By.xpath("//div[text()=' Login ']")).isDisplayed(),false,"veryfing logo");
        Assert.assertEquals(driver.findElement(By.id("help-link")).isDisplayed(),false,"verify help link");
        Assert.assertEquals(driver.findElement(By.id("help-link")).isEnabled(),false,"verify help link");
        Assert.assertEquals(driver.findElement(By.id("register-link")).isEnabled(),true,"verify register link");




        driver.findElement(By.xpath("//div[text()=' Login ']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Test(priority = 3,description = "verifying login using valid data")
    public void login(){
        driver.get("https://demo.cyclos.org/ui/login");
        driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
    }





}
