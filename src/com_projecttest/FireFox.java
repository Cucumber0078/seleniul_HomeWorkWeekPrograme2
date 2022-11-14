package com_projecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);// Maximise Window
        driver.manage().window().maximize();
        // We give implecit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the tille of the page//
        String title =  driver.getTitle();
        System.out.println("page title is :" + title );
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page source  :"+ driver.getPageSource());
        // Navigate to URL
        ///String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2Fdigital-downloads";
        // driver.navigate().to(loginUrl);

        // Navigate to login page by clicking on logon link
        //WebElement loginLink =  driver.findElement(By.linkText("Log in"));
        // loginLink.click();

        // find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("ssadfsdfsdf@gmail.com");
        WebElement passwordFiled = driver.findElement(By.name("password"));
        passwordFiled.sendKeys("sjdfkasjdf");

        //close the browser
        //driver.quit();

    }}



