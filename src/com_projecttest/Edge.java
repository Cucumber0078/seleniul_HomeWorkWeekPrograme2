package com_projecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.Edge.driver", "drivers/edgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);// Maximise Window
        driver.manage().window().maximize();
        // We give implecit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the tille of the page//
        String title =  driver.getTitle();
        System.out.println("page title is :" + title );
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page source  :"+ driver.getPageSource());


        // find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("ssadfsdfsdf@gmail.com");
        WebElement passwordFiled = driver.findElement(By.name("password"));
        passwordFiled.sendKeys("sjdfkasjdf");

        //close the browser
        //driver.quit();

    }}


