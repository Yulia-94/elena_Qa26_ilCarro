package com.examle.ilcarro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @BeforeMethod
    public void ensurePreconditions(){
        /*if user logged in, logout*/
        if(app.getUser().isUserLoggedIn()){
            app.getUser().clickLogoutButtonHeader();
        }
    }


    @Test
    public void testLogin() throws InterruptedException {
        app.getUser().clickOnLoginButton();
        app.getUser().fillLoginForm("my.email1609079373951@gmail.com", "Ro123451");
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn());

    }


}
