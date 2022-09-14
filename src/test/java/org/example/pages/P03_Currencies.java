package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Currencies {

    public List<WebElement>products(){
        List<WebElement> products= Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return products;
    }
}
