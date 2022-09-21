package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_HoverCategories {
    public List<WebElement> mainCategories(){

       List<WebElement> mainCategories = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return  mainCategories;

    }


    public List<WebElement> subCategories(int catNum){

        List<WebElement> subCategories = Hooks.driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div["+catNum+"]"));
        return  subCategories;

    }
}
