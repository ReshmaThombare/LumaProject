package LumaPagesTest;

import LumaBase.LumaBase;
import LumaPages.CreateAccount;
import LumaPages.WhatsNew;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhatsNewTest
{
    WhatsNew whatsnewobj;

    @BeforeMethod
    public void driverSetup()
    {
        whatsnewobj=new WhatsNew() ;
        whatsnewobj.setup();
        whatsnewobj.loadProperties();
    }

    @Test
    public void validateWhatsNewTag()
    {   whatsnewobj.w1();
        String currUrl = LumaBase.driver.getCurrentUrl();
        System.out.println(currUrl);
        String actualUrl = "https://magento.softwaretestingboard.com/what-is-new.html";
        Assert.assertEquals(actualUrl , currUrl);

    }

    @AfterMethod
    public void closeDriver()
    {
        whatsnewobj.tearDown();
    }

}
