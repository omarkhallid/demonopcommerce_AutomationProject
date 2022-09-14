package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P01_Register {

    public WebElement RegisterLink(){

        WebElement register = Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }

    public WebElement gender(){
        WebElement gen= Hooks.driver.findElement(By.id("gender-male"));
        return gen;
    }

    public WebElement firstName(){
        WebElement first= Hooks.driver.findElement(By.id("FirstName"));
        return first;}

    public WebElement lastName(){
        WebElement last=  Hooks.driver.findElement(By.id("LastName"));
        return last;}

    public WebElement dayDate(){
        WebElement day= Hooks.driver.findElement(By.cssSelector("option[value=\"11\"]"));
        return day;}

    public WebElement monthDate(){
        WebElement month= Hooks.driver.findElement(By.cssSelector("option[value=\"7\"]"));
        return month;}

    public WebElement yearDate(){
        WebElement year= Hooks.driver.findElement(By.cssSelector("option[value=\"2000\"]"));
        return year;}

    public WebElement email(){
        WebElement e= Hooks.driver.findElement(By.id("Email"));
        return e;}

    public WebElement companyName(){
        WebElement name= Hooks.driver.findElement(By.id("Company"));
        return name;}

    public WebElement password(){
        WebElement pass=  Hooks.driver.findElement(By.id("Password"));
        return pass;}



}
