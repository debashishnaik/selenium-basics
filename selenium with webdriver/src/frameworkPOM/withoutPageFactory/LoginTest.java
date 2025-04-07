package frameworkPOM.withoutPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Webelments we = new Webelments(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        we.loginLink();
        we.enterUserName("demo");
        we.enterPass("1234");
        we.submitbtn();
        Thread.sleep(5000);
        driver.quit();
    }





}
