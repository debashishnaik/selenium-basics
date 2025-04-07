package jqueryUi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class DatePickerTable {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        driver.findElement(By.xpath("//a[@data-date='5']")).click();

        List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler]//a[@data-date]"));
//        for (WebElement d:dates){
//            System.out.println(d.getText());
//        }
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//th"));
        for (WebElement d:days){
            System.out.println(d.getText());
        }


        //adding calender using java
        Calendar calendar = Calendar.getInstance();

//        if(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals("December")){
//            System.out.println("Ture");
//        }
//        String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//        int y= Integer.parseInt(year);
//
//
//        int cy = calendar.get(Calendar.YEAR);
//        if (y==cy){
//            System.out.println("True");
//        }
        driver.quit();
    }
}
