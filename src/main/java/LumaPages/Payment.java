package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Payment extends LumaBase
{
    By shippingMethod = By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input");
    By nextBtn = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
    By placeOrder = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");




    public void proceedPayment()
    {
        driver.findElement(shippingMethod).click();
        driver.findElement(nextBtn).click();
        driver.findElement(placeOrder).click();
    }

}
