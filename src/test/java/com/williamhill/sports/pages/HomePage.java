package com.williamhill.sports.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        driver = webDriver;
    }

    protected static WebDriver driver;

    private static final String COOKIE_POPUP = "//div[(@class='cookie-disclaimer')]";
    private static final String ACCEPT_COOKIES = "//button[(@class='cookie-disclaimer__button')]";


    public void iAmOnWilliamHillSportsWebsite() {
        driver.navigate().to("http://sports.williamhill.com/betting/en-gb");
        Assert.assertEquals("Online Betting from William Hill - The Home of Betting", driver.getTitle());
    }

    public void iCheckCookieNoticePopUpPresence() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(COOKIE_POPUP)));
        WebElement cookiesPopup = driver.findElement(By.xpath(COOKIE_POPUP));
        Assert.assertTrue(cookiesPopup.isDisplayed());
    }

    public void iCloseTheCookieNotice() {
        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();
    }

    public void iCheckPresenceOfCbdCookie() {
      Assert.assertNotNull(driver.manage().getCookieNamed("cdb"));
    }
}
