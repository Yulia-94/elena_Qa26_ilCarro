package com.examle.ilcarro.qa.tests;

import com.examle.ilcarro.qa.application.ApplicationManager;

import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    Logger logger = LoggerFactory.getLogger(TestBase.class);



    @BeforeSuite
    public void setUp(){
        app.start();
    }


    @BeforeMethod
    public void startLogger(Method m){
        logger.info("start test " + m.getName());

    }
    @AfterMethod(alwaysRun = true)
    public void stopLogger(Method m){
        logger.info("stop test "+ m.getName());

    }

    @AfterSuite
    public void tearDown(){
        app.stop();

    }





}
