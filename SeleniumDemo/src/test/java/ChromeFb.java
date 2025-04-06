import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFb {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        int height = driver.findElement(By.name("email")).getSize().getHeight();
        System.out.println(height);
        int width = driver.findElement(By.name("email")).getSize().getWidth();
        System.out.println(width);

        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abc123");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
//        driver.close();
    }
}
