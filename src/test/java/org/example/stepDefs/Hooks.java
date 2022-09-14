package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;

    @Before
    public static void OpenBrowser(){
        // 1) Bridge
        System.setProperty("webdriver.chrome.driver","D:\\FWD\\Drivers\\chromedriver.exe");

        // 2) Create new object from EdgeDriver
        driver = new ChromeDriver();

        // 3) Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7 , TimeUnit.SECONDS);

        // 4) Navigation to Website
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public static void CloseBrowser() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
