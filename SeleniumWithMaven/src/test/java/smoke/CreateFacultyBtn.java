package smoke;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateFaculty;

import java.io.IOException;

public class CreateFacultyBtn extends CreateFaculty {
    @BeforeClass
    public void loadApp() throws IOException {
        driver=lunch();
    }

    @AfterClass
    public void close(){
        closeAllBrowsers();
    }
    @Test(description = "click on Create faculty btn",priority = 1)
    public void ClickOnCreateFaculty() throws InterruptedException, IOException {
//        Click(driver,facultySection);
        Login(driver,"CapstoneTesting","123");
//        ScreenShotOfA_Part(driver,facultySection,"facultySection.png");
        clickOnCreateAFcultyBtn();
        Thread.sleep(4000);
        createFacultyForm("deepakdswww","Testing","Tester","6165787892","deepak1241@gmail.com","springboot","C:\\Users\\HP\\IdeaProjects\\SeleniumWithMaven\\src\\test\\resources\\r6.PNG");
        Thread.sleep(3000);
//            driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        if (!display(driver, table)){
//            Thread.sleep(3000);
//        }
        //verifying new faculty details is added or not
        Assert.assertTrue(display(driver,table));

    }
    @Test(description = "click on search btn",priority = 2)
    public void searchBtn() throws InterruptedException {
        Login(driver,"Capstone","123456");
        Click(driver,facultySection);
        search();
        Thread.sleep(3000);
    }


}
