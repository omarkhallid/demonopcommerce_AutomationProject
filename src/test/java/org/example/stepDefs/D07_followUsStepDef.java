package org.example.stepDefs;

import io.cucumber.java.en.And;

import io.cucumber.java.en.When;
import org.example.pages.P07_FollowUs;
import org.testng.Assert;


import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_FollowUs followUs = new P07_FollowUs();
    ArrayList<String> tabs ;

    @When("user clicks facebook icon")
    public void navigating_to_facebook() throws InterruptedException {
        followUs.facebook().click();
        Thread.sleep(2000);
    }

    @When("user clicks twitter icon")
    public void navigating_to_twitter() throws InterruptedException {
        followUs.twitter().click();
        Thread.sleep(2000);
    }

    @When("user clicks rss icon")
    public void navigating_to_rss() throws InterruptedException {
        followUs.rss().click();
        Thread.sleep(2000);
    }

    @When("user clicks youtube icon")
    public void navigating_to_youtube() throws InterruptedException {
        followUs.youtube().click();
        Thread.sleep(2000);
    }
    @And("^select \"(.*)\" tab$")
    public void navigating_to_Tabs(String link) throws InterruptedException {
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        switch (link) {
            case "facebook":
                Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"));
                break;
            case "twitter":
                Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://twitter.com/nopCommerce"));
                break;

            case "rss":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
                break;

            case "youtube":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
                break;

        }
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
    }
}
