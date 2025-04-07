package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Browser {
    public static WebDriver driver;

    /**
     * this method will lunch the application based on info passed in Config.properties
     * @return Webdriver
     * @throws IOException :this will throw if file is not loaded or found
     */
    public WebDriver lunch() throws IOException {
        Properties obj = new Properties();
        FileInputStream fis=new FileInputStream("src/main/resources/config.properties");
        obj.load(fis);
        String browserName = obj.getProperty("browser");
//        String url = obj.getProperty("url");
        //cyclos Url
//        String url = obj.getProperty("cyclosUrl");
        //mocks website url
        String url = obj.getProperty("mocksWebsite");

        //equalsignorecase is uses to ignore capital or small letters
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.manage().window().maximize();
        }


        driver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    /**
     * This method will close the current browser opened in current session
     */
    public void closeCurrentBrowser(){
        driver.close();
    }

    /**
     * This method will close the all the browsers opened in current session
     */
    public void closeAllBrowsers(){
        driver.quit();
    }
}
