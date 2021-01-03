package com.examle.ilcarro.qa.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase {

    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void initAddingNewCar() {
        click(By.cssSelector("header [href='/car']"));
    }

    public boolean isCarCreationFormPresent() {
        return isElementPresent(By.xpath("//h3[contains(.,'Let the car work')]"));
    }

    public void fillCarForm(String location, String location2, String location3, String location4, String location5,
                            String location6, String location7,String location8, String location9, String location10,
                            String location11, String location12, String location13, String location14, String location15,
                            String location16, String location17, String location18, String location19, String location20) {
        type(By.cssSelector(".country"), location);
        type(By.cssSelector(".address"), location2);
        type(By.cssSelector(".distance_included"), location3);
        type(By.cssSelector(".serial_number"), location4);
        type(By.xpath("//input[@class='brand has-error']"), location5);
        type(By.xpath("//input[@placeholder='Model']"), location6);
        type(By.cssSelector("[name='year']"), location7);
        type(By.cssSelector("[placeholder='Engine']"),location8);
        type(By.xpath("//input[contains(@class,'fuel_consumption')]"), location9);
        type(By.cssSelector("[placeholder='Fuel']"), location10);
        type(By.cssSelector(".transmition"), location11);
        type(By.cssSelector("[name='wheels_drive']"), location12);
        type(By.cssSelector(".horsepower"), location13);
        type(By.cssSelector("[name=torque]"), location14);
        type(By.cssSelector("[placeholder='Doors']"), location15);
        type(By.cssSelector(".seats"), location16);
        type(By.xpath("//input[@name='car_class']"), location17);
        type(By.cssSelector("[name='about']"), location18);
        type(By.cssSelector(".type_feature"), location19);
        type(By.cssSelector("[placeholder='Price']"), location20);
    }
}