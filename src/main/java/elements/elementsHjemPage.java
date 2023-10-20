package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class elementsHjemPage {

    private static WebElement element = null;
    WebDriver driver = null;

    public elementsHjemPage (WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement jegForstårButton(WebDriver driver) {
        //driver.switchTo().frame(1);
        element = driver.findElement(By.xpath("//button[@title=\"Jeg forstår\"]\r\n"));
        //driver.switchTo().defaultContent();
        return element;
    }

    public static WebElement LoggInnButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"frontpage-content\"]/finn-topbar")).getShadowRoot().findElement(By.cssSelector("header > nav > a:nth-child(5)"));
        return element;
    }

    
    public static WebElement reiseButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By yourElementLocator = By.xpath("//a[@href='/reise']"); 
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

   
    public static WebElement eiendomButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id='frontpage-content']/main/div[3]/div[1]/nav/div[2]");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


}
