package cyclosTests;

import base.Browser;
import generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.cyclos.DirectoryPage;
import pages.cyclos.Login;

import java.io.IOException;

public class DirectoryPageTest extends Generic {
    WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
    @AfterClass
    public void close(){
        closeAllBrowsers();
    }

    @Test(description = "verify the directory page")
    public void verifyDirectorypage() throws InterruptedException, IOException {
        Login login = new Login();
        Click(driver,login.loginBtn);
        SendKeys(driver,login.userName,"demo");
        SendKeys(driver,login.password,"1234");
        Click(driver,login.submitbtn);
        Thread.sleep(3000);
        DirectoryPage directoryPage = new DirectoryPage();
        Click(driver,directoryPage.directorySection);
        Thread.sleep(2000);
//        ScreenShot(driver,"directorypage.png");
//        scrollDown(new Actions(driver));
        Click(driver,directoryPage.listView);
        Thread.sleep(2000);
        ScreenShot(driver,"directorypageListview1.png");
        Thread.sleep(4000);



    }



}
