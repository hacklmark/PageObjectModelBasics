package com.w2a.pages;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class LoginPage extends Page {


    public ZohoAppPage doLogin(String username, String password) throws InterruptedException {

        type("email_CSS", username);
        click("nextbtn_CSS");
        Thread.sleep(1000);
        type("password_CSS",password);
        click("signinbtn_ID");
        Thread.sleep(2000);

        return new ZohoAppPage();
    }

    public void goToSalesAndMarketing(){

    }
}
