package com.nopcommerce.app.Step_Defnation;

import org.testng.Assert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    @When("Go to login page")
    public void go2Login() {
        HomePage.loginHeader().click();
    }

    @And("Fill all fields with valid data")
    public void fillValid() {
        LoginPage.email().sendKeys("hassn@hassn.com");
        LoginPage.password().sendKeys("123456");
    }

    @And("Click on login button")
    public void clickLogin() {
        LoginPage.loginButton().click();
    }

    @Then("Verify login success")
    public void assertSuccess() {
        Assert.assertTrue(HomePage.logoutHeader().isDisplayed());
    }

    @Then("Fill login fields with invalid data")
    public void fillInvalid() {
        LoginPage.email().sendKeys("hassn@hassn.com");
        LoginPage.password().sendKeys("12345");
    }

    @Then("Don't fill login fields")
    public void fillEmpty() {
        LoginPage.email().sendKeys("");
        LoginPage.password().sendKeys("");
    }

    @Then("Verify login failure")
    public void assertFailure() {
        Assert.assertTrue(HomePage.loginHeader().isDisplayed());
    }
}
