package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;


public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void loginPage() {
        login.login().click();


    }

    @When("user press on login button")
    public void pressLogin() {

        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void navigate() {
        SoftAssert soft = new SoftAssert();

        System.out.println("home page");
        System.out.println(Hooks.driver.getCurrentUrl());
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "home page");
        soft.assertTrue(login.myAccount().isDisplayed());

        soft.assertAll();

    }

    @And("user enter invalid email field")
        public void invalidEmail(){
            login.invalidEmail().sendKeys("omar1@gmail.com");
        }

    @And("user enter invalid Password field")
    public void invalidPassword(){
            login.invalidPassword().sendKeys("111111");
        }

    @Then("user couldn't login to the system")
    public void failureMassage(){

        SoftAssert soft=new SoftAssert();
        String expec = "Login was unsuccessful. Please correct the errors and try again.";
        //String actual = Hooks.driver.findElement(By.className("returning-wrapper fieldset")).getText();
        String actual = Hooks.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        soft.assertTrue(actual.contains(expec) , "Login was unsuccessful");
        System.out.println("Error Message : "+actual);

        soft.assertAll();

        String color=Hooks.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getCssValue("color");
        String hex = Color.fromString(color).asHex();
        System.out.println("color:"+ hex);

    }
}
