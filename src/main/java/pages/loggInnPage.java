package pages;


import org.openqa.selenium.WebDriver;


import elements.elementsLoggInnPage;


public class loggInnPage {

    private elementsLoggInnPage elements;
    private WebDriver driver;

    public loggInnPage(WebDriver driver) {
        this.driver = driver;
        elements = new elementsLoggInnPage(driver);
    }

    public void typeUsername() {
        elements.username().sendKeys("ingvild.svendsen@expleogroup.com");
    }
    
    public void typePassword() {
        elements.password().sendKeys("Expleo123");
    }

    public void clickLoggPåButton() {
        elements.LoggPåButton().click();
    }

}



    

