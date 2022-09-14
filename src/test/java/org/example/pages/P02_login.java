package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement login(){
        WebElement login= Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return login;

    }
    public WebElement loginButton(){
        WebElement loginButton=  Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] button[type=\"submit\"]"));
        return loginButton;

    }

    public WebElement myAccount(){
        WebElement myAcc= Hooks.driver.findElement(By.className("ico-account"));
        return myAcc;}

    public WebElement invalidEmail(){
        WebElement invE= Hooks.driver.findElement(By.id("Email"));
        return invE;}

    public WebElement invalidPassword(){
        WebElement invPass=  Hooks.driver.findElement(By.id("Password"));
        return invPass;}
}
