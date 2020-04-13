package com.w2a.base;

import com.w2a.pages.crm.accounts.AccountsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {


    /*
    TopMenu ISA Page???

    HomePage HASA TopMenu
    AccountsPage HASA TopMenu

    Page HASA TopMenu
     */

    WebDriver driver;

    public TopMenu(WebDriver driver){

        this.driver = driver;
    }

    public void goToHome(){

    }

    public void goToFeeds(){

    }

    public void goToLeads(){

    }

    public AccountsPage goToAccounts(){

        driver.findElement(By.cssSelector(".lyteMenuItems>div:nth-child(4)")).click();

        return new AccountsPage();
    }

    public void goToContacts(){

    }

    public void signOut(){

    }
}
