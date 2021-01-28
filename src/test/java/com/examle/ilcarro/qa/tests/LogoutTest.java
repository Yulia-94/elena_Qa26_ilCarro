package com.examle.ilcarro.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(!app.getUser().isUserLoggedIn()){
           app.getUser().logIn(app.setEmail(), app.setPassword());
        }
    }

    @Test
    public void logoutTest() {
        app.getUser().clickLogoutButtonHeader();


    }

}
