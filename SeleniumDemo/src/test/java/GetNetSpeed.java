import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNetSpeed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.fast.com");
        Thread.sleep(15000);
        String speed= driver.findElement(By.id("speed-value")).getText();
        driver.close();
        System.out.println(speed);
    }
}
