package com.w2a.pages.crm.accounts;

import com.w2a.base.Page;
import org.openqa.selenium.By;

public class AccountsPage extends Page {


    public CreateAccountPage gotToCreateAccount(){

        driver.findElement(By.cssSelector("button.newwhitebtn")).click();

        return new CreateAccountPage();
    }

    public void goToImportAccounts(){

    }
}
