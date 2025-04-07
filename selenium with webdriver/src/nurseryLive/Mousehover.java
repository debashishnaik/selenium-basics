package nurseryLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mousehover {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://nurserylive.com/?utm_source=SHP_Google&utm_campaign=17794257546&utm_medium=147586795188&utm_content=611380163240&utm_term=&gclid=CjwKCAiA9ourBhAVEiwA3L5RFvBaXwZDPjPcugB3mxwkcdktkhxWYR_FypTzqloy8KnBpM8UsMnw_RoCtyAQAvD_BwE");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Actions actions = new Actions(driver);https://nurserylive.com/?utm_source=SHP_Google&utm_campaign=17794257546&utm_medium=147586795188&utm_content=611380163240&utm_term=&gclid=CjwKCAiA9ourBhAVEiwA3L5RFvBaXwZDPjPcugB3mxwkcdktkhxWYR_FypTzqloy8KnBpM8UsMnw_RoCtyAQAvD_BwE
        actions.moveToElement(driver.findElement(By.xpath("//ul[@class='navmenu navmenu-depth-1']//summary[@data-href='/collections/gifts']"))).build().perform();
//        actions.moveToElement(driver.findElement(By.xpath("//ul[@class='navmenu navmenu-depth-1']//summary[@data-href='/collections/gifts']"))).build().perform();



    }
}
