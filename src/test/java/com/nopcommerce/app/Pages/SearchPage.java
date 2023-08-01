package com.nopcommerce.app.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class SearchPage {
    public final static String URL = "https://demo.nopcommerce.com/search?q=";

    private final static String _products = "div[class=\"item-grid\"] h2[class=\"product-title\"] a";
    private final static String _next = "li[class=\"next-page\"] a";

    public static List<WebElement> products() {
        return Hooks.driver.findElements(By.cssSelector(_products));
    }

    public static WebElement next() {
        return Hooks.driver.findElement(By.cssSelector(_next));
    }
}