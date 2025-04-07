package pages.mocks;

import generic.Generic;
import org.openqa.selenium.By;

public class AdminLoginPage extends Generic {
    public By username= By.name("username");
    public By password=By.name("password");
    public By sumbitBtn=By.xpath("//button[contains(.,'Sign in')]");

    public void login() throws InterruptedException {
        SendKeys(driver,username,"mocks");
        SendKeys(driver,password,"mocks@123");
        Click(driver,sumbitBtn);
        Thread.sleep(4000);
    }

}
