package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @When("I login as a {string}")
    public void i_login_as_a(String role) {
        loginPage.login(role);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed());
    }

    @When("I enter username {string}")
    public void i_enter_username(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("there should be {int} users")
    public void there_should_be_users(Integer noOfUsers) {
        Assert.assertEquals(noOfUsers,loginPage.getUsersNumber());
    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        loginPage.login(email,password);
    }

    @Then("there should be {int} {string}")
    public void there_should_be(Integer num, String name) {
        Assert.assertEquals(num,loginPage.getCount(name));
    }



}
