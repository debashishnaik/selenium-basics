package frameworPOM.withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webelements2 {
    WebDriver driver;

    public Webelements2(WebDriver driver) {
        this.driver = driver;
        //this methods will create web elements
        PageFactory.initElements(driver,this);
    }
    //login page webElemenets
    private @FindBy(xpath = "//a[@id='login-link']//div[text()=' Login ']")  WebElement loginLink;
    private @FindBy(xpath = "//input[@autocomplete='username']") WebElement username;
    private @FindBy(xpath = "//input[@autocomplete='password']") WebElement password;
    private @FindBy(xpath = "//span[text()='Submit']") WebElement submitBtn;
    //register page webelments
    private @FindBy(xpath = "//a[@id='register-link']//div[text()=' Register ']") WebElement registerLink;
    private @FindBy(id = "id_1") WebElement name;
    private @FindBy(id = "id_2") WebElement loginName;
    private @FindBy(id = "id_3") WebElement email;
    private @FindBy(id = "website") WebElement website;
    private @FindBy(id = "business_type") WebElement business_type;
    private @FindBy(id = "business_type_furniture") WebElement business_type_furniture;
    private @FindBy(id = "id_4") WebElement mobilePhn;
    private @FindBy(id = "id_5") WebElement landLine;
    private @FindBy(xpath = "//label[@for='gender_7762070814178012479']") WebElement gender;
    private @FindBy(xpath = "//span[text()='Next']") WebElement next;


    public void loginLink(){
        loginLink.click();
    }
    public void enterUserName(String uname){
        username.sendKeys(uname);
    }
    public void enterPass(String pass){
        password.sendKeys(pass);
    }
    public void submitbtn(){
        submitBtn.click();
    }
    //register page
    public  void registerLink(){
        registerLink.click();
    }
    public void name(String name){
        this.name.sendKeys(name);
    }
    public void Loginname(String Loginname){
        this.loginName.sendKeys(Loginname);
    }
    public void email(String email){
        this.email.sendKeys(email);
    }
    public void next(){
        this.next.click();
    }


}
