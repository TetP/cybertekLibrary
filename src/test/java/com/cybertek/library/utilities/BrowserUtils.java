package com.cybertek.library.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    private  static WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void enterText(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        //element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element,"value",text));
        //System.out.println("Entering text: " + text);
    }

    public static void clickOnElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void waitForElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
