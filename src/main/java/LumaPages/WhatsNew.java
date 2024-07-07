package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class WhatsNew extends LumaBase
{
    By clickOnWhatsNewInTag = By.id("ui-id-3");
    SignIn signin = new SignIn();

    public void w1()
    {
        signin.signIn();
        driver.findElement(clickOnWhatsNewInTag).click();

    }




}
