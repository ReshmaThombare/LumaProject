package LumaPagesTest;

import LumaPages.Gear;
import LumaPages.SignIn;
import LumaPages.Women;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GearTest
{
    Gear gearobj;

    @BeforeMethod
    public void driverSetup()
    {
        gearobj= new Gear();
        gearobj.setup();
        gearobj.loadProperties();
    }

    @Test
    public void validateGearTag()
    {
        SignIn signin = new SignIn();
        signin.signIn();
        gearobj.gearTag();

    }

    @AfterMethod
    public void closeDriver()
    {
        gearobj.tearDown();
    }

}
