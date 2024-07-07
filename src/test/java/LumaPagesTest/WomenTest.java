package LumaPagesTest;

import LumaBase.LumaBase;
import LumaPages.SignIn;
import LumaPages.Women;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenTest
{
    Women womenobj ;

    @BeforeMethod
    public void driverSetup()
    {
        womenobj= new Women();
        womenobj.setup();
        womenobj.loadProperties();
    }

    @Test
    public void validateWomenTag()
    {
        SignIn signin = new SignIn();
        signin.signIn();
        womenobj.hoodiesAndSweatshirts();

    }

    @AfterMethod
    public void closeDriver()
    {
        womenobj.tearDown();
    }



}
