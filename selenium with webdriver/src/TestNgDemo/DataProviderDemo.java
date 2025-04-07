package TestNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderDemo {
    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions=new Actions(driver);
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }

    //iphone 14
    //iphone 15
    //iphone 15pro
    @DataProvider(name = "searchdataset")
    public Object[][] searchData(){
        Object[][] data = new Object[4][2];
        data[0][0]="iphone";
        data[0][1]="14";

        data[1][0]="iphone";
        data[1][1]="15";

        data[2][0]="iphone";
        data[2][1]="15pro";

        data[3][0]="iphone";
        data[3][1]="15pro max";

        return data;
    }
    @Test(dataProvider = "searchdataset")
    public void SearchBox(String brand,String modelNo) throws InterruptedException {
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys(brand+" "+modelNo);
//        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        //click on search button using Actions Class
        actions.sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);

        js= (JavascriptExecutor) driver;
        //using javaScriptExecutor to scroll down to a element
//        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[@role='navigation' and @class='a-section a-text-center s-pagination-container']")));

        //scroll by pixel
//        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(4000);

        //checking an element or text is displayed or not
//        Assert.assertEquals(driver.findElement(By.xpath("//span[.='iPhone 14 (128 GB) - Yellow']")).getAttribute("textContent"),"iPhone 14 (128 GB) - Yellow","check iphone 14 yellow");

    }



}
