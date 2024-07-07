package LumaPagesTest;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest
{
    LumaPages.SignIn signinobj ;

    @BeforeMethod
    public void driverSetup()
    {
        signinobj= new LumaPages.SignIn();
        signinobj.setup();
        signinobj.loadProperties();

    }

    @Test
    public void validateSignIn()
    {
        signinobj.signIn();

    }
    @Test
    public void validateInvalidSignIn()
    {
        Assert.assertTrue(signinobj.invalidSignIn());

    }

    @AfterMethod
    public void closeDriver()
    {
        signinobj.tearDown();

    }
}
