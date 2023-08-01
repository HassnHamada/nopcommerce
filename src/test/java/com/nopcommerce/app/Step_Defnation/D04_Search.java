package com.nopcommerce.app.Step_Defnation;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.ProductPage;
import com.nopcommerce.app.Pages.SearchPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D04_Search {

    @When("user enter {string} in search field")
    public void search(String keyword) {
        HomePage.searchBox().sendKeys(keyword);
        HomePage.searchBox().sendKeys(Keys.RETURN);
    }

    @Then("products with {string} should appear")
    public void assertProducts(String keyword) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains(SearchPage.URL));
        for (WebElement product : SearchPage.products()) {
            String actual = product.getText().toLowerCase();
            String expected = keyword.toLowerCase();
            String error = String.format("\"%s\" doesn't contain \"%s\"", actual, expected);
            softAssert.assertTrue(actual.contains(expected), error);
        }
        softAssert.assertAll();
    }

    @Then("product with {string} should appear")
    public void assertProduct(String keyword) {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> products = SearchPage.products();
        softAssert.assertEquals(products.size(), 1);
        products.get(0).click();
        softAssert.assertEquals(ProductPage.sku().getText(), keyword);
        softAssert.assertAll();
    }
}