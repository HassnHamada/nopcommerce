package com.nopcommerce.app.Step_Defnation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.nopcommerce.app.Pages.HomePage;
import com.nopcommerce.app.Pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D05_HoverCategories {
    private static WebElement parent;
    private static String expected;

    @When("user move mouse cursor over Computers, Electronics or Apparel")
    public void randHover() {
        List<WebElement> choices = Arrays.asList(
                HomePage.navComputers(),
                HomePage.navElectronics(),
                HomePage.navApparel());
        parent = choices.get(new Random().nextInt(choices.size()));
        new Actions(Hooks.driver).moveToElement(parent).perform();
    }

    @And("choose one of its children in the dropdown menu")
    public void randPage() {
        List<WebElement> choices = parent.findElements(By.cssSelector("li"));
        WebElement child = choices.get(new Random().nextInt(choices.size()));
        expected = child.getText();
        new Actions(Hooks.driver).moveToElement(child).click().perform();
    }

    @Then("user should be in the selected page")
    public void assertPage() {
        Assert.assertEquals(SearchPage.title().getText(), expected);
    }
}
