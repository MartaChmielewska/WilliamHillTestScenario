package com.williamhill.sports.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {

    public Header(WebDriver webDriver) {
        driver = webDriver;
    }

    protected static WebDriver driver;

    private static final String JOIN_BUTTON = "//a[(@id='joinLink')]";
    private static final String LANGUAGE_LINK = "//a[(@class='js-language-button')]";


    public void iCheckPresenceOfJoinButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JOIN_BUTTON)));
        WebElement join = driver.findElement(By.xpath(JOIN_BUTTON));
        Assert.assertTrue(join.isDisplayed());
    }

    public void iSwitchLanguageToOtherLanguage(String language) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LANGUAGE_LINK))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(language))).click();
    }

    public void iCheckThatJoinButtonLabelLabelIsTranslatedIntoOtherLanguage(String label) {
        WebElement element = driver.findElement(By.xpath("//a[(@class='header__join')and(text()='" + label + "')]"));
        Assert.assertTrue(element.isDisplayed());
    }


}
