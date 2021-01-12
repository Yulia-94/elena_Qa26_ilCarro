package com.examle.ilcarro.qa.tests;

import com.examle.ilcarro.qa.model.User;
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
        logger.info("\n user name is my.email1609079373951@gmail.com \n user password is Ro123451");
        app.getUser().clickOnLoginButton();
        app.getUser().fillLoginForm(new User().setEmail("my.email1609079373951@gmail.com").setPassword("Ro123451"));
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn());
        logger.info("Test Passed");

        String screenshot = " src/test/screenshot- " + System.currentTimeMillis() + ".png";
        app.getUser().takeScreenshot(screenshot);

        logger.info("Created screenshot" + screenshot);

    }


}
