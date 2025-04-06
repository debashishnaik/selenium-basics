import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pixabay.com/images/search/wallpaper/");

        //find image link
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[3]/div/div/div[3]/div[1]/div/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/button/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div[1]/label[4]/div/span[1]")).click();
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div[2]/a[1]/span")).click();
    }
}
