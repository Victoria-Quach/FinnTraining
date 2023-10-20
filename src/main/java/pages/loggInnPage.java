package pages;


import org.openqa.selenium.WebDriver;


import elements.elementsLoggInnPage;


public class loggInnPage {

    public static void typeUsername(WebDriver driver) {
        elementsLoggInnPage.username(driver).sendKeys("ingvild.svendsen@expleogroup.com");
    }
    

    public static void typePassword(WebDriver driver) {
        elementsLoggInnPage.password(driver).sendKeys("Expleo123");

    }


    public static void clickLoggPåButton(WebDriver driver) {
        elementsLoggInnPage.LoggPåButton(driver).click();
    }

    
}


    

