package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementsLoggInnPage {
    WebDriver driver;

    public elementsLoggInnPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement username() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        By yourElementLocator = By.id("username");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

    public WebElement password() {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        By yourElementLocator = By.id("password");
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(yourElementLocator));
        return element;
    }

    public WebElement LoggPåButton() {
        WebElement element = this.driver.findElement(By.xpath("//*[@id=\"ActionButton_0\"]"));
        return element;
    }
    
}
