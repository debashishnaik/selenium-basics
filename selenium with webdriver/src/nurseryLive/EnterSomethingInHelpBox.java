package nurseryLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterSomethingInHelpBox {
    public static void main(String[] args) {
        //it did not work
        WebDriver driver=new ChromeDriver();
        driver.get("https://nurserylive.com/?utm_source=SHP_Google&utm_campaign=17794257546&utm_medium=147586795188&utm_content=611380163240&utm_term=&gclid=CjwKCAiA9ourBhAVEiwA3L5RFvBaXwZDPjPcugB3mxwkcdktkhxWYR_FypTzqloy8KnBpM8UsMnw_RoCtyAQAvD_BwE");

        driver.manage().window().maximize();
        driver.findElement(By.className("small-promo-content_heading")).click();
        driver.findElement(By.id("searchInput")).sendKeys("Order status");
        driver.findElement(By.xpath("//span[@class='icon-search']")).click();

    }
}
