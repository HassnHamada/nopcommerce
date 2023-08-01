package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.RegisterPage;
import com.nopcommerce.app.Pages.RegisterResultPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D01_Register {

    @Given("user go to register page")
    public void go2RegisterPage() {
        HomePage.registerHeader().click();
    }

    @When("user select gender type")
    public void selectGender() {
        RegisterPage.maleGender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void enterName(String firstName, String lastName) {
        RegisterPage.firstName().sendKeys(firstName);
        RegisterPage.lastName().sendKeys(lastName);
    }

    @And("user enter date of birth")
    public void selectDOB() {
        new Select(RegisterPage.dayDOB()).selectByValue("24");
        new Select(RegisterPage.monthDOB()).selectByValue("9");
        new Select(RegisterPage.yearDOB()).selectByVisibleText("1999");
    }

    @And("user enter email {string} field")
    public void enterEmail(String email) {
        RegisterPage.email().sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void enterPassword(String password, String confirmPassword) {
        RegisterPage.password().sendKeys(password);
        RegisterPage.confirmPassword().sendKeys(confirmPassword);
    }

    @And("user clicks on register button")
    public void confirmRegister() {
        RegisterPage.registerButton().click();
    }

    @Then("success message is displayed")
    public void assertSuccess() {
        WebElement result = RegisterResultPage.result();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(result.getText(), "Your registration completed");
        softAssert.assertEquals(result.getCssValue("color"), "rgba(76, 177, 124, 1)");
        softAssert.assertAll();
    }
}
