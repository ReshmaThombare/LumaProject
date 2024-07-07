package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class Gear extends LumaBase
{
    By gearTag = By.xpath("//*[@id=\"ui-id-6\"]/span[2]");

    public void gearTag()
    {
        driver.findElement(gearTag).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)" , "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().refresh();

    }

}
