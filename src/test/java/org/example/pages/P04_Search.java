package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {

    public List<WebElement> searchedProducts(){
        List<WebElement> searchedProducts= Hooks.driver.findElements(By.xpath("//div[@class=\"details\"]//a[@href=\"/asus-n551jk-xo076h-laptop\"]"));
        return searchedProducts;
    }
}
