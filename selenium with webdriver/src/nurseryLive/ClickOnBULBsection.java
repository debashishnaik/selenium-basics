package nurseryLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnBULBsection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://nurserylive.com/?utm_source=SHP_Google&utm_campaign=17794257546&utm_medium=147586795188&utm_content=611380163240&utm_term=&gclid=CjwKCAiA9ourBhAVEiwA3L5RFvBaXwZDPjPcugB3mxwkcdktkhxWYR_FypTzqloy8KnBpM8UsMnw_RoCtyAQAvD_BwE");
        driver.manage().window().maximize();
        //parent to child xpath
        driver.findElement(By.xpath("//div[@class='logolist--item']//a[@href='/collections/flower-bulbs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//figure[@class='productitem--image']//img[@src='//nurserylive.com/cdn/shop/products/nurserylive-bulbs-zephyranthes-lily-rain-lily-red-bulbs-16969440723084_512x512.jpg?v=1634231926']")).click();





    }
}
