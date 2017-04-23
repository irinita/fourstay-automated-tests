package com.stay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		plugin={"html:target/cucumber", "json:target/report.json"},
		features="./src/test/resources/com/stay/features",
		glue="com/stay/stepdefs",
		tags="@run"
		//dryRun=
		
		)

public class CukesRunner {

}
