import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\selenium with webdriver\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.close();


        System.out.println("hello selenium!!");


    }
}