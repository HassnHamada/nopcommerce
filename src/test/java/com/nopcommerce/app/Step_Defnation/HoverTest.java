package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.nopcommerce.app.Pages.CameraPhotoPage;
import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HoverTest {
    @Given("User visits the home page")
    public void go2Home() {
        Hooks.driver.navigate().to(HomePage.URL);
    }

    private static void cursorMove(WebElement element) {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(element).perform();
    }

    @And("Move mouse cursor to `Electronics` in navigation bar")
    public void cursorMove2Electronics() {
        cursorMove(HomePage.navElectronics());
    }

    @And("Move down to `Camera & Photo`")
    public void cursorMove2CameraPhoto() {
        cursorMove(HomePage.navCameraPhoto());
    }

    @And("Click")
    public static void cursorClick() {
        Actions actions = new Actions(Hooks.driver);
        actions.click().perform();
    }

    @Then("User should be in `Camera & Photo` page")
    public static void assertInCameraPhotoPage() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), CameraPhotoPage.URL);
    }
}
