package com.williamhill.sports.stepdefs;

import com.williamhill.sports.pages.HomePage;
import com.williamhill.sports.utils.BaseTests;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep {

    HomePage homePage;

    public HomePageStep() {
        homePage = new HomePage(BaseTests.getWebDriver());
    }

    @Given("^I am on William Hill sports website$")
    public void iAmOnWilliamHillSportsWebsite() {
        homePage.iAmOnWilliamHillSportsWebsite();
    }

    @When("^I check cookie notice pop up presence$")
    public void iCheckCookieNoticePopUpPresence() {
        homePage.iCheckCookieNoticePopUpPresence();
    }

    @And("^I close the cookie notice$")
    public void iCloseTheCookieNotice() {
        homePage.iCloseTheCookieNotice();
    }

    @Then("^I check presence of cdb cookie$")
    public void iCheckPresenceOfCdbCookie()  {
        homePage.iCheckPresenceOfCbdCookie();
    }

}
