package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsReiseResultatPage {

     private static WebElement element = null;
    WebDriver driver = null;

    public elementsReiseResultatPage (WebDriver driver) {
        this.driver = driver;
    }


    public static By progressBarElement(WebDriver driver) {
        return By.xpath("//label[@for='stopoverFilter0']");
    }  


    public static WebElement direkteButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//label[@for='stopoverFilter0']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


     public static WebElement sliderTravelTimeStart(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//div[@aria-label='Utreise tidligst'][@role='slider']");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public static WebElement prisElement(WebDriver driver, int rowNumber, int columnNumber){
        return driver.findElement(By.xpath("//td[@data-row='"+rowNumber+"'][@data-col='"+columnNumber+"']"));
    }


    public static WebElement sliderAvreiseStart(WebDriver driver){
        return driver.findElement(By.xpath("//div[@aria-label='Utreise tidligst'][@role='slider']"));
    }


    public static WebElement sliderAvreiseSlutt(WebDriver driver){
        return driver.findElement(By.xpath("//div[@aria-label='Utreise senest'][@role='slider']"));
    }


    public static WebElement sliderReisetid(WebDriver driver){
        return driver.findElement(By.xpath("//div[@aria-label='Maks reisetid'][@role='slider']"));
    }


    public static WebElement lavpriskalenderButton(WebDriver driver) {
        return driver.findElement(By.cssSelector("button[data-testid='toggleLowfare']"));
    } 



    

   
}
