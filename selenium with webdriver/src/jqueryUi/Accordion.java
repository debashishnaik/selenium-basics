package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordion {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Accordion']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.id("ui-id-3")).click();

        if(driver.findElement(By.id("ui-id-3")).isEnabled()){
            System.out.println(driver.findElement(By.xpath("//div[@id='ui-id-4']//p")).getText());
        }else {
            driver.close();
        }
        driver.quit();

    }
}
