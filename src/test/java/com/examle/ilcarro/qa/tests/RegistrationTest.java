package com.examle.ilcarro.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase{

    @Test
    public void testRegistration() throws InterruptedException {

        app.getUser().openRegForm();
        String email = "my.email"+System.currentTimeMillis()+"@gmail.com";
        app.getUser().fillRegistrationForm("Yulia", "Rosenblum", email, "Ro123451");
        app.getUser().selectCheckBox();
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();
        app.getUser().pause(3000);

       Assert.assertFalse(app.getUser().isRegistrationFormPresent());
    }

    @Test
    public void testRegistration2() throws InterruptedException {

        app.getUser().openRegForm();
        String email = "myEmail"+System.currentTimeMillis()+"@mail.com";
        app.getUser().fillRegistrationForm("Misha", "Rosen", email, "Ro12345wa");
        app.getUser().selectCheckBox();
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();
        app.getUser().pause(3000);

        Assert.assertFalse(app.getUser().isRegistrationFormPresent());
    }

    @Test
    public void testRegistrationNegativ() throws InterruptedException {

        app.getUser().openRegForm();
        String email = "myEmail"+System.currentTimeMillis();
        app.getUser().fillRegistrationForm("Misha", "Rosen", email, "Ro12345wa");
        app.getUser().selectCheckBox();
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();
        app.getUser().pause(3000);

        Assert.assertTrue(app.getUser().isRegistrationFormPresent());
    }


}


