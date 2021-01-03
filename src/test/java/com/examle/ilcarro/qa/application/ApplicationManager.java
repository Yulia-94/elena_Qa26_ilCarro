package com.examle.ilcarro.qa.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    UserHelper user;
    CarHelper carHelper;



    public void start() {
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        user = new UserHelper(wd);
        carHelper = new CarHelper(wd);
    }

    public void stop() {

        wd.quit();
    }


    public CarHelper getCarHelper() {
        return carHelper;
    }

    public UserHelper getUser (){
       return user;
    }

}
