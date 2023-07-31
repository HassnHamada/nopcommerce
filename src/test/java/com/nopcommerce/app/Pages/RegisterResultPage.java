package com.nopcommerce.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class RegisterResultPage {

    public final static String URL = "https://demo.nopcommerce.com/registerresult/1?returnUrl=";

    private final static String _result = "div[class=\"result\"]";

    public static WebElement result() {
        return Hooks.driver.findElement(By.cssSelector(_result));
    };
}
