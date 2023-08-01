package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D02_Login {

    @When("user go to login page")
    public void go2Login() {
        HomePage.loginHeader().click();
    }

    @And("user login with {string} {string} and {string}")
    public void fillForm(String valid, String enail, String password) {
        LoginPage.email().sendKeys(enail);
        LoginPage.password().sendKeys(password);
    }

    @And("user press on login button")
    public void clickLogin() {
        LoginPage.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void assertSuccess() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        softAssert.assertTrue(HomePage.myAccountHeader().isDisplayed());
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void assertFailure() {
        SoftAssert softAssert = new SoftAssert();
        WebElement error = LoginPage.errorMessage();
        Color color = Color.fromString(error.getCssValue("color"));
        softAssert.assertTrue(error.getText().contains("Login was unsuccessful."));
        softAssert.assertEquals(color.asHex(), "#e4434b");
        softAssert.assertAll();
    }
}
