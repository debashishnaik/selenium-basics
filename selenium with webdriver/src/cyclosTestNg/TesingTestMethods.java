package cyclosTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class TesingTestMethods {
    public void Register(WebDriver driver) throws InterruptedException, AWTException {
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[@id='register-link']//div[text()=' Register ']")).click();
        driver.findElement(By.id("id_1")).sendKeys("deba");
        driver.findElement(By.id("id_2")).sendKeys("deba123");
        driver.findElement(By.id("id_3")).sendKeys("deba123@gmail.com");
        driver.findElement(By.id("website")).sendKeys("deba.com");
        driver.findElement(By.id("business_type")).click();
        driver.findElement(By.id("business_type_furniture")).click();
        driver.findElement(By.id("id_4")).sendKeys("12345678901");
        driver.findElement(By.id("id_5")).sendKeys("12345678901");
        //check error message after write wrong phone number
//        String error_msg = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
//        System.out.println(error_msg);
        //verify text before text field
//        String name = driver.findElement(By.xpath("//span[text()='Name']")).getText();
//        System.out.println(name);
//        String loginName = driver.findElement(By.xpath("//span[text()='Login name']")).getText();
//        System.out.println(loginName);

        driver.findElement(By.xpath("//label[@for='gender_7762070814178012479']")).click();
        //click on toggle using javascriptExecutor
        WebElement toggle = driver.findElement(By.id("id_6"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",toggle);
        driver.findElement(By.id("addressLine1")).sendKeys("ameerpet hyderabad");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(2000);
        //to scroll down
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(5000);

        driver.quit();


    }
    public void login(WebDriver driver){
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[@id='login-link']//div[text()=' Login ']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//span[text()='Submit']")).click();
        String error = driver.findElement(By.xpath("//div[text()='The given name / password are incorrect. Please, try again.']")).getAttribute("textContent"); //here using getAttribute("textContent") where gettext method is not working

        System.out.println(error);
        driver.quit();

    }
    public void ContactForm(WebDriver driver,Actions actions) throws InterruptedException {
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Contact form']")).click();
//        driver.findElement(By.name("your-recipient")).click();
//        Select dropdown = new Select(driver.findElement(By.xpath("//select[@name]")));
//        dropdown.selectByValue("Investor Relations");
        driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys("deba");
        driver.findElement(By.name("your-email")).sendKeys("deba@gmail.com");
        driver.findElement(By.name("your-subject")).sendKeys("testing");
        driver.findElement(By.name("your-message")).sendKeys("testing");
        String text = driver.findElement(By.xpath("//img[@alt]")).getText();
        System.out.println(text);


    }
    public void HoverIngOnInfoLink(WebDriver driver,Actions actions) throws InterruptedException {
        driver.get("https://demo.cyclos.org/ui/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        Actions actions = new Actions(driver);



        TesingTestMethods tt = new TesingTestMethods();
        //tt.HoverIngOnInfoLink(driver,actions);
//        tt.ContactForm(driver,actions);
//        tt.login(driver);
        tt.Register(driver);



//        driver.get("https://demo.cyclos.org/ui/home");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//        String title = driver.getTitle();
//        String currentUrl = driver.getCurrentUrl();
//
//        System.out.println(currentUrl);
//        System.out.println("title is"+title);

//        //logo name
//        driver.findElement(By.xpath("//div[@class='navbar-brand flex-grow-1']//div")).isDisplayed();
//        driver.findElement(By.xpath("//div[@class='navbar-brand flex-grow-1']//div")).isEnabled();
//        String text = driver.findElement(By.xpath("//div[@class='navbar-brand flex-grow-1']//div")).getText();
//        System.out.println(text);
//        //home link
//        driver.findElement(By.xpath("//a[@id='menu_home']")).isEnabled();
//        driver.findElement(By.xpath("//a[@id='menu_home']")).isDisplayed();
//        String home = driver.findElement(By.xpath("//a[@id='menu_home']")).getText();
//        System.out.println(home);
        //hover on info link
//        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_content']"))).build().perform();
//        //information link
//        driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).isDisplayed();
//        driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).isEnabled();
//        String text1 = driver.findElement(By.xpath("//a[@id='menu_content']//div[text()='Information']")).getText();
//        System.out.println(text1);
//        driver.findElement(By.xpath("//div[text()='About Cyclos']")).click();
//
//        Thread.sleep(2000);
//        //adding robot class to scroll down to the page
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//
//        Thread.sleep(5000);



//        driver.quit();
    }
}
