package LumaPages;

import LumaBase.LumaBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Men extends LumaBase
{
    By clickOnWomenTag = By.xpath("//span[normalize-space()='Men']");
    By clickOnJacket = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a");
    By clickOnItem = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img");
    By itemSize = By.id("option-label-size-143-item-166");
    By itemColour = By.id("option-label-color-93-item-49");
    By addCartBtn = By.id("product-addtocart-button");
    By clickOnCart= By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
    By checkOut = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button");

    public void men_jacket()
    {
        driver.findElement(clickOnWomenTag).click();
        driver.findElement(clickOnJacket).click();
        driver.findElement(clickOnItem).click();
        driver.findElement(itemSize).click();
        driver.findElement(itemColour).click();
        driver.findElement(addCartBtn).click();
        driver.findElement(clickOnCart).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(checkOut).click();
    }





}
