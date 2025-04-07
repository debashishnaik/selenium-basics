package cyclosTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.cyclos.FooterLinks;

import java.io.IOException;

public class FooterLinksTest extends FooterLinks {
    WebDriver driver;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
    @AfterClass
    public void close(){
        closeAllBrowsers();
    }
    @Test(description = "check footerLinks")
    public void CheckFooterLinks() throws InterruptedException {
        Click(driver,stro);
        goBack(driver);
        Click(driver,newzletter);
        goBack(driver);
        Click(driver,contact);
        goBack(driver);
        Thread.sleep(4000);
        Click(driver,overview);
        goBack(driver);
        Click(driver,installation);
        goBack(driver);
        Click(driver,wiki);
        goBack(driver);
        Click(driver,faq);
        goBack(driver);
        Click(driver,fourm);
        goBack(driver);
        Click(driver,support);
        goBack(driver);
        Click(driver,fbLink);
        goBack(driver);
        Click(driver,twtLink);
        Thread.sleep(4000);

    }



}
