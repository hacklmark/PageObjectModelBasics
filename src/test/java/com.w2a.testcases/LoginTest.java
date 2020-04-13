package com.w2a.testcases;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {

        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        ZohoAppPage zp = lp.doLogin("test.automatisierer@gmail.com", "Selenium@123");
    }

}
