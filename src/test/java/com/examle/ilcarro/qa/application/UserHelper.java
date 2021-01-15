package com.examle.ilcarro.qa.application;

import com.examle.ilcarro.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper  extends HelperBase{
    WebDriver wd;

    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void logIn() throws InterruptedException {
        //clickOnLoginButton
        clickByCss("[href='/login']");
        fillLoginForm(new User().setEmail("my.email1609079373951@gmail.com").setPassword("Ro123451"));
        pause(2000);
        clickByCss("[type='submit']");
    }

    public boolean isRegistrationFormPresent() {
        return isElementPresent(By.xpath("//h2[contains(.,'Registration')]"));
    }

    public void selectCheckBox() {
        click(By.cssSelector("#check_policy"));
    }

    public void fillRegistrationForm(User user) {
        type(By.cssSelector("#first_name"), user.getfName());
        type(By.cssSelector("#second_name"), user.getlName());
        System.out.println("email is:" + user.getEmail());
        type(By.cssSelector("#email"), user.getEmail());
        type(By.cssSelector("#password"), user.getPassword());
    }

    public void openRegForm() {
        click(By.cssSelector("[href='/signup']"));
    }

    public void fillLoginForm(User user) {
        typeByCss("[name=emai]", user.getEmail());
        typeByCss("[name=password]", user.getPassword());
    }

    public void clickLogoutButtonHeader() {
        click(By.xpath("//a[contains(., 'logOut')]"));
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(., 'logOut')]"));
    }

    public void clickOnLoginButton() {
        clickByCss("[href='/login']");
    }

}
