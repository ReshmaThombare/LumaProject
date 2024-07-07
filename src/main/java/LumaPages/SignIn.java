package LumaPages;

import LumaBase.LumaBase;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignIn extends LumaBase
{

    By clickOnSignInTag=By.xpath("//a[normalize-space()='Sign In']");
    By email = By.id("email");
    By password = By.id("pass");
    By signInBtn = By.id("send2");
    By errorMsg = By.xpath("//*[@id=\"email-error\"]");


    public void signIn()
    {

            driver.findElement(clickOnSignInTag).click();
            driver.findElement(email).sendKeys(prop.getProperty("email"));
            driver.findElement(password).sendKeys(prop.getProperty("password"));
            driver.findElement(signInBtn).click();

    }
    public boolean invalidSignIn()
    {

        driver.findElement(clickOnSignInTag).click();
        driver.findElement(email).sendKeys("nana123");
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(signInBtn).click();
        return driver.findElement(errorMsg).isDisplayed();

    }
}
