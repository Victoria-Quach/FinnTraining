package pages;

import org.openqa.selenium.WebDriver;

import elements.elementsEiendomPage;
import elements.elementsEiendomTyperPage;

public class eiendomTyperPage {

    private elementsEiendomPage elementsEiendom;
    private elementsEiendomTyperPage elementsEiendomTyper;
    private WebDriver driver;

    public eiendomTyperPage(WebDriver driver) {
        this.driver = driver;
        elementsEiendom = new elementsEiendomPage(driver);
        elementsEiendomTyper = new elementsEiendomTyperPage(driver);
    }

    public void clickBoligTilSalgsButton() {
        elementsEiendomTyper.boligTilSalgsButton().click();
    }

    

    
}
