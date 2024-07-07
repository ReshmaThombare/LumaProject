package LumaPagesTest;

import LumaPages.Men;
import LumaPages.SignIn;
import LumaPages.Women;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenTest
{
    Men menobj ;

    @BeforeMethod
    public void driverSetup()
    {
        menobj= new Men();
        menobj.setup();
    }

    @Test
    public void validateManTag()
    {
        SignIn signIn = new SignIn();
        signIn.signIn();
        menobj.men_jacket();
    }

    @AfterMethod
    public void closeDriver()
    {
        menobj.tearDown();
    }
}
