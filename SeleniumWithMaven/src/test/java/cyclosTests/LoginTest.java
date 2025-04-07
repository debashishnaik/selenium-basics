package cyclosTests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.cyclos.Login;

import java.io.IOException;

public class LoginTest extends Login {
    WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
    @AfterClass
    public void close(){
        closeAllBrowsers();
    }
    @Test(description = "verify login ")
    public void login() throws InterruptedException, IOException {
        Thread.sleep(2000);
        MouseHover(driver,infoLink);
        Thread.sleep(5000);
        Click(driver,loginBtn);
        SendKeys(driver,userName,"demo");
        SendKeys(driver,password,"1234");
        Click(driver,submitbtn);
        Thread.sleep(3000);
//        ScreenShot(driver,"homeapge.png");




//        Reporter.log("hi test",true);
//        System.out.println("hii");

    }

}
