package elements;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class elementsEiendomPage {

    private WebDriver driver; //added a driver field (private) to access it from other classes

    public elementsEiendomPage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement SøkEiendomButton() {
        WebElement element = this.driver.findElement(By.id("query-filter"));
        return element;
    }


    public WebElement OmrådeButton() {
        String labelToFind = "Oslo";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;

    }


    public WebElement OmrådeButtonBygdøyFrogner(){ 
        String labelToFind = "Bygdøy - Frogner";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement OmrådeButtonUranienborgMajorstuen() {
        String labelToFind = "Uranienborg - Majorstuen";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    
    public WebElement BoligtypeButton() {
        String labelToFind = "Leilighet";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement FasiliteterButton() {
        String labelToFind = "Balkong/Terrasse";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement EtasjeButton() {
        String labelToFind = "Ikke 1. etasje";
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//label[contains(text(), '" + labelToFind + "')]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement SoveromButton() {
        System.out.println("går inn i metode soveromButton");
        WebElement element = this.driver.findElement(By.xpath("//label[@for='min_bedrooms_2']"));
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);

        return element;

        // JEG FÅR IKKE DENNE TIL Å FUNGERE, SÅ JEG GIR OPP :(((((
        
        /*
        // WebElement element = driver.findElement(By.id("min_bedrooms_2"));
        System.out.println("finner elementet soveromsbutton");


        WebElement element = null;
        int attempts = 0;
        while (attempts < 3) {
            try {
                element = this.driver.findElement(By.id("min_bedrooms_2"));
                break;
            } catch (NoSuchElementException e) {
            // Element not found, wait and try again
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } // Adjust the wait time as needed
            }
            attempts++;
        }

       */


        /* 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        By yourElementLocator = By.id("min_bedrooms_2");
        //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(yourElementLocator));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(yourElementLocator));
        */


        // WITH SCROLL INTO VIEW
        /* 
        WebElement element = driver.findElement(By.id("min_bedrooms_2"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        */


        // vanlig wait med thread.sleep
        /* 
        //String labelToFind = "2+";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By yourElementLocator = By.id("min_bedrooms_2");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        */


        //return element;
        
    }



    // nå skal jeg prøve meg på kartet

    public WebElement søkefeltKartButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//*[@id='__next']/main/div/div[1]/div[3]/div[1]/div");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }



    /* 
     public WebElement KartButton() {
        WebElement element = this.driver.findElement(By.xpath("//*[@id='__next']/main/div/div[1]/finn-map"));
        return element;
    }
    */



}

    

