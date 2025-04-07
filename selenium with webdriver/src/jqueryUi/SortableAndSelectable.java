package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SortableAndSelectable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/sortable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame(0);
        Actions actions=new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//li[text()='Item 1']"));

        WebElement dest = driver.findElement(By.xpath("//li[text()='Item 4']"));

        actions.clickAndHold(source).moveToElement(dest).moveByOffset(0,20).release().build().perform();
        driver.switchTo().defaultContent();
        //selectable
        driver.findElement(By.linkText("Selectable")).click();
        driver.switchTo().frame(0);
        actions.keyDown(Keys.CONTROL).build().perform();

        driver.findElement(By.xpath("//li[text()='Item 1']")).click();
        driver.findElement(By.xpath("//li[text()='Item 2']")).click();
        driver.findElement(By.xpath("//li[text()='Item 3']")).click();

        actions.keyUp(Keys.CONTROL).build().perform();






    }
}
