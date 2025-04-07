package vistaprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClickOnAllMenu {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.vistaprint.in/");
        driver.manage().window().maximize();
        List<WebElement> elements = driver.findElements(By.xpath("//nav[@data-mobile-menu-title]//ul//button"));
        for (int i=0;i<=elements.size()-1;i++){
            elements = driver.findElements(By.xpath("//nav[@data-mobile-menu-title]//ul//button"));
            //due to upper line we did not find StaleElementReferenceException if we donot add the object of list
            // in the loop so we will get StaleElementReferenceException because when click method call the page
            //will refresh and the old object will destroy and it will not exist so we have to resassign the object
            //in the for loop so the click function get the object

            WebElement e = elements.get(i);
            e.click();
        }
//        driver.quit();
    }
}
