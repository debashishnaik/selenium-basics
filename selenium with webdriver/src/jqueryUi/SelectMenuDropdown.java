package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectMenuDropdown {

    public static void list(List<WebElement> list , String text) throws InterruptedException {
        for (WebElement l: list){
            if (l.getText().equals(text)){
                l.click();
                break;
            }
        }
    }
    void controlGroupDropDown(WebDriver driver){
        driver.get("https://jqueryui.com/controlgroup/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.id("car-type-button")).click();

//        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='car-type-menu']"));
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='car-type-menu']//li"));
        for (WebElement e:elements){
            System.out.println(e.getText());
            if (e.getText().equals("SUV")){
                e.click();
            }
        }
    }
    void selectTitle(WebDriver driver) throws InterruptedException {
        driver.get("https://jqueryui.com/selectmenu/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[@id='salutation-button']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='salutation-menu']//li"));

        list(elements,"Prof.");

    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        //dropdown of number select
        driver.get("https://jqueryui.com/selectmenu/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//span[@id='number-button']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='number-menu']//li[@class='ui-menu-item']"));
        new SelectMenuDropdown().list(elements,"19");

            //calling the cartype method
//        new SelectMenuDropdown().controlGroupDropDown(driver);

//        driver.get("https://jqueryui.com/controlgroup/");
//        driver.manage().window().maximize();
//        driver.switchTo().frame(0);
//        driver.findElement(By.id("car-type-button")).click();
//
////        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='car-type-menu']"));
//        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='car-type-menu']//li"));
//
//        new SelectMenuDropdown().list(elements,"Van");

        //calling selectTitle method
//        new SelectMenuDropdown().selectTitle(driver);



    }
}
