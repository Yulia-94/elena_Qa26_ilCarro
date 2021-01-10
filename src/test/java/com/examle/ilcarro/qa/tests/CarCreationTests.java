package com.examle.ilcarro.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarCreationTests extends TestBase{

    @Test(enabled = true)
    public void testCarCreation() throws InterruptedException {
        app.getCarHelper().initAddingNewCar();
        Assert.assertTrue(app.getCarHelper().isCarCreationFormPresent());
        app.getCarHelper().fillCarForm("Israel", "Haifa,Mahal", "500", "123 56 899",
                "Audi", "A6", "2017", "2.0", "5.0", "benzine", "automat",
                "front", "150", "240", "5", "5", "B", "Good condition",
                "not", "80000");
        app.getCarHelper().pause(2000);
        app.getCarHelper().clickYallaButton();
        app.getCarHelper().pause(3000);
    }


}
