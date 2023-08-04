package com.nopcommerce.app.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class WishlistPage {

    private final static String _cart = "table.cart";
    private final static String _cartProducts = "table.cart > tbody > tr";

    public static WebElement cart() {
        return Hooks.driver.findElement(By.cssSelector(_cart));
    };

    public static List<WebElement> cartProducts() {
        return Hooks.driver.findElements(By.cssSelector(_cartProducts));
    };
}