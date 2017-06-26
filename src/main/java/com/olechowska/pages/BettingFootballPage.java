package com.olechowska.pages;

import com.olechowska.pages.constants.BettingFootballPageConstants;
import com.olechowska.utils.DriverManager;
import com.olechowska.utils.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Agata on 2017-06-23.
 */

public class BettingFootballPage {

    private WebDriver driver = DriverManager.getDriver();
    TestHelper testHelper = new TestHelper();

    /**
     * open page of football events
     */
    public void goToFootballBetPage() {
        driver.findElement(By.xpath(BettingFootballPageConstants.FOOTBALL_TAB)).click();
        TestHelper.waitForAjax();
    }

    /**
     * verify current URL
     * @param pUrl
     */
    public void assertOpenedPage(String pUrl){
        assertThat(driver.getCurrentUrl())
                .describedAs("It seems that wrong page was loaded")
                .contains(pUrl);
    }

    /**
     * open list of price format options
     */
    private void openPriceFormatOptionsList() {
        driver.findElement(By.xpath("//a[contains(@href, 'odds-format')]")).click();
        TestHelper.waitForAjax();
        //could be replaced by better WaitFor method
        testHelper.sleep(1);
    }

    /**
     * set price format
     * possible options: Fraction, Decimal, American
     */
    public void setPriceFormat(String pPriceFormat){
        openPriceFormatOptionsList();
        driver.findElement(By.xpath(String.format("//a[@data-odds-format='%s']", pPriceFormat).toLowerCase())).click();
        TestHelper.waitForAjax();
    }

    /**
     * open football event by name
     * @param pEventName (for example "Sao Paulo vs Fluminense RJ")
     */
    public void openFootballEvent(String pEventName){
        //probably because of some bug in chrome is not possible to click element without previous scroll into it,
        //so that's why I had to use this workaround (on ff it works fine)
        testHelper.scrollIntoElement("//h2[text()='Football Highlights']");

        driver.findElement(By.xpath(String.format(BettingFootballPageConstants.FOOTBALL_EVENT, pEventName))).click();
        TestHelper.waitForAjax();
    }

    /**
     * select winning team after 90 minutes
     * @param pTeamName
     */
    public void selectBet(String pTeamName){
        driver.findElement(By.xpath(String.format(BettingFootballPageConstants.BET, pTeamName))).click();
        TestHelper.waitForAjax();
    }
}
