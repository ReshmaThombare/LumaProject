package LumaPagesTest;

import LumaPages.CreateAccount;
import LumaPages.GetTitle;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetTitleTest
{
    GetTitle gettitleobj ;

    @BeforeMethod
    public void driverSetup()
    {
        gettitleobj = new GetTitle();
        gettitleobj.setup();
        gettitleobj.loadProperties();

    }

    @Test
    public void validateTitle()
    {
        System.out.println(gettitleobj);
        String actualTitle = "https://magento.softwaretestingboard.com/";
        Assert.assertEquals(actualTitle,gettitleobj.getTitle());
        gettitleobj.tearDown();
    }

    @AfterMethod
    public void closeDriver()
    {
        gettitleobj.tearDown();

    }
}
