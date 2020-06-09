package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest {

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void createAccountTest(String username) throws InterruptedException {
        ZohoAppPage zp = new ZohoAppPage();
        zp.goToCRM();
        Thread.sleep(3000);
        AccountsPage accounts = Page.menu.goToAccounts();
        CreateAccountPage cap = accounts.gotToCreateAccount();
        cap.createAccount(username);
        //Assert.fail("Create account test failed");
    }
}
