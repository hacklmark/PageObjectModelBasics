package com.w2a.pages;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;
import org.openqa.selenium.By;

public class ZohoAppPage extends Page {


    public void goToChat(){

        driver.findElement(By.cssSelector("._logo-chat._logo-x96.zod-app-logo")).click();
    }

    public CRMHomePage goToCRM(){

        driver.findElement(By.cssSelector("._logo-crm._logo-x96.zod-app-logo")).click();

        return new CRMHomePage();
    }

    public void goToSalesIQ(){

        driver.findElement(By.cssSelector("._logo-salesiq._logo-x96.zod-app-logo")).click();
    }
}
