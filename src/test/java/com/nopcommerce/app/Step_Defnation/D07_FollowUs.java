package com.nopcommerce.app.Step_Defnation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D07_FollowUs {

    @When("user clicks the {string} network")
    public void clickNetwork(String network) throws InterruptedException {
        HomePage.networks().findElement(By.className(network)).click();
        Thread.sleep(Hooks.T_SLEEP_MS);
    }

    @Then("a new page should open to {string}")
    public void assertNetworkPageOpened(String expectedURL) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), HomePage.URL);
        try {
            Hooks.driver.switchTo().window(new ArrayList<String>(Hooks.driver.getWindowHandles()).get(1));
            softAssert.assertEquals(Hooks.driver.getCurrentUrl(), expectedURL);
        } catch (IndexOutOfBoundsException e) {
            softAssert.assertTrue(false, "No new page opened");
        }
        softAssert.assertAll();
    }

}
