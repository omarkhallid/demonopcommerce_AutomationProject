package org.example.stepDefs;
import org.example.stepDefs.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomeSliders;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {

    P06_HomeSliders hs=new P06_HomeSliders();
    @When("user select first slider")
    public void slider1(){
        hs.homeSlider("1").click();

    }
    @Then("nokia page open")
    public void nokia() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","Nokia");
        soft.assertAll();
    }
    @When("user select second slider")
    public void slider2()  {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        hs.homeSlider("2").click();


    }
    @Then("iphone page open")
    public void iphone()throws InterruptedException{
        Thread.sleep(2000);
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iPhone_s6","Iphone");

        soft.assertAll();

    }
}
