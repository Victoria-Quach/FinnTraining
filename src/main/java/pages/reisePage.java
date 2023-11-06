package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import elements.elementsHjemPage;
import elements.elementsReisePage;

public class reisePage {

    private elementsReisePage elementsReise;
    private elementsHjemPage elementsHjem;
    private WebDriver driver;

    public reisePage(WebDriver driver) { 
        this.driver = driver;
        elementsReise = new elementsReisePage(driver); // passing the driver
        elementsHjem = new elementsHjemPage(driver);  //passing the driver
    }

    public void ClickReiseButton() {
        elementsHjem.reiseButton().click();
    }

    
    public void typeFlyFra() {
        elementsReise.FlyFra().sendKeys("Oslo lufthavn Gardermoen");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementsReise.FlyFra().sendKeys(Keys.RETURN);
    }


    public void typeFlyTil() {
        elementsReise.FlyTil().sendKeys("Barcelona");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementsReise.FlyTil().sendKeys(Keys.RETURN);
    }

    public void ClickDatoUtreiseFelt() {
        elementsReise.datoUtreiseFelt().click();
    }


    public void ClickNesteMånedButton() {
        elementsReise.NesteMånedButton().click();
    }


    public void ClickUtreiseDato() {
        elementsReise.UtreiseDato().click();
    }
    

    public void ClickHjemreiseDato() {
        elementsReise.HjemreiseDato().click();
    }


    public void ClickHotellButton() {
        elementsReise.HotellButton().click();
    }


     public void ClickSøkFlyButton() {
        elementsReise.SøkFlyButton().click();
    }

    
}
