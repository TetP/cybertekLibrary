package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class UsersPage_StepDefinition extends BaseStepDef{

    @When("I click on {string} link")
    public void i_click_on_link(String module) {
        dashboardPage.clickOnModule(module);
    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer defaultValue) {
        Assert.assertEquals(defaultValue,usersPage.getDefaultValue());
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<Integer> dataTable) {
        Assert.assertEquals(dataTable,usersPage.getOptions());
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> dataTable) {
        Assert.assertEquals(dataTable,usersPage.getSearchRow());
    }


}
