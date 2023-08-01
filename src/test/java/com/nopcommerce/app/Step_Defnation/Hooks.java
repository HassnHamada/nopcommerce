package com.nopcommerce.app.Step_Defnation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.nopcommerce.app.Pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    final public static int sleep = 100;

    private final Duration I_W_DURATION = Duration.ofSeconds(10);

    public static WebDriver driver;

    @Before
    public void before() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(I_W_DURATION);
        driver.manage().window().maximize();
        driver.navigate().to(HomePage.URL);
    }

    @After
    public void after() {
        driver.quit();
    }
}
