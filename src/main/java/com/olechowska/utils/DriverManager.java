package com.olechowska.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Agata on 2017-06-23.
 */
public class DriverManager {

    private static WebDriver driver;
    private static final int IMPLICITLY_WAIT = 30;

    public void openBrowser() {
        ChromeDriverManager.getInstance().setup("0.14.0");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    //configuration to run the test on emulated mobile device environment
    public void openMobileBrowser() {
        String ChromeDriverPath = "F:\\IdeaProjects\\scenario\\.idea\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);

        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Nexus 5");
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

}


