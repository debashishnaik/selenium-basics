package pages.cyclos;

import generic.Generic;
import org.openqa.selenium.By;

public class Register extends Generic {

        public By registerLink=By.xpath("//a[@id='register-link']//div[text()=' Register ']");
        public By name=By.id("id_1");
        public By loginname=By.id("id_2");
        public By email=By.id("id_3");
        public By website=By.id("website");
        public By businessTypeDropdown=By.id("business_type");
        public By businessTypeFurnitureValue=By.id("business_type_furniture");
        public By mobilNumber=By.id("id_4");
        public By landLine=By.id("id_5");

        public By gender= By.xpath("//label[@for='gender_7762070814178012479']");
        public By nextBtn= By.xpath("//span[text()='Next']");

}
