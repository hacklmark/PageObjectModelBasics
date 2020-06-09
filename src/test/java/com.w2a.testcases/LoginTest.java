package com.w2a.testcases;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(dataProviderClass = Utilities.class,dataProvider = "dp")
    public void loginTest(String username, String password, String runmode) throws InterruptedException {

        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        ZohoAppPage zp = lp.doLogin(username, password);
        //Assert.fail("Login test failed");
    }

}

