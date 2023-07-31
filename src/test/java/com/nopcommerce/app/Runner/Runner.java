package com.nopcommerce.app.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/com/nopcommerce/app/resources/features", glue = {
        "com.nopcommerce.app.Step_Defnation" }, tags = "@smoke", monochrome = true, plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt" }, dryRun = false)
public class Runner extends AbstractTestNGCucumberTests {

}
