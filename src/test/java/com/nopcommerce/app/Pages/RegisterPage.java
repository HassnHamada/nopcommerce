package com.nopcommerce.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nopcommerce.app.Step_Defnation.Hooks;

public class RegisterPage {
    public final static String URL = "https://demo.nopcommerce.com/register?returnUrl=%2F";

    private final static String _maleGender = "input[id=\"gender-male\"]";
    private final static String _femaleGender = "input[id=\"gender-female\"]";
    private final static String _firstName = "input[id=\"FirstName\"]";
    private final static String _lastName = "input[id=\"LastName\"]";
    private final static String _dayDOB = "select[name=\"DateOfBirthDay\"]";
    private final static String _monthDOB = "select[name=\"DateOfBirthMonth\"]";
    private final static String _yearDOB = "select[name=\"DateOfBirthYear\"]";
    private final static String _email = "input[id=\"Email\"]";
    private final static String _password = "input[id=\"Password\"]";
    private final static String _confirmPassword = "input[id=\"ConfirmPassword\"]";
    private final static String _registerButton = "button[id=\"register-button\"]";

    public static WebElement maleGender() {
        return Hooks.driver.findElement(By.cssSelector(_maleGender));
    }

    public static WebElement femaleGender() {
        return Hooks.driver.findElement(By.cssSelector(_femaleGender));
    }

    public static WebElement firstName() {
        return Hooks.driver.findElement(By.cssSelector(_firstName));
    }

    public static WebElement lastName() {
        return Hooks.driver.findElement(By.cssSelector(_lastName));
    }

    public static WebElement dayDOB() {
        return Hooks.driver.findElement(By.cssSelector(_dayDOB));
    }

    public static WebElement monthDOB() {
        return Hooks.driver.findElement(By.cssSelector(_monthDOB));
    }

    public static WebElement yearDOB() {
        return Hooks.driver.findElement(By.cssSelector(_yearDOB));
    }

    public static WebElement email() {
        return Hooks.driver.findElement(By.cssSelector(_email));
    }

    public static WebElement password() {
        return Hooks.driver.findElement(By.cssSelector(_password));
    }

    public static WebElement confirmPassword() {
        return Hooks.driver.findElement(By.cssSelector(_confirmPassword));
    }

    public static WebElement registerButton() {
        return Hooks.driver.findElement(By.cssSelector(_registerButton));
    }
}
