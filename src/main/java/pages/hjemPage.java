package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.elementsHjemPage;


public class hjemPage {

    private elementsHjemPage elements;
    private WebDriver driver;

    public hjemPage(WebDriver driver) {
        this.driver = driver;
        elements = new elementsHjemPage(driver);
    }

    public void clickJegForstårButton() {
        this.driver.switchTo().frame(1);
        elements.jegForstårButton().click();
        this.driver.switchTo().defaultContent();

    }
    

    public void clickLoggInnButton() {
        elements.LoggInnButton().click();
    }


    public void clickReiseButton() {
        //this.driver.switchTo().defaultContent();
        elements.reiseButton().click();
    }


    public void clickEiendomButton() {
        elements.eiendomButton().click();
    }



}








    

