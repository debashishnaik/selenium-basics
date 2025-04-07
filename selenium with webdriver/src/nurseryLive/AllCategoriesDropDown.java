package nurseryLive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllCategoriesDropDown {


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://nurserylive.com/");
        driver.findElement(By.xpath("//select[@class='live-search-filter']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@class='live-search-filter']")));
        select.selectByVisibleText("Bulk Gifts");


    }
}
