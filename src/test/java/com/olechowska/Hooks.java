package com.olechowska;

import com.olechowska.utils.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Agata on 2017-06-23.
 */
public class Hooks {

    @Before
    public void SetUp() {
        //switch between browser and emulated mobile device environment
        new DriverManager().openBrowser();
        //new DriverManager().openMobileBrowser();
    }

    @After
    public void tearDown() {
        new DriverManager().closeBrowser();
    }
}
