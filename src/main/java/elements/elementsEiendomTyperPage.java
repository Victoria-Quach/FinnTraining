package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsEiendomTyperPage {
    
    private WebDriver driver; //added a driver field (private) to access it from other classes

    public elementsEiendomTyperPage(WebDriver driver){
        this.driver = driver;
    }


     public WebElement boligTilSalgsButton() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        By yourElementLocator = By.cssSelector("a[href='https://www.finn.no/realestate/homes/search.html?filters='][data-category='Bolig til salgs']");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

}
