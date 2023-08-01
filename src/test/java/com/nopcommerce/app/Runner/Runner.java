package com.nopcommerce.app.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/features" }, tags = "@test", glue = {
		"com.nopcommerce.app.Step_Defnation" }, plugin = { "pretty", "html:target/cucumber.html",
				"json:target/cucumber.json", "junit:target/cukes.xml", "rerun:target/rerun.txt" })
public class Runner extends AbstractTestNGCucumberTests {
}
