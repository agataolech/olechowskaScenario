package com.olechowska.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Agata on 2017-06-23.
 */
public class TestHelper {

    private static WebDriver driver = DriverManager.getDriver();

    public static void waitForAjax() {
        new WebDriverWait(driver, 15).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
                return (Boolean) js.executeScript("return jQuery.active == 0");
            }
        });
    }

    /**
     * Pause the test execution (for debugging purpose or to improve test execution stability).
     *
     * @param   pSeconds
     *          Number of seconds to pause the test execution.
     */
    public void sleep(int pSeconds) {
        try {
            Thread.sleep(pSeconds * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * scroll into given element
     * @param pXpathToElement
     */
    public void scrollIntoElement(String pXpathToElement) {
        WebElement element = driver.findElement(By.xpath(pXpathToElement));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

}
