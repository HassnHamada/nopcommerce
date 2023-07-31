package com.nopcommerce.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class LoginPage {
    public final static String URL = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    private final static String _email = "input[id=\"Email\"]";
    private final static String _password = "input[id=\"Password\"]";
    private final static String _loginButton = "button[class=\"button-1 login-button\"]";

    public static WebElement email() {
        return Hooks.driver.findElement(By.cssSelector(_email));
    }

    public static WebElement password() {
        return Hooks.driver.findElement(By.cssSelector(_password));
    }

    public static WebElement loginButton() {
        return Hooks.driver.findElement(By.cssSelector(_loginButton));
    }
}
