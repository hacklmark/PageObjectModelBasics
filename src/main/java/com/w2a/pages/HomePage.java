package com.w2a.pages;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class HomePage extends Page {


    public void goToSupport(){

        driver.findElement(By.cssSelector(".zh-user-account>a:nth-child(2)")).click();
    }

    public void goToSignUp(){

        driver.findElement(By.cssSelector(".zh-signup")).click();
    }

    public void goToLogin(){

        driver.findElement(By.cssSelector(".zh-login")).click();
    }

    public void goToZohoEdu(){

    }

    public void goToLearnMore(){

    }

    public void validateFooterLinks(){

    }
}
