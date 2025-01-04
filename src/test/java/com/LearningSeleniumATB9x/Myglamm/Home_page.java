package com.LearningSeleniumATB9x.Myglamm;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home_page {
    @Description("Verify the url is displayed as expected after loginto Myglamm")
    @Test

    public void home_page_button() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.myglamm.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@src=\"https://files.myglamm.com/site-images/original/icons8-customer-64.png\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9468326512");


      // driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);

        //a[text()="Make Appointment" and contains(@id,"btn-make-appointment")]


        driver.findElement(By.xpath("//button[text()=\"SIGN IN\" and (@type=\"submit\") ]")).click();

       // Thread.sleep(3000);

        //Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");




       // driver.close();
       // driver.quit();


    }
}
