package com.examle.ilcarro.qa.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    UserHelper user;
    CarHelper carHelper;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void start() {
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        } else if(browser.equals(BrowserType.EDGE)){
            wd = new EdgeDriver();
        }

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
