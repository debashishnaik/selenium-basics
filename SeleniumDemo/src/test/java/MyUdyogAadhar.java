import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyUdyogAadhar {
    public static void Login(ChromeDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://myudyogaadhar.org/");
        driver.findElement(By.name("applicant_name")).sendKeys("Deba Naik");
        driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //dropdown
        WebElement nameOfEnterprize=driver.findElement(By.id("organisation_type"));
        WebElement gender=driver.findElement(By.id("gender"));
        WebElement officeState = driver.findElement(By.id("office_state"));
        WebElement mainBusinessActivity = driver.findElement(By.id("main_business_activity"));

        Select namEdropdown=new Select(nameOfEnterprize);
        Select genderDropdown=new Select(gender);
        Select officeStateDropdown = new Select(officeState);
        Select mainbusinessDropdown = new Select(mainBusinessActivity);


        namEdropdown.selectByValue("Public Limited");
        genderDropdown.selectByVisibleText("Female");
        officeStateDropdown.selectByVisibleText("TELANGANA");
        mainbusinessDropdown.selectByVisibleText("Service provider");

        driver.findElement(By.id("name_of_ent")).sendKeys("Software");



        driver.findElement(By.id("office_address")).sendKeys("chasc sjcbacb ajcbahbc");
        driver.findElement(By.id("office_district")).sendKeys("Hyderabad");
        driver.findElement(By.id("office_pin")).sendKeys("500073");


        driver.findElement(By.id("tems_and_cond_checkbox")).click();

        Thread.sleep(5000);
        driver.findElement(By.id("complete_application")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/a/i")).click();

    }

    public static void DataBankRegister(ChromeDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://myudyogaadhar.org/");

        driver.findElement(By.linkText("Databank Registation")).click();

        driver.findElement(By.id("aadhaar_no")).sendKeys("123456789012");
        driver.findElement(By.id("applicant_name")).sendKeys("Deba Naik");
        driver.findElement(By.id("uan")).sendKeys("hbahfaf545466");
        driver.findElement(By.id("pan_number")).sendKeys("hjxabdba88788");
        driver.findElement(By.id("mobile_no")).sendKeys("78945610235");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        //dropdown
        WebElement state1 = driver.findElement(By.id("state_1"));
        Select statedropdown = new Select(state1);
        statedropdown.selectByVisibleText("ODISHA");

        driver.findElement(By.id("office_district")).sendKeys("sundergarh");
        driver.findElement(By.id("product_name")).sendKeys("Iphone");
        driver.findElement(By.id("product_desc")).sendKeys("scbbhcs n chjasc jcacajksc cjbj");
        driver.findElement(By.id("product_capacity")).sendKeys("100kg");

        WebElement prodMeasurementUnit = driver.findElement(By.id("prod_measurement_unit"));
        Select productMeasurementUnit = new Select(prodMeasurementUnit);
        productMeasurementUnit.selectByVisibleText("Kilogram");
        driver.findElement(By.id("tems_and_cond_checkbox")).click();

        Thread.sleep(5000);
        driver.findElement(By.id("complete_application")).click();

        Thread.sleep(5000);
        String header = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h5")).getText();
        System.out.println(header);
        String expected="Verify Details";
        System.out.println(expected.equals(header));

    }

}
