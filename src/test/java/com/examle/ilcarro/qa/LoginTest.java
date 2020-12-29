package com.examle.ilcarro.qa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @BeforeMethod
    public void ensurePreconditions(){
        /*if user logged in, logout*/
        if(app.isUserLoggedIn()){
            app.clickLogoutButtonHeader();
        }
    }


    @Test
    public void testLogin() throws InterruptedException {
        app.clickOnLoginButton();
        app.fillLoginForm("my.email1609079373951@gmail.com", "Ro123451");
        app.pause(2000);
        app.clickYallaButton();

        Assert.assertTrue(app.isUserLoggedIn());

    }


}
