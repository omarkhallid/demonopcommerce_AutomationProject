package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class D08_WishlistStepDef {
    P08_Wishlist wishlist = new P08_Wishlist();
    String products_before;
    @Given("user check number of products")
    public void assert_product_wishlist_before(){
        products_before = wishlist.wishlistProduct().getText();
        System.out.println(products_before);
    }
    @When("user click on wishlist button")
    public void add_to_wishlist_button(){

        wishlist.wishlistbutton().click();

    }

    @Then("validation message displayed that product is added")
    public void assert_container_visibility(){
        Assert.assertEquals(wishlist.messageContainer().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        Assert.assertTrue(wishlist.messageContainer().isDisplayed());
    }

    @And("assert success message and check qty is bigger than zero")
    public void assert_message(){
        Assert.assertTrue(wishlist.messageContent().getText().contains("The product has been added to your "));
        Assert.assertTrue(wishlist.messageContent().isDisplayed());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(wishlist.messageContent()));
        Hooks.driver.findElement(By.xpath("//a[@href=\"/wishlist\"]//span[@class]")).click();
        String value = Hooks.driver.findElement(By.xpath("//td[@class=\"quantity\"]//input[@type]")).getAttribute("value").toString();
        System.out.println(value);
        String zero = "0";
        Assert.assertNotEquals(zero , value);
    }

}
