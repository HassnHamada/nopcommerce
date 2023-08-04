package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.WishlistPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D08_Wishlist {

    @When("user clicks on the heart symbol near any product Ex \"HTC One M8 Android L 5.0 Lollipop\"")
    public void addToWishlist() {
        HomePage.HTCOneM8Phone().findElement(By.className("add-to-wishlist-button")).click();
    }

    @Then("a notification should appear")
    public void assertNotification() {
        Hooks.wait.until((WebDriver driver) -> {
            return HomePage.notification().findElements(By.cssSelector("*")).size() != 0;
        });
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(HomePage.notification().getText(), "The product has been added to your wishlist");
        softAssert.assertEquals(HomePage.notification().findElement(By.cssSelector("div.bar-notification"))
                .getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        softAssert.assertAll();
    }

    @When("user go to check for product in wishlist")
    public void checkWishlist() {
        Hooks.wait.until((WebDriver driver) -> {
            return HomePage.notification().findElements(By.cssSelector("*")).size() == 0;
        });

        HomePage.wishlistHeader().click();
    }

    @Then("\"HTC One M8 Android L 5.0 Lollipop\" should be present")
    public void assertProductInWishlist() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(WishlistPage.cartProducts().size() ,  1);
        softAssert.assertEquals(WishlistPage.cartProducts().get(0).findElement(By.cssSelector(".product")).getText(), "HTC One M8 Android L 5.0 Lollipop");
        softAssert.assertEquals(WishlistPage.cartProducts().get(0).findElement(By.cssSelector(".quantity > input")).getAttribute("value"), "1");
        softAssert.assertAll();
    }

}