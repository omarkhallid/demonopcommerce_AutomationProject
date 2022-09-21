package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HoverCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class D05_hoverCategoriesStepDef {

    //  div[@class="header-menu"]//ul//li//div[@class="sublist-toggle"]

    P05_HoverCategories category = new P05_HoverCategories();
    SoftAssert soft = new SoftAssert();
    int rn = new Random().nextInt(3);
    int rsn = new Random().nextInt(3);

    @Given("user want to hover on one of three main categories and check page title")
    public void hovering(){
        //category.mainCategories();

        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(category.mainCategories().get(rn)).perform();
        category.mainCategories().get(rn).click();
        String randomSelected = category.subCategories(rn).get(rsn).getText();
        category.subCategories(rn).get(rsn).click();
        System.out.println(randomSelected);
        String pgTitle = Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(pgTitle.toLowerCase().contains(randomSelected.toLowerCase()));
        soft.assertAll();

    }

}
