package generic;

import base.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Generic extends Browser {
    //press Cntrl+F12 to see all the methods
    Actions actions;

    public boolean SendKeys(WebDriver d, By elementToBeEntered, String text)
    {
        if(Enabled(d,elementToBeEntered) && display(d,elementToBeEntered))
        {
            try
            {
                d.findElement(elementToBeEntered).sendKeys(text);
                return true;
            }
            catch(Exception e)
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }

    public boolean Enabled(WebDriver d, By elementToBeEnable)
    {
        try
        {
            d.findElement(elementToBeEnable).isEnabled();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    //Generic isEnabled method
    public boolean display(WebDriver d, By elementToBevisible)
    {
        try
        {
            d.findElement(elementToBevisible).isDisplayed();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    /**
     * @param driver :object of driver
     * @param elementToBeClicked :element that want to be click
     * @return :it will return true or false
     */
    public boolean Click(WebDriver driver, By elementToBeClicked)
    {
        WebElement ele=driver.findElement(elementToBeClicked);
        if(ele.isDisplayed() & ele.isEnabled())
        {
            try
            {
                ele.click();
                //delay(driver, elementToBeClicked,10);
                //Screen_Shot(driver);
                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }

        }
        else
        {
            return false;
        }

    }
    public void goBack(WebDriver driver){
        driver.navigate().back();
    }

    //creating the method for select Dropdown
    public void drodownSelect(WebDriver driver,By dropdownName,String visibleText){
        WebElement el = driver.findElement(dropdownName);
        if (el.isDisplayed()&&el.isEnabled()){
            try {
                el.click();
                Select sc=new Select(el);
                sc.selectByVisibleText(visibleText);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void dropDownClick(WebDriver driver,By dropDownName){
        WebElement el = driver.findElement(dropDownName);
        if (el.isDisplayed()&&el.isEnabled()){
            try {
                el.click();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //method for mouse hover
    public void MouseHover(WebDriver driver,By elemet){
        actions=new Actions(driver);
        actions.moveToElement(driver.findElement(elemet)).build().perform();
    }
    //Generic Explicity Wait method
    public void delay(WebDriver dr, By element,long time)
    {
        WebElement firstResult = new WebDriverWait(dr, Duration.ofSeconds(time))
                .until(ExpectedConditions.elementToBeClickable((element)));

    }
    public void ScreenShot(WebDriver driver,String fileName) throws IOException {
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\HP\\IdeaProjects\\SeleniumWithMaven\\Screenshots\\"+fileName);
        FileUtils.copyFile(src,dest);

    }
    public void ScreenShotOfA_Part(WebDriver driver,By element,String fileName) throws IOException {
//        TakesScreenshot screenshot= (TakesScreenshot) driver;
        WebElement section = driver.findElement(element);
        File src = section.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\HP\\IdeaProjects\\SeleniumWithMaven\\Screenshots\\"+fileName);
        FileUtils.copyFile(src,dest);

    }
    public void scrollDown(Actions actions) throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
    public void Scroll_dwn(WebDriver d, int num)
    {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,"+num+")", "");
    }





}
