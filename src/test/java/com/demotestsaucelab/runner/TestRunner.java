package com.demotestsaucelab.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/demotestsaucelab/features"},
        plugin = {"pretty", "json:target/report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
//        tags = {"@smoke"},
        glue = {"com/demotestsaucelab/hooks", "com/demotestsaucelab/stepdefinitions"}
)

public class TestRunner {
}
