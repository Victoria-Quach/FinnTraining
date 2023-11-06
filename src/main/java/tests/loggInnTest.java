package tests;

import org.openqa.selenium.WebDriver;


import pages.hjemPage;
import utilities.driverFactory;

public class loggInnTest {
    private WebDriver driver;
    private hjemPage hjem;
    public void performLoggInn(){

    this.driver = driverFactory.open("incognito");
    this.driver.get("https://www.finn.no/");
    this.hjem = new hjemPage(driver);
    this.hjem.clickJegForstårButton();

     
        /* 
        hjem.clickLoggInnButton();

        loggInnPage loggInn = new loggInnPage(driver);
        loggInn.typeUsername();
        loggInn.typePassword();
        loggInn.clickLoggPåButton();
        */

        return;
        
    }


    public static void tearDown(WebDriver driver) {
        // Close the browser after the test
        driver.quit();
    }
    
    
}