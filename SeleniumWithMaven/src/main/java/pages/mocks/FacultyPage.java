package pages.mocks;

import org.openqa.selenium.By;

public class FacultyPage {
    public By facultySection= By.xpath("//span[contains(.,'Faculty')]");
    public By fullName=By.name("name");
    public By email=By.name("email");
    public By mobileNo=By.name("mobile_no");
    public By highestQualification=By.name("education");
    public By course=By.xpath("(//div[@class='filter-option-inner-inner' and contains(.,'Select your Course')])[2]");
    public By specialization=By.xpath("(//div[@class='filter-option-inner-inner' and contains(.,'Select your Specialization')])[2]");
    public By experience=By.xpath("//div[@class='filter-option-inner-inner' and contains(.,'Select your Experience')]");
    public By educationDocument=By.name("document");
    public By submitBtn=By.xpath("(//button[contains(.,'Submit')])[3]");
    public By reset=By.xpath("//button[contains(.,'Reset')]");
    public By editBtn=By.xpath("(//i[@class='fas fa-edit'])[1]");
    public By deleteBtn=By.xpath("(//i[@class='fas fa-trash-can'])[1]");



}
