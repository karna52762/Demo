package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Feature/1DwithHeader.feature"},glue={"com.stepdefinition"}, monochrome = true, plugin = { "pretty",
"json:src\\test\\resources\\Reports\\Reporting.json" }, dryRun = true, strict = true,snippets=SnippetType.CAMELCASE)
public class TestRunner {
	
private void funs() {
	System.out.println("test");
	System.out.println("test");
	System.out.println("test");
}
}
