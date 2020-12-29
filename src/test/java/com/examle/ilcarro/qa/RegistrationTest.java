package com.examle.ilcarro.qa;


import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase{

    @Test
    public void testRegistration() throws InterruptedException {

        app.getUserHelperger().openRegForm();
        String email = "my.email"+System.currentTimeMillis()+"@gmail.com";
        app.getUserHelperger().fillRegistrationForm("Yulia", "Rosenblum", email, "Ro123451");
        app.getUserHelperger().selectCheckBox();
        app.getUserHelperger().pause(2000);
        app.clickYallaButton();
        app.pause(3000);

       Assert.assertFalse(app.isRegistrationFormPresent());
    }

    @Test
    public void testRegistration2() throws InterruptedException {

        app.openRegForm();
        String email = "myEmail"+System.currentTimeMillis()+"@mail.com";
        app.fillRegistrationForm("Misha", "Rosen", email, "Ro12345wa");
        app.selectCheckBox();
        app.pause(2000);
        app.clickYallaButton();
        app.pause(3000);

        Assert.assertFalse(app.isRegistrationFormPresent());
    }

    @Test
    public void testRegistrationNegativ() throws InterruptedException {

        app.openRegForm();
        String email = "myEmail"+System.currentTimeMillis();
        app.fillRegistrationForm("Misha", "Rosen", email, "Ro12345wa");
        app.selectCheckBox();
        app.pause(2000);
        app.clickYallaButton();
        app.pause(3000);

        Assert.assertTrue(app.isRegistrationFormPresent());
    }


}


