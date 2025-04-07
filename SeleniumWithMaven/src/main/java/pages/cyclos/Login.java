package pages.cyclos;

import generic.Generic;
import org.openqa.selenium.By;

public class Login extends Generic {

    public By infoLink=By.xpath("//a[@id='menu_content']//div[text()='Information']");
    public By loginBtn=By.xpath("//a[@id='login-link']//div[text()=' Login ']");
    public By userName=By.xpath("//input[@autocomplete='username']");
    public By password=By.xpath("//input[@autocomplete='password']");

    public By submitbtn=By.xpath("//span[text()='Submit']");

}
