package pages;


import org.openqa.selenium.WebDriver;


import elements.elementsHjemPage;


public class hjemPage {

    public static void clickJegForstårButton(WebDriver driver) {
        driver.switchTo().frame(0);
        elementsHjemPage.jegForstårButton(driver).click();
        driver.switchTo().defaultContent();
    }
    

    public static void clickLoggInnButton(WebDriver driver) {
        elementsHjemPage.LoggInnButton(driver).click();

    }


    public static void clickReiseButton(WebDriver driver) {
        driver.switchTo().defaultContent();
        elementsHjemPage.reiseButton(driver).click();
    }


    public static void clickeiendomButton(WebDriver driver) {
        elementsHjemPage.eiendomButton(driver).click();
    }



    
}
