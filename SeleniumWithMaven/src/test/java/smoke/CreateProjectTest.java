package smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateProject;

import java.io.IOException;

public class CreateProjectTest extends CreateProject {
    WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
//    @AfterClass
//    public void close(){
//        closeAllBrowsers();
//    }
    @Test(description = "verify the form of create project")
    public void Form(){
        createProjectForm();

    }
}
