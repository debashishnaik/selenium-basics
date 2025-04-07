package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\selenium with webdriver\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("deba");
        driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("ameerpeet hyderabad");
        driver.findElement(By.id("permanentAddress")).sendKeys("rkl odisha");
        driver.findElement(By.id("submit")).click();


    }
}
