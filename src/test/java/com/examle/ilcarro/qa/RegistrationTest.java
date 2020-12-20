package com.examle.ilcarro.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }

    @Test
    public void testRegistration() throws InterruptedException {

        wd.findElement(By.cssSelector("[href='/signup']")).click();
       // wd.findElement(By.cssSelector("[href='/car']"));


        wd.findElement(By.id("first_name")).click();
        wd.findElement(By.id("first_name")).clear();
        wd.findElement(By.id("first_name")).sendKeys("Yulia");
        wd.findElement(By.id("second_name")).click();
        wd.findElement(By.id("second_name")).clear();
        wd.findElement(By.id("second_name")).sendKeys("Rosenblum");
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("1234rosen@gmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Trervgd123");
        wd.findElement(By.id("check_policy")).click();
        wd.findElement(By.className("yalla_yalla__1Jxk6")).click();

        wd.findElement(By.name("address")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){

    }

}


