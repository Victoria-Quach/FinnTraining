package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.hjemPage;
import pages.reisePage;
import pages.reiseResultatPage;
import pages.eiendomPage;
import pages.eiendomTyperPage;
import utilities.driverFactory;

public class eiendomsTest {

    private WebDriver driver;
    private hjemPage hjem;
    private eiendomPage eiendom;
    private eiendomTyperPage eiendomTyper;


    @Before
    public void setUp() {
        this.driver = driverFactory.open("incognito");
        this.driver.get("https://www.finn.no/");
        driver.manage().window().maximize();
        this.hjem = new hjemPage(driver);
        //this.hjem.clickJegForstårButton();
        this.hjem.clickEiendomButton();
        // // Now that hjemPage and loggInnPage are initialized, construct reisePage
        this.eiendomTyper = new eiendomTyperPage(driver);
        this.eiendom = new eiendomPage(driver);
    }


    @Test
    public void performEiendomTest() {

        this.eiendomTyper.clickBoligTilSalgsButton();
        this.eiendom.ClickSøkEiendomButton();
        System.out.println("før jeg klikker søkkartknapp");
        this.eiendom.ClickSøkefeltKartButton();
        System.out.println("har klikket på søkkart-knapp");
        this.eiendom.ClickOmrådeButton();
        this.eiendom.ClickBygdøyFrogner();
        this.eiendom.ClickUranienborgMajorstuen();
        this.eiendom.ClickBoligtypeButton();
        this.eiendom.ClickFasiliteterButton();
        this.eiendom.ClickEtasjeButton();
        // System.out.println("før jeg klikker soverombutton");
        // this.eiendom.ClickSoveromButton();
        // jeg får ikke denne knappen til å fungere, jeg gir opp
        

    }


    
}
