package vistaprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnPrintedTshirt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.vistaprint.in/");
        driver.manage().window().maximize();
        //parent to child xpath
        driver.findElement(By.xpath("//div[@class='swan-carousel-slide']//a[text()='Printed T-Shirts']")).click();
        Thread.sleep(2000);
        //using text method

        driver.findElement(By.xpath("//a[text()='Full Sleeves T-Shirts']")).click();

    }
}
