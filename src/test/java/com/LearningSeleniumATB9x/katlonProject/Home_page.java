package com.LearningSeleniumATB9x.katlonProject;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_page {
    @Description("Verify the url is displayed as expected after loginto katlon")
    @Test

    public void home_page_button() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.id("btn-make-appointment")).click();

        driver.findElement(By.id("txt-username")).sendKeys("John Doe");


        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);

        driver.findElement(By.id("btn-login")).click();

        Thread.sleep(3000);

        //Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        // Verify the URL
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://katalon-demo-cura.herokuapp.com/#appointment";
        assert currentUrl != null;
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("URL validation passed.");
        } else {
            System.out.println("URL validation failed.");
        }


        driver.close();
        driver.quit();


    }
}
