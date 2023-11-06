package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.elementsHjemPage;
import elements.elementsReisePage;
import elements.elementsEiendomPage;

public class eiendomPage {
    
    private elementsEiendomPage elementsEiendom;
    private elementsHjemPage elementsHjem;
    private WebDriver driver;

    public eiendomPage(WebDriver driver) {
        this.driver = driver;
        elementsEiendom = new elementsEiendomPage(driver);
        elementsHjem = new elementsHjemPage(driver);
    }

    public void clickEiendomButton() {
        elementsHjem.eiendomButton().click();
    }

    public void ClickSøkEiendomButton() {
        elementsEiendom.SøkEiendomButton().click();
        elementsEiendom.SøkEiendomButton().sendKeys("Hybel");

        try {
            Thread.sleep(1000); // Sleep for 1 second (adjust as needed).
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        elementsEiendom.SøkEiendomButton().sendKeys(Keys.ENTER);

    }


    public void ClickOmrådeButton() {
        elementsEiendom.OmrådeButton().click();
    }


    public void ClickBygdøyFrogner() {
        elementsEiendom.OmrådeButtonBygdøyFrogner().click();
    }

    public void ClickUranienborgMajorstuen() {
        elementsEiendom.OmrådeButtonUranienborgMajorstuen().click();
    }


    public void ClickBoligtypeButton() {
        elementsEiendom.BoligtypeButton().click();
    }

   
    public void ClickFasiliteterButton() {
        elementsEiendom.FasiliteterButton().click();
    }


    public void ClickEtasjeButton() {
        elementsEiendom.EtasjeButton().click();
    }


    public void ClickSoveromButton() {
        elementsEiendom.SoveromButton().click();
        /*System.out.println("Skal trykke på soveromsknapp");
        WebElement element = driver.findElement(By.id("min_bedrooms_2"));
        if (element != null) {
            // Element found, proceed with actions
            elementsEiendom.SoveromButton().click();
            } else {
            // Handle the case where the element couldn't be found after retries
            System.out.println("Finner ikke soveromsbutton");
            }*/
        

        /* 
        try {
        System.out.println("Skal trykke på soveromsknapp");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By yourElementLocator = By.id("min_bedrooms_2");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(yourElementLocator));
        

        Actions actions = new Actions(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        actions.moveToElement(element).click().build().perform();
        
        System.out.println("Har trykket på soveromsbutton");
        } catch (Exception e) {
        // Handle the exception
        e.printStackTrace();
        */


        /* 
        Actions actions = new Actions(driver);
        // klarer ikke å få den til å skrive ut "har trykket på soveromsbutton"


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsEiendom.SoveromButton());
        actions.moveToElement(elementsEiendom.SoveromButton()).click().build().perform();
        System.out.println("Har trykket på soveromsbutton");
        */

    }


    public void ClickSøkefeltKartButton() {
        elementsEiendom.søkefeltKartButton().click();
        elementsEiendom.søkefeltKartButton().sendKeys("Oslo, Oslo");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementsEiendom.søkefeltKartButton().sendKeys(Keys.ARROW_DOWN);
        elementsEiendom.søkefeltKartButton().sendKeys(Keys.RETURN);
    }



}
