package com.LearningSeleniumATB9x.ex02_SeleniumBasics;
import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open the google.com and Get the title")
    @Test

    public void test_Selenium01()
    {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }

}
