package com.examle.ilcarro.qa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(!app.isUserLoggedIn()){
           app.logIn();
        }
    }

    @Test
    public void logoutTest() {
        app.clickLogoutButtonHeader();


    }

}
