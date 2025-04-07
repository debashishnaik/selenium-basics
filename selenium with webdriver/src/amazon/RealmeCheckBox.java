package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealmeCheckBox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_36%3A1318507031&dc&qid=1701151212&rnid=1318502031&ref=lp_1389401031_nr_p_36_4");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='realme']/..")).click();
        //pay on delivery
        driver.findElement(By.xpath("//span[text()='Eligible for Pay On Delivery']/..")).click();
    }
}
