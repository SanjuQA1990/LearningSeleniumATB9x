package com.LearningSeleniumATB9x.idrive360;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Home_page_login {
    @Description("Verify the url is displayed as expected after log in to idrive360")
    @Test

    public void home_login() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");

        driver.manage().window().maximize();

        Thread.sleep(3000);


        WebElement username =  driver.findElement(By.xpath("//input[@id=\"username\"]"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement userpassword =  driver.findElement(By.xpath("//input[@id=\"password\"]"));
        userpassword.sendKeys("123456");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id=\"frm-btn\"]")).click();

        Thread.sleep(12000);

        WebElement errorMessage = driver.findElement(By.xpath("//h5[@class=\"id-card-title\"]"));
        System.out.printf(errorMessage.getText());
        Assert.assertEquals(errorMessage.getText(),"Your free trial has expired");

        driver.close();
        driver.quit();

    }
}
