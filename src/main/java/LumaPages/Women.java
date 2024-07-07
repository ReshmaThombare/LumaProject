package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class Women extends LumaBase
{
    By clickOnWomenTag = By.xpath("//span[normalize-space()='Women']");
    By clickOnHoodieAndSweatshirt= By.xpath("//a[contains(text(),'Hoodies & Sweatshirts')]");
    By clickOnItem= By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img");
    By itemSize =By.id("option-label-size-143-item-167");
    By itemColour =By.id("option-label-color-93-item-52");
    By addToCartBtn = By.id("product-addtocart-button");
    By clickOnCart = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
    By checkOut = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button");


    public void hoodiesAndSweatshirts()
    {
        driver.findElement(clickOnWomenTag).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().refresh();
        driver.findElement(clickOnHoodieAndSweatshirt).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        driver.findElement(clickOnItem).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(itemSize).click();
        driver.findElement(itemColour).click();
        driver.findElement(addToCartBtn).click();
        driver.findElement(clickOnCart).click();
        driver.findElement(checkOut).click();
    }

}
