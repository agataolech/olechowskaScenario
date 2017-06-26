package com.olechowska.steps;

import com.olechowska.pages.BetSlipComponent;
import com.olechowska.pages.BettingFootballPage;
import com.olechowska.pages.BettingMainPage;
import com.olechowska.utils.DriverManager;
import com.olechowska.utils.TestHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.SystemClock;

import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Agata on 2017-06-23.
 */
public class Betting {

    private BettingMainPage bettingMainPage = new BettingMainPage();
    private BettingFootballPage bettingFootballPage = new BettingFootballPage();
    private BetSlipComponent betSlipComponent = new BetSlipComponent();


    @Given("^user is on betting page$")
        public void user_is_on_betting_page() {
        bettingMainPage.goToBetPage();
        }

    @When("^user navigate to football event$")
        public void user_is_on_betting_football_page() {
        bettingFootballPage.goToFootballBetPage();
        //assert that user is on the right page
        bettingFootballPage.assertOpenedPage("/betting/en-gb/football");

        //change price format to decimal
        bettingFootballPage.setPriceFormat("Decimal");
        }

    @And("^user select a <event>$")
        public void user_is_on_event_page() {
        //open given football event (Arsenal FC v Tigre in this case)
        bettingFootballPage.openFootballEvent("Arsenal FC vs Tigre");

        //verify if expected page was opened
        // (http://sports.williamhill.com/betting/en-gb/football/OB_EV11218747/arsenal-fc-vs-tigre in this case)
        bettingFootballPage.assertOpenedPage("/arsenal-fc-vs-tigre");
        }

    @And("^place a <stake> for the home team to ‘Win’$")
        public void user_place_the_bet() {

        //choose the bet (in this case we want to place the bet for Home team: "Arsenal FC")
        bettingFootballPage.selectBet("Arsenal FC");
        //set stake to 0.05
        betSlipComponent.fillStakeInput("0.05");
        }

    @Then("^the <return> is equals to <odds> multiplied by <stake>$")
        public void assert_stake_odds_and_returned_calculation() {
        //assert returned calculation (it is a result of odds * stake)
        assertThat(betSlipComponent.calculateReturns())
                .describedAs("Displayed calculation seems to be wrong!")
                .isEqualTo(betSlipComponent.getReturnedCalculationValue());
        }
}
