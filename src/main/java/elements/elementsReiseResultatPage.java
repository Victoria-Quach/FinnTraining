package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsReiseResultatPage {
    WebDriver driver;

    public elementsReiseResultatPage (WebDriver driver) {
        this.driver = driver;
    }


    public By progressBarElement() {
        return By.xpath("//div[@role='progressbar']");
    }  


    public WebElement direkteButton() {
        return this.driver.findElement(By.xpath("//label[@for='stopoverFilter0']"));
    }


    public WebElement lavpriskalenderButton() {
        return this.driver.findElement(By.xpath("//button[@data-testid='toggleLowfare']"));
    }


    public WebElement sliderTravelTimeStart() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//div[@aria-label='Utreise tidligst'][@role='slider']");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement prisElement(int rowNumber, int columnNumber){
        return this.driver.findElement(By.xpath("//td[@data-row='"+rowNumber+"'][@data-col='"+columnNumber+"']"));
    }


    public WebElement sliderAvreiseStart(){
        return this.driver.findElement(By.xpath("//div[@aria-label='Utreise tidligst'][@role='slider']"));
    }


    public WebElement sliderAvreiseSlutt(){
        return this.driver.findElement(By.xpath("//div[@aria-label='Utreise senest'][@role='slider']"));
    }


    public WebElement sliderReisetid(){
        return this.driver.findElement(By.xpath("//div[@aria-label='Maks reisetid'][@role='slider']"));
    }


  



    

   
}
