package com.olechowska.pages;

import com.olechowska.utils.DriverManager;
import com.olechowska.utils.TestHelper;
import cucumber.api.java.vi.Cho;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Agata on 2017-06-23.
 */
public class BettingMainPage {

    private WebDriver driver = DriverManager.getDriver();
    private String url = "http://sports.williamhill.com/betting/en-gb";

    /**
     * open given page
     */
    public void goToBetPage() {
        driver.get(url);
        TestHelper.waitForAjax();
    }
}
