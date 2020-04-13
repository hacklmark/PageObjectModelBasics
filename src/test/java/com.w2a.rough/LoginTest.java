package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;


public class LoginTest {

    public static void main(String[] args) throws InterruptedException {


        HomePage home = new HomePage();
        LoginPage lp = home.goToLogin();
        ZohoAppPage zp = lp.doLogin("test.automatisierer@gmail.com", "Selenium@123");
        zp.goToCRM();
        Thread.sleep(3000);
        AccountsPage accounts = Page.menu.goToAccounts();
        CreateAccountPage cap = accounts.gotToCreateAccount();
        cap.createAccount("Max");
    }
}
