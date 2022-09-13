package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void RegisterPage(){
        register.RegisterLink().click();
    }
}
