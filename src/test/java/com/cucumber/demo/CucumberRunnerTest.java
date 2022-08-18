package com.cucumber.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/feature",
		glue = "src/test/java/com/cucumber/stepDefinitions"
		)
public class CucumberRunnerTest {

}
