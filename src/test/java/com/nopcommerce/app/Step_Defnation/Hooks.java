package com.nopcommerce.app.Step_Defnation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks {

    public final static int T_SLEEP_MS = 10000, I_W_MS = 10000, E_W_MS = 10000;

    private final Duration I_W_DURATION = Duration.ofMillis(I_W_MS), E_W_DURATION = Duration.ofMillis(E_W_MS);

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Given("user at home page")
    public void goToHome() {
        driver.navigate().to(HomePage.URL);
    }

    @Before
    public void before() {
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, E_W_DURATION);
        driver.manage().timeouts().implicitlyWait(I_W_DURATION);
        driver.manage().window().maximize();
        driver.navigate().to(HomePage.URL);
    }

    @After
    public void after() {
        driver.quit();
    }
}
