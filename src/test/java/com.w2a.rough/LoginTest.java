package com.w2a.rough;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;


public class LoginTest {

    public static void main(String[] args) throws InterruptedException {


        HomePage home = new HomePage();
        home.goToLogin();
        LoginPage login = new LoginPage();
        login.doLogin("test.automatisierer@gmail.com", "Selenium@123");
        ZohoAppPage zp = new ZohoAppPage();
        zp.goToCRM();
    }
}
