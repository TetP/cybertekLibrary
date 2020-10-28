package com.cybertek.library.pages;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.StringReader;

public class DashboardPage extends BasePage{

    @FindBy(id = "user_count")
    private WebElement usersNumber;

    @FindBy(xpath = "//span[text()='Users']")
    private WebElement usersModule;

    @FindBy(xpath = "//span[text()='Books']")
    private WebElement booksModule;

    public Integer getUsersNumber() {
        BrowserUtils.waitForElement(usersNumber);
        return Integer.parseInt(usersNumber.getText());
    }

    public Integer getCount(String name){
        WebElement element= Driver.getDriver().findElement(By.xpath("//h6[text()='"+name+"']//../h2"));
        BrowserUtils.waitForElement(element);
        return Integer.parseInt(element.getText());
    }

    public void clickOnModule(String module){
        if (module.equalsIgnoreCase("users")){
            BrowserUtils.clickOnElement(usersModule);
        }else if (module.equalsIgnoreCase("books")){
            BrowserUtils.clickOnElement(booksModule);
        }
    }

    public String verifyName(String user){
        String xpath="//span[text()='"+user+"']";
        WebElement userName=Driver.getDriver().findElement(By.xpath(xpath));

        return userName.getText();
    }


}
