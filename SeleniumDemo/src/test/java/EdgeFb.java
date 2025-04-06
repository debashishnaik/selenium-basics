import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeFb {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");
        Thread.sleep(5000);
        driver.close();
    }
}
