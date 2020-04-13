package com.w2a.pages;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class LoginPage extends Page {


    public ZohoAppPage doLogin(String username, String password) throws InterruptedException {

        driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
        driver.findElement(By.cssSelector("#nextbtn")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.cssSelector("#nextbtn")).click();
        Thread.sleep(2000);

        return new ZohoAppPage();
    }

    public void goToSalesAndMarketing(){

    }
}
