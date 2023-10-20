package pages;


import org.openqa.selenium.WebDriver;

import elements.elementsHjemPage;
import elements.elementsReisePage;

public class reisePage {

    public static void ClickReiseButton(WebDriver driver) {
        elementsHjemPage.reiseButton(driver).click();
    }

    
    public static void typeFlyFra(WebDriver driver) {
        elementsReisePage.FlyFra(driver).sendKeys("Oslo lufthavn Gardermoen");
    }


    public static void typeFlyTil(WebDriver driver) {
        elementsReisePage.FlyTil(driver).sendKeys("Barcelona");
    }


    public static void ClickDatoUtreiseFelt(WebDriver driver) {
        elementsReisePage.datoUtreiseFelt(driver).click();
    }


    public static void ClickNesteMånedButton(WebDriver driver) {
        elementsReisePage.NesteMånedButton(driver).click();
    }


    public static void ClickUtreiseDato(WebDriver driver) {
        elementsReisePage.UtreiseDato(driver).click();
    }
    

    public static void ClickHjemreiseDato(WebDriver driver) {
        elementsReisePage.HjemreiseDato(driver).click();
    }


    public static void ClickHotellButton(WebDriver driver) {
        elementsReisePage.HotellButton(driver).click();
    }


     public static void ClickSøkFlyButton(WebDriver driver) {
        elementsReisePage.SøkFlyButton(driver).click();
    }

    
}
