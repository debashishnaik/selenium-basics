package mockWebsiteTests;

import generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.mocks.AdminLoginPage;

import java.io.IOException;

public class FacultyLogin extends Generic {
    WebDriver driver;
    Actions actions;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
    @AfterClass
    public void close(){
        closeAllBrowsers();
    }

    @Test(description = "login to the faculty module")
    public void Login() throws InterruptedException {
        AdminLoginPage fl = new AdminLoginPage();
        SendKeys(driver,fl.username,"mocks");
        SendKeys(driver,fl.password,"mocks@123");
        Click(driver,fl.sumbitBtn);
        Thread.sleep(4000);

    }

}
