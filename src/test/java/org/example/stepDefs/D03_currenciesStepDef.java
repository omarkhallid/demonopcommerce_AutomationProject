package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Currencies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D03_currenciesStepDef {
    P03_Currencies product = new P03_Currencies();
    @When("user select “Euro” from currency dropdown")
    public void selectEuro(){
        WebElement euroCurr = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(euroCurr);
        select.selectByVisibleText("Euro");

    }

    //For checking euro sign through all products
    @Then("euro sign are found through all products in homepage")
    public void euroDisplay() {

        SoftAssert soft=new SoftAssert();

        for(int i = 0 ; i<product.products().size() ; i++){
            String price = product.products().get(i).getText();
            String curr = "€";

            soft.assertTrue(price.contains(curr));
            System.out.println(price);
        }
        soft.assertAll();
    }
}
