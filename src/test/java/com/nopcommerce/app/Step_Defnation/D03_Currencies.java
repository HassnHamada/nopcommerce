package com.nopcommerce.app.Step_Defnation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D03_Currencies {

    @When("users change currency to {string}")
    public void changeCurrency(String currency) {
        new Select(HomePage.currency()).selectByVisibleText(currency);
    }

    @Then("the displayed currency logo should be {string}")
    public void assertChangeCurrency(String currency) {
        for (WebElement product : HomePage.products()) {
            Assert.assertTrue(product.getText().contains(currency));
        }
    }
}