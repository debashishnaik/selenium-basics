package frameworPOM.withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegisterTest {
    public void RegisterWithMAndotory(WebDriver driver,Webelements2 we2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        we2.registerLink();
        we2.name("deba");
        we2.Loginname("deba123");
        we2.email("deba@gmail.com");
        Thread.sleep(3000);
        we2.next();

        Thread.sleep(5000);
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        new RegisterTest().RegisterWithMAndotory(driver,new Webelements2(driver));
    }


}
