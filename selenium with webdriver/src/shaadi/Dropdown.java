package shaadi;

import jqueryUi.SelectMenuDropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    void gender(WebDriver driver) throws InterruptedException {
        driver.get("https://www.shaadi.com/");

        driver.findElement(By.xpath("//div[@data-testid='preference_gender_field']//div[1]//div[@aria-haspopup]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='Dropdown-menu']//div"));
        SelectMenuDropdown.list(elements,"Man");
    }
    void ageStart(WebDriver driver) throws InterruptedException {
        driver.get("https://www.shaadi.com/");
//        driver.findElement(By.xpath("//div[@data-testid='preference_age_from_field']")).click();
//        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-testid='preference_age_from_field']//div[@class='Dropdown-option']"));
        Thread.sleep(3000);
        SelectMenuDropdown.list(elements,"24");
    }
    void religion(WebDriver driver) throws InterruptedException {
        driver.get("https://www.shaadi.com/");
        driver.findElement(By.xpath("//div[@class='Dropdown-control']//div[text()='Select']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-testid='preference_religion_field']//div[@class='Dropdown-option']"));
        SelectMenuDropdown.list(elements,"Hindu");

    }
    void motherTongue(WebDriver driver) throws InterruptedException {
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.shaadi.com/");
        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[@class='Dropdown-root']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[@class='Dropdown-option']"));

        SelectMenuDropdown.list(elements,"Hindi");
    }
    //using explicit wait
//    void motherTongueWithoutListMethodod(WebDriver driver,Wait<WebDriver> wait) throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.shaadi.com/");
//        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[@class='Dropdown-root']")).click();
//
//        WebElement lang = driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));
//        wait.until(ExpectedConditions.elementToBeClickable(lang));
//        lang.click();
//
//
////        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));
//
//
//    }
    //using actions class
//void motherTongueWithoutListMethodod(WebDriver driver, Actions actions) throws InterruptedException {
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    driver.get("https://www.shaadi.com/");
//    driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[@class='Dropdown-root']")).click();
//
//    WebElement lang = driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));
//    actions.moveToElement(lang).click().build().perform();
//
//
//
////        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));
//
//
//}
    //using javascriptexecuter
void motherTongueWithoutListMethodod(WebDriver driver) throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.shaadi.com/");
    driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[@class='Dropdown-root']")).click();

    WebElement lang = driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));

    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",lang);



//        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Odia']"));


}


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Wait<WebDriver> wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        Actions actions=new Actions(driver);

        Dropdown dropdown = new Dropdown();

        dropdown.gender(driver);
//        dropdown.ageStart(driver);
        dropdown.religion(driver);
//        dropdown.motherTongue(driver);
        dropdown.motherTongueWithoutListMethodod(driver);









//        driver.get("https://www.shaadi.com/");
//        driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']")).click();
//        Thread.sleep(3000);
//        WebElement oriya = driver.findElement(By.xpath("//div[@data-testid='preference_mother_tongue_field']//div[text()='Oriya']"));

//        Element not visible due to requirement of scroll down
//        Sample Code: WebElement element = driver.findElement(element locator);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element); element.click();


    }
}
