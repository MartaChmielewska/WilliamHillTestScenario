package com.williamhill.sports.stepdefs;

import com.williamhill.sports.pages.Header;
import com.williamhill.sports.utils.BaseTests;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HeaderStep {

    Header header;

    public HeaderStep() {
        header = new Header(BaseTests.getWebDriver());
    }

    @When("^I check presence of Join button$")
    public void iCheckPresenceOfJoinButton() {
        header.iCheckPresenceOfJoinButton();
    }

    @And("^I switch language to other (.*?)$")
    public void iSwitchLanguageToOtherLanguage(String language) {
        header.iSwitchLanguageToOtherLanguage(language);
    }

    @And("^I check that Join button label (.*?) is translated into other language$")
    public void iCheckThatJoinButtonLabelLabelIsTranslatedIntoOtherLanguage(String label) {
        header.iCheckThatJoinButtonLabelLabelIsTranslatedIntoOtherLanguage(label);
    }
}
