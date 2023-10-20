package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsLoggInnPage {

    private static WebElement element = null;
    WebDriver driver = null;

    public elementsLoggInnPage (WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement username(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By yourElementLocator = By.id("username");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

    public static WebElement password(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By yourElementLocator = By.id("password");
        element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

    public static WebElement LoggPåButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"ActionButton_0\"]"));
        return element;
    }
    
}
