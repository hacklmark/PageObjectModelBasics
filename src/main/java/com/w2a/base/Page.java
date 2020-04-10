package com.w2a.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Page {


    public static WebDriver driver;

    public Page(){

        if (driver == null) {
            //driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\com\\w2a\\executables\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.zoho.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}
