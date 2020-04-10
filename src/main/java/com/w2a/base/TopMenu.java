package com.w2a.base;

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

    public void goToAccounts(){
        driver.findElement(By.cssSelector(".lyteMenuItems>div:nth-child(4)")).click();
    }

    public void goToContacts(){

    }

    public void signOut(){

    }
}
