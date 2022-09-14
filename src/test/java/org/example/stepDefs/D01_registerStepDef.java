package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void RegisterPage(){
        register.RegisterLink().click();
    }

    @And("user select gender type")
    public void gender(){
        register.gender().click();


    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void first_and_LastName(){
        register.firstName().sendKeys("Omar");
        register.lastName().sendKeys("Khaled");

    }
    @And("user enter date of birth")
    public void birthday_data(){
        register.dayDate().click();
        register.monthDate().click();
        register.yearDate().click();
    }
    @And("user enter valid email\"(.*)\"$")
    public void email(String email){

        register.email().sendKeys("omar15fire@gmail.com");
    }
    @And("user enter his Company name")
    public void CompanyName(){
        register.companyName().sendKeys("Google");}

    @And("user enter valid Password\"(.*)\"$")
    public void password(String password){

        register.password().sendKeys("654321");
    }
    @And("user fills Confirm Password field")
    public void Confirm(){

        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("654321");
    }
    @When("user clicks on register button")
    public void enterRegister(){
        Hooks.driver.findElement(By.id("register-button")).click();

    }
    @Then("success message is displayed")
    public void successMassage(){

        SoftAssert soft=new SoftAssert();

        soft.assertTrue(Hooks.driver.findElement(By.className("result")).isDisplayed());
        soft.assertAll();

        String color=Hooks.driver.findElement(By.className("result")).getCssValue("color");
        System.out.println("color:"+ color);
        //user has logged out
        Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"]")).click();
    }

}
