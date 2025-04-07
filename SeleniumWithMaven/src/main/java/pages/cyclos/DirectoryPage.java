package pages.cyclos;

import base.Browser;
import org.openqa.selenium.By;

public class DirectoryPage extends Browser {
    public By directorySection= By.xpath("//div[@class='quick-access-text' and contains(.,' Directory ')]");
    public By listView=By.xpath("//label[@class='btn btn-icon focusable resultType-list']");
    public By tilesView=By.xpath("//label[@class='btn btn-icon focusable resultType-tiles']");

}
