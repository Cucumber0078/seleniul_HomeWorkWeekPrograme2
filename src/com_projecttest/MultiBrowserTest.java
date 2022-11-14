package com_projecttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


    public class MultiBrowserTest {
        static String browser = "chrome";
        static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        static WebDriver driver;

        public static void main(String[] args) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.firefox.driver", "drivers/Firefoxdriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.Edge.driver", "drivers/Edgedriver.exe");
                driver = new EdgeDriver();
            } else {
                System.out.println("Wrong Browser Name");
            }
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            // find the email field element
            WebElement emailField = driver.findElement(By.name("username"));
            emailField.sendKeys("ssadfsdfsdf@gmail.com");
            WebElement passwordFiled = driver.findElement(By.name("password"));
            passwordFiled.sendKeys("sjdfkasjdf");

        }


    }
