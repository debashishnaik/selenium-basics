package smoke;

import generic.Excel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AdminLogin;
import pages.Home;

import java.io.IOException;

public class UserValidation extends AdminLogin {
    Excel ex=new Excel();
    @BeforeClass
    public void loadApp() throws IOException {
        driver=lunch();

    }
    @Test(description = "run after ")
    public void testing() throws IOException {
        XSSFSheet sh = ex.fileLoading(System.getProperty("user.dir") + "\\src\\test\\resources\\login.xlsx","Sheet1");
        //another way
//        XSSFSheet sh = ex.fileLoading("C:\\Users\\HP\\IdeaProjects\\SeleniumWithMaven\\src\\test\\resources\\login.xlsx", "Sheet1");
        int lastRowNum = sh.getLastRowNum();
        for (int i=1;i<=lastRowNum;i++){
            XSSFRow row = sh.getRow(i);
            String uname = row.getCell(0).toString();
            String pass = row.getCell(1).toString();
            Login(driver,uname,pass);
        }
    }
}
