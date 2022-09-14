package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Currencies;
import org.example.pages.P04_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P04_Search searchedProduct = new P04_Search();

    @Given("user go to Search Page")
    public void userGoToSearchPage() {
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }


    @When("link of page is valid and user search withPN \"(.*)\"$")
    public void userSearchWithPN(String searchedText) {
        SoftAssert soft=new SoftAssert();
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(searchedText);
        Hooks.driver.findElement(By.className("button-1")).click();
        //checking for the correctness of URL
        System.out.println(Hooks.driver.getCurrentUrl());
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        soft.assertAll();
        
    }

    @Then("user could find \"(.*)\"$")
    public void userCouldFindRelativeResults(String searchedText) {
        SoftAssert soft=new SoftAssert();

        for(int i = 0 ; i<searchedProduct.searchedProducts().size() ; i++){
            searchedProduct.searchedProducts().get(i).getText();
            soft.assertTrue(searchedProduct.searchedProducts().get(i).getText().toLowerCase().contains(searchedText.toLowerCase()));
            System.out.println(searchedProduct.searchedProducts().get(i).getText());
            System.out.println(searchedText.toLowerCase());
            System.out.println(i);
        }
        soft.assertAll();
    }

    @When("user search with \\\"(.*)\\\"$")
    public void userSearchWith(String searchedText){
        SoftAssert soft=new SoftAssert();
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(searchedText);
        Hooks.driver.findElement(By.className("button-1")).click();
        soft.assertTrue(Hooks.driver.findElement(By.xpath("//div[@class=\"picture\"]")).isDisplayed());
        Hooks.driver.findElement(By.xpath("//div[@class=\"picture\"]")).click();
        soft.assertAll();
    }

    @Then("user could find defined \\\"(.*)\\\"$")
    public void userCouldFindInsideProductDetailPage(String searchedText) {
        SoftAssert soft=new SoftAssert();

        Hooks.driver.findElement(By.xpath("//div[@class=\"additional-details\"]//div[@class=\"sku\"]//span[@class=\"value\"]")).getText();
        soft.assertEquals(Hooks.driver.findElement(By.xpath("//div[@class=\"additional-details\"]//div[@class=\"sku\"]//span[@class=\"value\"]")).getText() , searchedText);
        soft.assertAll();
    }

}
