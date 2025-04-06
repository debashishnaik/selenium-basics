import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Capstone {
    void withOutFacultyProfile(ChromeDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("http://183.82.103.248:8888/capstoneadmin/create_faculty/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("FacultyTitle")).sendKeys("deba");
        driver.findElement(By.id("FacultyContact")).sendKeys("123456789");
        driver.findElement(By.id("FacultyEmail")).sendKeys("abcd@gmail.com");
        //department dropdown
        WebElement dept = driver.findElement(By.name("dept"));
        Select deptDowpdown = new Select(dept);
        deptDowpdown.selectByValue("5");

        driver.findElement(By.name("skills")).sendKeys("sbfhbahfbca nc ajbaha jah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"FacultyForm\"]/div[5]/input[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"quickForm\"]/div[5]/input[1]")).click();
        Thread.sleep(3000);
        //form close
        driver.findElement(By.xpath("//*[@id=\"project_modal\"]/div/div/div[1]/button/span")).click();
        Thread.sleep(2000);
        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {


        new Capstone().withOutFacultyProfile(new ChromeDriver());
    }
}
