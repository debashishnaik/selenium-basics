package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();

        Thread.sleep(2000);
//        driver.switchTo().frame(0);  //we can use of frame index or give the element in parameter like below
        driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //it is used to go to the another frame
        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("j");

        Thread.sleep(2000);
        driver.switchTo().defaultContent(); //it is used to go back to default frame
        driver.findElement(By.xpath("//a[text()='Button']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@class='widget']//input")).click();

        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Icons']")).click();

    }
}
