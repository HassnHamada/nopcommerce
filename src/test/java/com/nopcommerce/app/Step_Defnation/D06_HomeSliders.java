package com.nopcommerce.app.Step_Defnation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D06_HomeSliders {
    @When("user clicks the {string} slider")
    public void clickSlider(final String SLIDER) throws Exception {
        WebElement currentSlider = SLIDER.equals("first") ? HomePage.firstSlider() : HomePage.secondSlider();
        currentSlider.click();
        Hooks.wait.until((WebDriver driver) -> {
            String classes = currentSlider.getAttribute("class");
            for (String class_ : classes.split(" ")) {
                if (class_.equals("active")) {
                    return true;
                }
            }
            return false;
        });
        HomePage.slider().click();
    }

    @Then("user should be navigated to {string}")
    public void assertInCameraPhotoPage(final String EXPECTED) {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), EXPECTED);
    }
}
