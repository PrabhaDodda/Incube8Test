package com.incube8.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			dryRun=false,
			strict=true,
			monochrome=true,
			features= {"src/test/resources/"},
			glue= {"com.incube8.teststeps"},
			plugin= {"pretty",
					"html:target/site/cucumber-html",
					"json:target/cucumber1.json"},
			tags= {"@Question1.2,@Question1.3,@Question2.1"}
			)
	public class Runner {

	}

