package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.time.Duration;

public class TestngExamples {
    static WebDriver driver;
    static Actions actions;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions=new Actions(driver);

    }
    @AfterClass
    public void close(){
        driver.quit();
    }
    @BeforeMethod
    public  void lunchUrl(){
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void endcase(){
        driver.switchTo().defaultContent();
//        driver.close();
    }

    //if we donont give priority then it win run in alphbitical order
    @Test(priority = 1)
    public void dragdrop(){
        driver.findElement(By.linkText("Droppable")).click();
        driver.switchTo().frame(0);
        WebElement target = driver.findElement(By.id("draggable"));
        WebElement source = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(target,source).build().perform();
    }
    @Test(priority = 2)
    public void dragable(){
        driver.findElement(By.linkText("Draggable")).click();
        driver.switchTo().frame(0);
        WebElement t = driver.findElement(By.id("draggable"));
        actions.dragAndDropBy(t,10,50).build().perform();
    }


}
