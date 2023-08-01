package com.nopcommerce.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class HomePage {
    public final static String URL = "https://demo.nopcommerce.com";

    private final static String _navElectronics = "ul[class=\"top-menu notmobile\"] a[href=\"/electronics\"]";
    private final static String _navCameraPhoto = "ul[class=\"top-menu notmobile\"] a[href=\"/camera-photo\"]";
    private final static String _loginHeader = "a[class=\"ico-login\"]";
    private final static String _logoutHeader = "a[href=\"/logout\"]";
    private final static String _registerHeader = "a[href=\"/register?returnUrl=%2F\"]";
    private final static String _myAccountHeader = "div[class=\"header-links\"] a[href=\"/customer/info\"]";

    public static WebElement navElectronics() {
        return Hooks.driver.findElement(By.cssSelector(_navElectronics));
    }

    public static WebElement navCameraPhoto() {
        return Hooks.driver.findElement(By.cssSelector(_navCameraPhoto));
    }

    public static WebElement loginHeader() {
        return Hooks.driver.findElement(By.cssSelector(_loginHeader));
    }

    public static WebElement logoutHeader() {
        return Hooks.driver.findElement(By.cssSelector(_logoutHeader));
    }

    public static WebElement registerHeader() {
        return Hooks.driver.findElement(By.cssSelector(_registerHeader));
    }

    public static WebElement myAccountHeader() {
        return Hooks.driver.findElement(By.cssSelector(_myAccountHeader));
    }
}