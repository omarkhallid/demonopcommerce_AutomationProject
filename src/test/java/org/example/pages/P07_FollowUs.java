package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;

public class P07_FollowUs {

    public WebElement facebook(){
        WebElement facebook = Hooks.driver.findElement(By.xpath("//a[text()='Facebook']"));
        return facebook;
    }

    public WebElement twitter(){
        WebElement twitter = Hooks.driver.findElement(By.xpath("//a[text()='Twitter']"));
        return twitter;
    }

    public WebElement rss(){
        WebElement rss = Hooks.driver.findElement(By.xpath("//a[text()='RSS']"));
        return rss;
    }

    public WebElement youtube(){
        WebElement youtube = Hooks.driver.findElement(By.xpath("//a[text()='YouTube']"));
        return youtube;
    }
}
