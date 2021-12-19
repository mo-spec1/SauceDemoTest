package com.demotestsaucelab.hooks;

import com.demotestsaucelab.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Browser {

    public Scenario scenario;
    @Before
    public void setUp()
    {
        this.scenario = scenario;
        launchBrowser("Chrome");
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
