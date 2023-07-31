package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.RegisterPage;
import com.nopcommerce.app.Pages.RegisterResultPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest {

    @When("Go to Register page")
    public void go2RegisterPage() {
        HomePage.registerHeader().click();
    }

    @And("Fill all data")
    public void fillData() {
        RegisterPage.maleGender().click();
        RegisterPage.firstName().sendKeys("Hassn");
        RegisterPage.lastName().sendKeys("Hamada");
        new Select(RegisterPage.dayDOB()).selectByValue("24");
        new Select(RegisterPage.monthDOB()).selectByValue("9");
        new Select(RegisterPage.yearDOB()).selectByVisibleText("1999");
        RegisterPage.email().sendKeys("hassn_11@hamada.com");
        RegisterPage.password().sendKeys("123456");
        RegisterPage.confirmPassword().sendKeys("123456");
    }

    @And("Click on register button")
    public void confirmRegister() {
        RegisterPage.registerButton().click();
    }

    @Then("Verify success registration")
    public void assertSuccess() {
        Assert.assertTrue(RegisterResultPage.result().isDisplayed());
    }

    @Then("Fill all fields with invalid data")
    public void fillInvalidData() {
        RegisterPage.maleGender().click();
        RegisterPage.firstName().sendKeys("Hassn");
        RegisterPage.lastName().sendKeys("Hamada2");
        RegisterPage.email().sendKeys("hassn@ham");
        RegisterPage.password().sendKeys("12345");
        RegisterPage.confirmPassword().sendKeys("12345");
    }

    @Then("Verify registration failure")
    public void assertFailure() {
        Assert.assertTrue(HomePage.loginHeader().isDisplayed());
    }
}
