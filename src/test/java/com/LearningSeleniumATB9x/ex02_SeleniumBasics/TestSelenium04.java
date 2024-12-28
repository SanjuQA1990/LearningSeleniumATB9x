package com.LearningSeleniumATB9x.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        // EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--headless");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");
    }
}