package com.olechowska;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Agata on 2017-06-23.
 */

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty", "html:target/reports"},
        features = "src/test/resources/features")

public class CucumberRunTest {
}
