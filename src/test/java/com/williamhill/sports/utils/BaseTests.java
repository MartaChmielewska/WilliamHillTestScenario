package com.williamhill.sports.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private static WebDriver webDriver;

    @BeforeClass
    public static void launchApplication() {
        setChromeDriverProperty();
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public static void closeBrowser() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    private static void setChromeDriverProperty() {
        WebDriverManager.chromedriver().setup();
    }
}
