import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://myudyogaadhar.org/");
        WebElement nameOfEnterprize=driver.findElement(By.id("organisation_type"));
        WebElement gender=driver.findElement(By.id("gender"));

        Select namEdropdown=new Select(nameOfEnterprize);
        Select genderDropdown=new Select(gender);


        namEdropdown.selectByValue("Public Limited");
        genderDropdown.selectByVisibleText("Female");

        //get all the dropdownlist items
        List<WebElement> allitems=namEdropdown.getOptions();
        for(WebElement e: allitems){
            System.out.println(e.getText());
        }


    }
}
