package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplteWithDynamicXpath {
    public void dynamicText(WebDriver driver, String text){
//        driver.findElement(By.xpath("//div[text()='JavaScript']/.."));
        driver.findElement(By.xpath("//div[text()='"+text+"']/..")).click();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/autocomplete/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        String t="Asp";
        driver.findElement(By.id("tags")).sendKeys(t);
        Thread.sleep(2000);
        new AutoComplteWithDynamicXpath().dynamicText(driver,t);
    }
}
