package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsReisePage {

    WebDriver driver;

    public elementsReisePage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement FlyFra() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id=\"origin-roundtrip\"]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement FlyTil() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        By yourElementLocator = By.xpath("//*[@id=\"destination-roundtrip\"]");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }


    public WebElement datoUtreiseFelt() {
        WebElement element = this.driver.findElement(By.xpath("//*[@id=\"date-roundtrip-outbound\"]"));
        return element;
    }


    public WebElement NesteMånedButton() {
        WebElement element = this.driver.findElement(By.xpath("//button[@class='button button--pill button--small absolute right-10 top-4']"));
        return element;
    }


    public WebElement UtreiseDato() {
        WebElement element = this.driver.findElement(By.xpath("//td[@aria-label='søndag 19. november 2023']"));
        return element;
    }


    public WebElement HjemreiseDato() {
        WebElement element = this.driver.findElement(By.xpath("//td[@aria-label='fredag 24. november 2023']"));
        return element;
    }

   
    public WebElement HotellButton() {
        WebElement element = this.driver.findElement(By.xpath("//label[@for='openHotelSearch']"));
        return element;
    }


    public WebElement SøkFlyButton() {
        WebElement element = this.driver.findElement(By.xpath("//button[@data-testid='flightSearchButton']"));
        return element;
    }

    
}
