package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {

    public WebElement RegisterLink(){

        WebElement register = Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }
}
