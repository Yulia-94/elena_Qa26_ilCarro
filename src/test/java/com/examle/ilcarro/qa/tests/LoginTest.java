package com.examle.ilcarro.qa.tests;

import com.examle.ilcarro.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions(){
        /*if user logged in, logout*/
        if(app.getUser().isUserLoggedIn()){
            app.getUser().clickLogoutButtonHeader();
        }
    }

    @DataProvider
    public Iterator<Object[]> validLogin(){
        List<Object[]> list = new ArrayList<>();
    list.add(new Object[]{"my.email1609079373951@gmail.com", "Ro123451"});
    list.add(new Object[]{"my.email1608821574952@gmail.com", "iL12345678"});

    return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> validLoginFromCsv() throws IOException {
      List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/validLoginCsv.csv")));
        String line = reader.readLine();
        while(line != null){
            String[] split = line.split(";");
            list.add(new Object[]{new User().setEmail(split[0]).setPassword(split[1])});
            line = reader.readLine();
        }


        return list.iterator();
    }
    @Test(dataProvider = "validLoginFromCsv")
    public void testLoginDateProviderCsv(User user) throws InterruptedException {
        logger.info("\n user name is" +user.getEmail() + "\n user password is " + user.getPassword());
        app.getUser().clickOnLoginButton();
        app.getUser().fillLoginForm(user);
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn());
        logger.info("Test Passed");

        String screenshot = "src/test/screenshot-" + System.currentTimeMillis() + ".png";
        app.getUser().takeScreenshot(screenshot);

        logger.info("Created screenshot" + screenshot);

    }



    @Test(dataProvider = "validLogin")
    public void testLoginDataProvider(String email, String password) throws InterruptedException {
        logger.info("\n user name is " + email + "\n user password is " + password);
        app.getUser().clickOnLoginButton();
        app.getUser().fillLoginForm(new User().setEmail(email).setPassword(password));
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();

        Assert.assertTrue(app.getUser().isUserLoggedIn());
        logger.info("Test Passed");

        String screenshot = "src/test/screenshot-" + System.currentTimeMillis() + ".png";
        app.getUser().takeScreenshot(screenshot);

        logger.info("Created screenshot" + screenshot);

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

        String screenshot = "src/test/screenshot-" + System.currentTimeMillis() + ".png";
        app.getUser().takeScreenshot(screenshot);

        logger.info("Created screenshot" + screenshot);

    }

}
