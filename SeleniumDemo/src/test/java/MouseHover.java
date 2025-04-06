import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.gonoise.com/");

        WebElement Products=driver.findElement(By.id("nav-FirstLevelId-0"));
        Actions actions=new Actions(driver);
        actions.moveToElement(Products).perform();
    }
}
