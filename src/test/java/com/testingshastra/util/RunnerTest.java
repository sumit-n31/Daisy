package com.testingshastra.util;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@

io.cucumber.testng.CucumberOptions(features = "src\\test\\resources", glue = "com\\testingshastra\\stepdefinations", monochrome = true, plugin = {
		"pretty", "html:test-outpu", "json:target/cucumber-json-report.json" })

public class RunnerTest extends AbstractTestNGCucumberTests {

}
