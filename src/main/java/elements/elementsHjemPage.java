package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class elementsHjemPage {

    private WebDriver driver; //added a driver field (private) to access it from other classes

    public elementsHjemPage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement jegForstårButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//button[@title=\"Jeg forstår\"]\r\n");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

    public WebElement LoggInnButton() {
        WebElement element = this.driver.findElement(By.xpath("//*[@id=\"frontpage-content\"]/finn-topbar")).getShadowRoot().findElement(By.cssSelector("header > nav > a:nth-child(5)"));
        return element;
    }

    
    public WebElement reiseButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//a[@href='/reise']"); 
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

   
    public WebElement eiendomButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id='frontpage-content']/main/div[3]/div[1]/nav/div[2]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


}
