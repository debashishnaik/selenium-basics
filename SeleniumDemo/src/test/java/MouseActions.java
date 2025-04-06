import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://myudyogaadhar.org/");
        WebElement privacyP=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a"));
        Actions actions=new Actions(driver);

        actions.contextClick(privacyP).perform();//right click


    }
}
