package pages;

import generic.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFaculty extends AdminLogin {
    //crete faculty section
    public By facultySection=By.xpath("//p[contains(.,'Create Faculty')]");
    public By createFacultyBtn=By.xpath("//button[contains(.,'Create Faculty')]");
    public By search=By.xpath("//input[@type='search']");
    public By nextBtn=By.xpath("//a[.='Next']");
    public By prevBtn=By.xpath("//a[.='Previous']");
    //createFaculty form
    public By FacultyName=By.id("FacultyTitle");
    public By FacultyContact=By.id("FacultyContact");
    public By facultyEmail=By.id("FacultyEmail");
    public By skillSet=By.xpath("//textarea[@class='form-control']");
    public By resetBtn=By.xpath("//input[@type='reset']");
    public By submitBtn=By.xpath("//input[@type='submit']");
    public By facultyProfile=By.xpath("//input[@class='custom-file-input']");
    public By deptDropdown=By.xpath("//select[@name='dept']");
    public By desigantion=By.name("design");
    public By table=By.xpath("//div[@class='card-body']");

    public  void clickOnCreateAFcultyBtn(){
        Click(driver,facultySection);
        Click(driver,createFacultyBtn);
    }
    public void createFacultyForm(){
        SendKeys(driver,FacultyName,"deba");
        drodownSelect(driver,deptDropdown,"Testing");
        drodownSelect(driver,desigantion,"manual");
        SendKeys(driver,FacultyContact,"79456123");
        SendKeys(driver,facultyEmail,"deba@gmail.com");
        SendKeys(driver,skillSet,"selenium");
        SendKeys(driver,facultyProfile,"C:\\Users\\HP\\Pictures\\dell logo.PNG");

        Click(driver,submitBtn);
    }
    public void createFacultyForm(String fname,String deptName,String desgination,String contact,String email,String skillset,String profilefile){
        SendKeys(driver,FacultyName,fname);
        drodownSelect(driver,deptDropdown,deptName);
        drodownSelect(driver,desigantion,desgination);
        SendKeys(driver,FacultyContact,contact);
        SendKeys(driver,facultyEmail,email);
        SendKeys(driver,skillSet,skillset);
        SendKeys(driver,facultyProfile,profilefile);

        Click(driver,submitBtn);
    }
    public void search(){
        SendKeys(driver,search,"testing");
    }



}
