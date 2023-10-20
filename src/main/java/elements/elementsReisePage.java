package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsReisePage {

    private static WebElement element = null;
    WebDriver driver = null;

    public elementsReisePage (WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement FlyFra(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id=\"origin-roundtrip\"]");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public static WebElement FlyTil(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id=\"destination-roundtrip\"]");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public static WebElement datoUtreiseFelt(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"date-roundtrip-outbound\"]"));
        return element;
    }


    public static WebElement NesteMånedButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@class='button button--pill button--small absolute right-10 top-4']"));
        return element;
    }


    public static WebElement UtreiseDato(WebDriver driver) {
        element = driver.findElement(By.xpath("//td[@aria-label='lørdag 18. november 2023']"));
        return element;
    }


    public static WebElement HjemreiseDato(WebDriver driver) {
        element = driver.findElement(By.xpath("//td[@aria-label='fredag 24. november 2023']"));
        return element;
    }

   
    public static WebElement HotellButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[@for='openHotelSearch']"));
        return element;
    }


    public static WebElement SøkFlyButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@data-testid='flightSearchButton']"));
        return element;
    }

    
}
