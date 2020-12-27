package com.examle.ilcarro.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;




public class RegistrationTest {
    WebDriver wd;



    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro-dev-v1.firebaseapp.com/");
    }


    @Test
    public void testRegistration() throws InterruptedException {
        //open reg form
        wd.findElement(By.cssSelector("[href='/signup']")).click();

        //fill reg form
        wd.findElement(By.cssSelector("#first_name")).click();
        wd.findElement(By.cssSelector("#first_name")).clear();
        wd.findElement(By.cssSelector("#first_name")).sendKeys("Yulia");

        wd.findElement(By.cssSelector("#second_name")).click();
        wd.findElement(By.cssSelector("#second_name")).clear();
        wd.findElement(By.cssSelector("#second_name")).sendKeys("Rosenblum");


        String email = "my.email"+System.currentTimeMillis()+"@gmail.com";
        System.out.println("email is:" + email);
        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys(email);


        wd.findElement(By.cssSelector("#password")).click();
        wd.findElement(By.cssSelector("#password")).clear();
        wd.findElement(By.cssSelector("#password")).sendKeys("Ro12345");

        //selectCheckBox
        wd.findElement(By.cssSelector("#check_policy")).click();
        Thread.sleep(2000);


        //clickYullaBut
        wd.findElement(By.cssSelector("[type='submit']")).click();
        Thread.sleep(3000);

        Assert.assertFalse(wd.findElements(By.xpath("//h2[contains(.,'Registration')]")).size()>0);
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();

    }


}


