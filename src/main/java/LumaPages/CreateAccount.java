package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccount extends LumaBase
{
    By createAccount = By.xpath("//a[normalize-space()='Create an Account']");
    By firstName=By.id("firstname");
    By lastname = By.id("lastname");
    By email = By.name("email");
    By password = By.id("password");
    By confirmPassword = By.name("password_confirmation");
    By proceedAccount = By.xpath("//button[@title='Create an Account']");
    By errorMsg = By.xpath("//*[@id=\"email_address-error\"]");

    public void createAccount()
    {
        driver.findElement(createAccount).click();
        driver.findElement(firstName).sendKeys(prop.getProperty("firstname"));
        driver.findElement(lastname).sendKeys(prop.getProperty("lastname"));
        driver.findElement(email).sendKeys(prop.getProperty("email"));
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(confirmPassword).sendKeys(prop.getProperty("password_confirmation"));
        driver.findElement(proceedAccount).click();

    }

    public boolean createAccountWithInvalidEmail()
    {
        driver.findElement(createAccount).click();
        driver.findElement(firstName).sendKeys(prop.getProperty("firstname"));
        driver.findElement(lastname).sendKeys(prop.getProperty("lastname"));
        driver.findElement(email).sendKeys("abcdefg");
        driver.findElement(password).sendKeys(prop.getProperty("password"));
        driver.findElement(confirmPassword).sendKeys(prop.getProperty("password_confirmation"));
        driver.findElement(proceedAccount).click();
        return driver.findElement(errorMsg).isDisplayed();


    }

}
