package LumaPagesTest;

import LumaPages.Gear;
import LumaPages.Payment;
import LumaPages.SignIn;
import LumaPages.Women;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaymentTest
{
    Payment payment = new Payment();

    @BeforeMethod
    public void driverSetup()
    {

        payment.setup();
        payment.loadProperties();
    }
    @Test
    public void validatePayment()
    {
        SignIn signin  = new SignIn();
        signin.signIn();
        Women womenobj = new Women();
        womenobj.hoodiesAndSweatshirts();
        payment.proceedPayment();

    }
    @AfterMethod
    public void closeDriver()
    {
        //payment.tearDown();
    }


}
