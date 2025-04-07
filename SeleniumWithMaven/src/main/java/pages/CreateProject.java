package pages;

import generic.Generic;
import org.openqa.selenium.By;

public class CreateProject extends Generic {

    By createProjectSection= By.xpath("//p[contains(.,'Create Project')]");
    By cerateProjectBtn=By.xpath("//button[contains(.,'Create Project')]");
    By projectTitle=By.id("ProjectTitle");
    By projectTumbnail=By.id("customFile");
    By videoLink=By.id("VideoLink");
    By deptDropdown=By.name("Department");
    By techDropdown=By.id("Technology");
    By SpecializationDropdown=By.id("Specialization");
    By Tags=By.id("Tags");
    By exampleInputFile=By.id("exampleInputFile");
    By Notes=By.name("Notes");
    By SoftwareReq=By.name("Software");
    By HardwareReq=By.name("Hardware");
    By shortDescription=By.name("shortDescription");
    By longDescription=By.name("longDescription");
    By submitBtn=By.xpath("//input[@type='submit']");
    By resetBtn=By.xpath("//input[@type='reset']");
    By closeBtn=By.xpath("(//span[.='x'])[1]");

    public void createProjectForm(){
//        Click(driver,createProjectSection);
        Click(driver,cerateProjectBtn);

    }
}
