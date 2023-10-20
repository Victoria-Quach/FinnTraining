package tests;


import org.openqa.selenium.WebDriver;


import pages.reiseResultatPage;


public class reiseResultatTest {

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        reiseResultatTest.driver = driver;
    }


    public static void performReiseResultatTest() {

        reiseResultatPage.waitForProgressBarElement(driver);
        reiseResultatPage.ClickDirekte(driver);
        reiseResultatPage.hentPriser(driver, "C:\\Users\\vquach\\projects\\FinnTraining\\travelResults.xlsx", "results");
        reiseResultatPage.endreAvreiseStart(driver);
        reiseResultatPage.endreAvreiseSlutt(driver);
        reiseResultatPage.endreReisetid(driver);
        reiseResultatPage.ClickLavpriskalenderButton(driver);

    }
    
    
}
