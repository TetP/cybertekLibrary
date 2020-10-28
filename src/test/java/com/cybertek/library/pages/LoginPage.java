package com.cybertek.library.pages;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    private WebElement loginBtn;

    public void login(String email, String password){
        BrowserUtils.enterText(emailInput,email);
        BrowserUtils.enterText(passwordInput,password);
        BrowserUtils.clickOnElement(loginBtn);
    }

    public void login(String role){
        String emailValue="";
        String passwordValue="";

        if (role.equalsIgnoreCase("librarian")){
            emailValue = ConfigurationReader.getProperty("librarianEmail");
            passwordValue = ConfigurationReader.getProperty("librarianPassword");
        }else if (role.equalsIgnoreCase("student")){
            emailValue = ConfigurationReader.getProperty("studentEmail");
            passwordValue = ConfigurationReader.getProperty("studentPassword");
        }

        BrowserUtils.enterText(emailInput,emailValue);
        BrowserUtils.enterText(passwordInput,passwordValue);

        BrowserUtils.clickOnElement(loginBtn);
    }

    public void enterEmail(String email){
        BrowserUtils.enterText(emailInput,email);
    }

    public void enterPassword(String password){
        BrowserUtils.enterText(passwordInput,password);
    }

    public void clickOnLoginBtn(){
        loginBtn.click();
    }








}
