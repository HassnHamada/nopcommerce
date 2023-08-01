package com.nopcommerce.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class ProductPage {
    public final static String URL = "https://demo.nopcommerce.com/";

    private final static String _sku = "div[class=\"sku\"]>span[class=\"value\"]";

    public static WebElement sku() {
        return Hooks.driver.findElement(By.cssSelector(_sku));
    }
}