package shaadi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.shaadi.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abc123");
        driver.findElement(By.xpath("//a[text()='Sign Up Free ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Myself']")).click();
        driver.findElement(By.xpath("//span[text()='Male']")).click();
        Thread.sleep(2000);

        //child to parent xpath
//        driver.findElement(By.xpath("//span[text()='First name']/ancestor::fieldset/preceding-sibling::input")).sendKeys("deba");
        //or
        driver.findElement(By.xpath("//label[text()='First name']/../div/input")).sendKeys("deba");

        driver.findElement(By.xpath("//span[text()='Last name']/../../../input")).sendKeys("naik");
        driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("24");
        driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1999");
        Thread.sleep(1000);
        //parent to child xpath
        driver.findElement(By.xpath("//div[@class='revisedreg_ctaWrap__1q5_y']//button[@tabindex='0']")).click();

        //dropdown of religion
        driver.findElement(By.id("mui-component-select-community")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Hindu']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("mui-component-select-mother_tongue")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[text()='Odia']")).click();
        Thread.sleep(3000);
        //continue button
        //not work

        WebElement cntBtn = driver.findElement(By.xpath("//div[@data-index='1']//button[@class='MuiButtonBase-root MuiButton-root _3cx-YID9QwTbPurYgxgt5D _1Zc7UeUcTcj8aBk5grOZF4 MuiButton-contained _1If1p9mJUJxVvZo5sl7itQ revisedreg_cta__1gwfN']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",cntBtn);

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sfs123@gmail.com");
        driver.findElement(By.name("mobileNo")).sendKeys("7008001776");

        driver.findElement(By.xpath("//p[.='Submit']")).click();




        driver.findElement(By.xpath("//input[@placeholder='Enter the city you live in']")).sendKeys("Hyd");
        driver.findElement(By.xpath("//label[@for='Yes-livesWithFamilyOption']")).click();
        driver.findElement(By.xpath("(//div[.='Occasionally Non-Veg'])[2]")).click();
        driver.findElement(By.xpath("//input[@value='5ft 5in - 165cm']")).click();
        driver.findElement(By.xpath("//input[@value='Scheduled Tribe (ST)']")).click();
        driver.findElement(By.id("casteNoBar")).click();
        driver.findElement(By.xpath("(//span[.='Continue'])[2]")).click();





    }
}
