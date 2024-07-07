package LumaPagesTest;

import LumaBase.LumaBase;
import LumaPages.CreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest
{
    CreateAccount createaccountobj;

    @BeforeMethod
    public void driverSetup()
    {
        createaccountobj=new CreateAccount() ;
        createaccountobj.setup();

    }

    @Test
    public void validateAccount()
    {
        createaccountobj.createAccount();

    }
    @Test
    public void createAccountWithInvalidEmail()
    {
        Assert.assertTrue(createaccountobj.createAccountWithInvalidEmail());
    }

    @AfterMethod
    public void closeDriver()
    {
        createaccountobj.tearDown();
    }

}
