package smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AdminLogin;
import pages.Home;

import java.io.IOException;



public class LoginAdmin extends AdminLogin {


    @BeforeClass
    public void loadApp() throws IOException {
        driver=lunch();
    }

    @AfterClass
    public void close(){
        closeAllBrowsers();
    }
    @Test(description = "login to the application",priority = 1)
    public void login_Validation() throws InterruptedException, IOException {
        Login(driver,"Capstone","123456");
        Thread.sleep(4000);
//        ScreenShot(driver,"CapstoneDashboard.png");
        ScreenShotOfA_Part(driver,dashboard,"dashbrd.png");


        //checking the header of the homepage
//        Assert.assertEquals(display(driver,dashboard),true);

    }



}
