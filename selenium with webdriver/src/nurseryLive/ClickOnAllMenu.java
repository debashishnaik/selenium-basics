package nurseryLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClickOnAllMenu {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://nurserylive.com/");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.xpath("//section[@class='logolist--container']//div[@class='logolist--item']//img[@data-rimg-max='220x250']"));

        for (int i=0;i<=elements.size()-1;i++){
            elements = driver.findElements(By.xpath("//section[@class='logolist--container']//div[@class='logolist--item']//img[@data-rimg-max='220x250']"));
            WebElement e = elements.get(i);
            e.click();

        }
//        driver.close();
        driver.quit();



    }
}
