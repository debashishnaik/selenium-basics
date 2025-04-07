package mockWebsiteTests;

import generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.mocks.AdminLoginPage;
import pages.mocks.FacultyPage;

import java.io.IOException;

public class CreateNewFaculty extends Generic {
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

    @Test(description = "creating a new faculty")
    public void createFaculty() throws InterruptedException, IOException {
        new AdminLoginPage().login();
        FacultyPage fp = new FacultyPage();
        Click(driver,fp.facultySection);
        Thread.sleep(3000);
        SendKeys(driver,fp.fullName,"jnaja cjnac");
        SendKeys(driver,fp.email,"chacjk5456@gmail.com");
        SendKeys(driver,fp.mobileNo,"3566566433");
        SendKeys(driver,fp.highestQualification,"caca cnacj");
        Click(driver,fp.submitBtn);
        Thread.sleep(4000);
        ScreenShot(driver,"after_creating_a_faculty_without_dropdown_entries.png");

    }
}
