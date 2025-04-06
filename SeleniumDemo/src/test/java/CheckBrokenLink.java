import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBrokenLink {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");
        //find hyperlinks
        List<WebElement> list=driver.findElements(By.tagName("a"));

        System.out.println(list.size());
        for(WebElement el : list) {
            String url=el.getAttribute("href");

        }

        driver.close();



    }
}
