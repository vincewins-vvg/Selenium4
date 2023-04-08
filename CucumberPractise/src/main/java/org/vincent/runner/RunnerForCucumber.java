package org.vincent.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/main/java/org/vincent/features/CreateLeadScenarioOutline.feature"}, glue="stepdefinitions",monochrome=true, publish=true)
//monochrome to vanish junk char in console
//publish to generate temp report for every run
//tags="@Smoke or @Regression" will scenarios with Smoke or Regression
//tags=="@Smoke and @Regression" will run scenarios with both @
public class RunnerForCucumber extends AbstractTestNGCucumberTests {

}