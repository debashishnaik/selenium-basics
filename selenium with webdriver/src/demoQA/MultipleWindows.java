package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String parrentWindow = driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        String child1window="";
        for (String win: windowHandles){
            if (!win.equals(parrentWindow)){
                child1window=win;
                driver.switchTo().window(win);
                break;
            }
        }
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//        driver.quit();

        driver.switchTo().window(parrentWindow);
        driver.findElement(By.id("windowButton")).click();
        windowHandles=driver.getWindowHandles();
        for (String win : windowHandles){
            if (!win.equals(parrentWindow)&&win.equals(child1window)){
                driver.switchTo().window(win);
//                driver.close();
            }
        }
        driver.switchTo().window(child1window);

    }
}
