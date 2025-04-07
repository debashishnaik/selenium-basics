package cyclosTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HomepageLinks {
    WebDriver driver;
    Actions actions;

    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterClass
    public void close(){
        driver.quit();
    }
    @BeforeMethod
    public void lunchurl(){
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
    }
    @Test(priority = 1,description = "check the title of the url")
    public void getTitleAndLinks(){
        String expectedTitle="Home - Cyclos";
        //adding soft assert
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(driver.getTitle(),expectedTitle,"verify title");

        String excpLogoname="Cyclos";
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='navbar-brand flex-grow-1']//div")).getText(),excpLogoname,"verify logoname");
        String excpHome="Home";
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='menu_home']//div[text()='Home']")).getText(),excpHome,"verify home link");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='menu_home']//div[text()='Home']")).isDisplayed(),true,"verify home link");
        String excphelp="Help";
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='help-link']//div[text()=' Help ']")).getText(),excphelp,"verify help link");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='help-link']//div[text()=' Help ']")).isDisplayed(),true,"verify help link");
        String excpReg="Register";
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='register-link']//div[text()=' Register ']")).getText(),excpReg,"verify register link");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='register-link']//div[text()=' Register ']")).isDisplayed(),true,"verify register link");

        String excpLogin="Login";
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).getText(),excpLogin,"verify login link");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).isDisplayed(),true,"verify login link");

        String excpLink="Information";
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).getText(),excpLink,"verify info link");
        Assert.assertEquals(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).isDisplayed(),true,"verify info link");
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']"))).build().perform();

    }
    @Test(priority = 2,description = "verify click all nav links")
    public void clickNavLinks(){
        driver.findElement(By.xpath("//a[@id='help-link']//div[text()=' Help ']")).click();
        driver.findElement(By.xpath("//a[@id='register-link']//div[text()=' Register ']")).click();
        driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).click();
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        driver.findElement(By.xpath("//a[@id='menu_home']")).click();

    }
    @Test(priority = 3,description = "verify the information menus")
    public void InfoLink() throws InterruptedException {
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='About Cyclos']")).click();

        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();
        driver.findElement(By.xpath("//div[text()='Example full width']")).click();
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();
        driver.findElement(By.xpath("//div[text()='Contact form']")).click();
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();
        driver.findElement(By.xpath("//div[text()='Help']")).click();


    }

    @Test(priority = 4,description = "verify the contact form")
    public void ContactForm(){
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();

    }

    @Test(priority = 5,description = "verify the login functionality with valid data")
    public void loginWithValid() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='logout-trigger']")).click();
    }
    @Test(priority = 6,description = "verify the login functionality without giving data")
    public void loginWithInvalid() throws InterruptedException {

        driver.get("https://demo.cyclos.org/ui/home");
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        Thread.sleep(5000);
        //check error message after giving wrong login details
        String excpErr="The given name / password are incorrect. Please, try again.";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(driver.findElement(By.xpath("//div[text()='The given name / password are incorrect. Please, try again.']")).getAttribute("textContent"),excpErr,"verify error message");

    }
    @Test(priority = 7,description = "verify register link",invocationCount = 3)//invocationcount use to rerun the testcase multiple time according to entered value
    public void register() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='register-link']//div[text()=' Register ']")).click();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(driver.findElement(By.xpath("//span[text()='Name']")).getText(),"Name","verify name");
//        Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Name']")).getText(),"Name","verify name");

        driver.findElement(By.id("id_1")).sendKeys("deba");
        driver.findElement(By.id("id_2")).sendKeys("deba123");
        driver.findElement(By.id("id_3")).sendKeys("deba123@gmail.com");
        driver.findElement(By.id("website")).sendKeys("deba.com");
        driver.findElement(By.id("business_type")).click();
        driver.findElement(By.id("business_type_furniture")).click();
        driver.findElement(By.id("id_4")).sendKeys("12345678901");
        driver.findElement(By.id("id_5")).sendKeys("12345678901");

        driver.findElement(By.xpath("//label[@for='gender_7762070814178012479']")).click();

        Thread.sleep(2000);
//        driver.findElement(By.id("id_6")).click();
//        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();

    }








}
