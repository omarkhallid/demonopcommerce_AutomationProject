package org.example.pages;

import org.example.stepDefs.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class P06_HomeSliders {

    public WebElement homeSlider(String sliderNum){
        WebElement hs =Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
        return hs;
    }

}
