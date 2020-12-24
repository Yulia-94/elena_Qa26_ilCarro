package com.examle.ilcarro.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RegistrationTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
        //wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    @Test
    public void testRegistration() throws InterruptedException {


        wd.findElement(By.cssSelector("[href='/signup]")).click();

        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Yulia");

        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Rosenblum");

        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("my.email" + System.currentTimeMillis() + "@gmail.com");

        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("Ro123456");

        wd.findElement(By.cssSelector("#check_policy")).click();
        Thread.sleep(3000);
        wd.findElement(By.cssSelector("[type=submit]")).click();

    }



    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}


