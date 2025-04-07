package generic;

import base.Browser;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel extends Browser {
    public XSSFSheet fileLoading(String path,String sheetName) throws IOException {
        FileInputStream fs = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        XSSFSheet sheet = wb.getSheet(sheetName);

        return sheet;
    }
}
