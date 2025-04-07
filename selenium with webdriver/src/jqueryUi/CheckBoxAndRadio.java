package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadio {
    public void radioButton(WebDriver driver) throws InterruptedException {
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//fieldset//label[text()='London']")).click();
        Thread.sleep(3000);
    }

    public void checkBox(WebDriver driver) throws InterruptedException {
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//fieldset//label[text()='4 Star']//span[1]")).click();
        Thread.sleep(3000);
    }
    public void multipleCheckBox(WebDriver driver){
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//fieldset//label[@for='checkbox-nested-2']//span[1]")).click();
        driver.findElement(By.xpath("//fieldset//label[@for='checkbox-nested-3']//span[1]")).click();
    }
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        new CheckBoxAndRadio().radioButton(driver);
        new CheckBoxAndRadio().checkBox(driver);
        new CheckBoxAndRadio().multipleCheckBox(driver);

    }
}
