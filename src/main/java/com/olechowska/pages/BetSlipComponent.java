package com.olechowska.pages;


import com.olechowska.pages.constants.BetSlipComponentConstants;
import com.olechowska.utils.DriverManager;
import com.olechowska.utils.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BetSlipComponent {

    private WebDriver driver = DriverManager.getDriver();
    private TestHelper testHelper = new TestHelper();

    /**
     * fill the stake input with given value
     * @param pStakeValue
     */
    public void fillStakeInput(String pStakeValue){
        driver.findElement(By.xpath(BetSlipComponentConstants.STAKE_INPUT)).sendKeys(pStakeValue);
        testHelper.sleep(1);
    }

    /**
     * get odds value from bet slip component
     * @return
     */
    public double getOddsValue(){
        String odds = driver.findElement(By.xpath(BetSlipComponentConstants.DISPLAYED_ODDS_VALUE)).getText();
        double oddsValue = Double.parseDouble(odds);
        return oddsValue;
    }

    /**
     * get stakes value from bet slip component
     * @return
     */
    public double getStakesValue(){
        String stake = driver.findElement(By.xpath(BetSlipComponentConstants.DISPLAYED_STAKE_VALUE)).getText();
        double stakeValue = Double.parseDouble(stake);
        return stakeValue;
    }

    /**
     * get value of returned calculation from bet slip component
     * @return
     */
    public double getReturnedCalculationValue(){
        String calculation = driver.findElement(By.xpath(BetSlipComponentConstants.DISPLAYED_RETURNED_CALCULATION_VALUE)).getText();
        double returnedCalc = Double.parseDouble(calculation);
        return returnedCalc;
    }

    /**
     * calculate returns (it is a result of multiplication of stakes and odds)
     * @return round value
     *
     * important: this method work only if price format is set to 'Decimal'. I was not able to create a method which
     * can include other price formats since I don't know the algorithm to
     * compute the returns (simple multiplication doesn't work -> the result is different)
     */
    public double calculateReturns(){
        double returns = (getOddsValue() * getStakesValue());

        return new BigDecimal(returns).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
