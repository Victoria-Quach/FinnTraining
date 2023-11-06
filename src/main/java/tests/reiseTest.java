package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.hjemPage;
import pages.loggInnPage;
import pages.reisePage;
import pages.reiseResultatPage;
import utilities.driverFactory;


public class reiseTest {

    private WebDriver driver;
    private hjemPage hjem;
    private reisePage reise;
    private reiseResultatPage reiseResultat;


    @Before
    public void setUp() {
        this.driver = driverFactory.open("incognito");
        this.driver.get("https://www.finn.no/");
        driver.manage().window().maximize();
        this.hjem = new hjemPage(driver);
        //this.hjem.clickJegForstårButton();
        this.hjem.clickReiseButton();
        // // Now that hjemPage and loggInnPage are initialized, construct reisePage
        this.reise = new reisePage(driver);
        this.reiseResultat = new reiseResultatPage(driver);
    }


    @Test
    public void performReiseTest() {  

        this.reise.typeFlyFra();
        this.reise.typeFlyTil();
        this.reise.ClickDatoUtreiseFelt();
        this.reise.ClickNesteMånedButton();
        this.reise.ClickUtreiseDato();
        this.reise.ClickHjemreiseDato();
        this.reise.ClickHotellButton();
        this.reise.ClickSøkFlyButton();

        this.reiseResultat.waitForProgressBarElement();
        this.reiseResultat.ClickDirekte();
        this.reiseResultat.ClickLavpriskalenderButton();
        this.reiseResultat.hentPriser("C:\\Users\\vquach\\projects\\FinnTraining\\travelResults.xlsx", "results");
        this.reiseResultat.endreAvreiseStart();
        this.reiseResultat.endreAvreiseSlutt();
        this.reiseResultat.endreReisetid();
    }


    @After
    public void tearDown() {
    driver.quit();
    }


}
