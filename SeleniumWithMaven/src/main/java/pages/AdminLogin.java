package pages;

import generic.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminLogin extends Generic {
    public By username=By.id("username");
    public By password=By.id("password");
    public By submit=By.xpath("//input[@type='submit']");
    public By dashboard=By.xpath("//h1[.='Dashboard']");


    public boolean Login(WebDriver driver,String uname,String passw){
        try {
            SendKeys(driver,username,uname);
            SendKeys(driver,password,passw);
            Click(driver,submit);
            Thread.sleep(3000);
            return true;
        }catch (Exception e){
            return false;
        }



    }
}
