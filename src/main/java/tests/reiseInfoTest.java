package tests;


import org.openqa.selenium.WebDriver;

import pages.hjemPage;
import pages.reisePage;


public class reiseInfoTest extends loggInnTest{

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        reiseInfoTest.driver = driver;
    }
    

    public static void performReiseTest() {
        //loggInnTest.setUp();
        //loggInnTest.performLogin();

        hjemPage.clickReiseButton(driver);

        reisePage.typeFlyFra(driver);
        reisePage.typeFlyTil(driver);
        reisePage.ClickDatoUtreiseFelt(driver);
        reisePage.ClickNesteMånedButton(driver);
        reisePage.ClickUtreiseDato(driver);
        reisePage.ClickHjemreiseDato(driver);
        reisePage.ClickHotellButton(driver);
        reisePage.ClickSøkFlyButton(driver);


        //loggInnTest.tearDown();
    }

    
}
