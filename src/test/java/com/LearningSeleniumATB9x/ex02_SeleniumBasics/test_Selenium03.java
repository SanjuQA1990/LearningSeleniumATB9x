package com.LearningSeleniumATB9x.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_Selenium03 {

    @Description("Open the URL")
    @Test
    public void test_SeleniumPractice() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.manage().window().minimize();
    }
}