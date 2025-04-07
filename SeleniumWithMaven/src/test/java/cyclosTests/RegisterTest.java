package cyclosTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.cyclos.Register;

import java.io.IOException;

public class RegisterTest extends Register {
    WebDriver driver;
    @BeforeMethod
    public void setup() throws IOException {
        driver = lunch();
    }
//    @AfterClass
//    public void close(){
//        closeAllBrowsers();
//    }
    @Test(description = "validate the register")
    public void register() throws InterruptedException {
        Click(driver,registerLink);
        SendKeys(driver,name,"deba");
        SendKeys(driver,loginname,"deba123");
        SendKeys(driver,email,"deba123@gmail.com");
        SendKeys(driver,website,"deba.com");
        SendKeys(driver,mobilNumber,"1234567890");
        SendKeys(driver,landLine,"4567891230");
        Click(driver,businessTypeDropdown);
        Click(driver,businessTypeFurnitureValue);
        Click(driver,gender);
        Thread.sleep(5000);
        Click(driver,nextBtn);

    }

}
