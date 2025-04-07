package cyclosTests;

import generic.Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.cyclos.Login;
import pages.cyclos.My_voucher;

import java.io.IOException;

public class VerifyingMyVoucherSection extends Generic {
    WebDriver driver;
    Actions actions;
    @BeforeClass
    public void setup() throws IOException {
        driver = lunch();
    }
//    @AfterClass
    public void close(){
        closeAllBrowsers();
    }

    @Test
    public void verifyMyVoucherSect() throws InterruptedException {
        actions=new Actions(driver);
        Login login = new Login();
        Click(driver,login.loginBtn);
        SendKeys(driver,login.userName,"demo");
        SendKeys(driver,login.password,"1234");
        Click(driver,login.submitbtn);

        My_voucher myVoucher = new My_voucher();
        Click(driver,myVoucher.myvoucherSec);
        scrollDown(actions);
        Thread.sleep(3000);
        Click(driver,myVoucher.boughtRadiobtn);
        Thread.sleep(2000);
        Click(driver,myVoucher.sentRadioBtn);

    }



}
