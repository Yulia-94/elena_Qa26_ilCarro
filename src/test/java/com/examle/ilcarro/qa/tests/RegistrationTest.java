package com.examle.ilcarro.qa.tests;


import com.examle.ilcarro.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends TestBase{

    @Test
    public void testRegistration() throws InterruptedException {

        app.getUser().openRegForm();
        String email = "my.email"+System.currentTimeMillis()+"@gmail.com";
        app.getUser().fillRegistrationForm(new User().setfName("Yulia").setlName("Rosenblum").setEmail(email).setPassword("Ro123451"));
        app.getUser().selectCheckBox();
        app.getUser().pause(2000);
        app.getUser().clickYallaButton();
        app.getUser().pause(3000);

       Assert.assertFalse(app.getUser().isRegistrationFormPresent());
    }






}


