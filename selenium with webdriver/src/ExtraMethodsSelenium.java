import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ExtraMethodsSelenium {

//    example of going back and forward using navigate methods and using different xpath methods
    public void A(WebDriver driver) throws InterruptedException {
    driver.navigate().to("https://nurserylive.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//li[@class='navmenu-item              navmenu-basic__item                  navmenu-id-corporate']//a[contains(.,'Corporate')]")).click();
    Thread.sleep(5000);
    driver.navigate().back();
    driver.findElement(By.xpath("//summary[contains(.,'Gardening')]")).click();
    Thread.sleep(3000);
    driver.navigate().forward();

    driver.quit();
}
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver=new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        ExtraMethodsSelenium e = new ExtraMethodsSelenium();
//        e.A(driver);

        //another ways to lunch url using navigate we can go back forward also and refresh also
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.in/");
        //to go back
        driver.navigate().back();
        WebElement email = driver.findElement(By.id("email"));
        //perform right click
//        actions.contextClick(email).build().perform();
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
        driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
//        driver.findElement(By.id("pass")).sendKeys(Keys.);
        // doing refresh
        driver.navigate().refresh();

        //using robot class for scroll down
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        //using actions Class to scroll down
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();


        //another ways of writing xpath using text() these will work only for text
        // span[text()='Zip code']
        //span[.='Zip code']
        //span[contains(.,'Next')]

        //using and
        //div[@class='_4rR01T' and text()='MOTOROLA Edge 40 Neo (Caneel Bay, 256 GB)']
        //div[@class='_4rR01T' and .='MOTOROLA Edge 40 Neo (Caneel Bay, 256 GB)']


//        different xpath methods

        //summary[contains(.,'Gardening')]
//        contains methods only for text
        //for use indexing we have to write xpath this way
        //-->     (//span[.='x'])[1]

        //to upload file we should use sendkeys method but where type=file should be there
        //we have to Shift+right Click on the perticular file then an extra option will be display as copy as path
        //then it will show like this "C:\Users\HP\Pictures\r4.PNG" but we have to edit like this
        //                             C:\\Users\\HP\\Pictures\\r4.PNG
//        driver.findElement(By.xpath()).sendKeys("C:\\Users\\HP\\Pictures\\r4.PNG");

    }
}
