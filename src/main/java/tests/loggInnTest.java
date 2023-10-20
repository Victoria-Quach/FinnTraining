package tests;

import org.openqa.selenium.WebDriver;


import pages.hjemPage;
import pages.loggInnPage;
import utilities.driverFactory;

public class loggInnTest {

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        loggInnTest.driver = driver;
    }
    

    public static void setUp() {
        driver = driverFactory.getChromeDriver();
        driver.get("https://www.finn.no/");
    }

    public static void performLogin() {
        // Perform login actions using hjemPage methods
        hjemPage.clickJegForstårButton(driver);
        hjemPage.clickLoggInnButton(driver);
        
        loggInnPage.typeUsername(driver);
        loggInnPage.typePassword(driver);
        loggInnPage.clickLoggPåButton(driver);
    }

    public static void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
    
    
}