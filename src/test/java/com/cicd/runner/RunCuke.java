package com.cicd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/com/cicd/cucumber_features"}, glue = {"com.cicd.stepdefinations"}, monochrome = true)
public class RunCuke {

}
