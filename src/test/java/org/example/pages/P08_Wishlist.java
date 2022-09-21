package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;

public class P08_Wishlist {

    public WebElement wishlistbutton(){
        WebElement wishlist = Hooks.driver.findElement(By.xpath("(//button[@title='Add to wishlist'])[3]"));
        return wishlist;
    }

    public WebElement messageContainer(){
        WebElement container = Hooks.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
        return container;
    }
    public WebElement messageContent(){
        WebElement message = Hooks.driver.findElement(By.xpath("//p[@class='content']"));
        return message;
    }

    public WebElement wishlistProduct(){
        WebElement products = Hooks.driver.findElement(By.xpath("//span[@class='wishlist-qty']"));
        return products;
    }

}
