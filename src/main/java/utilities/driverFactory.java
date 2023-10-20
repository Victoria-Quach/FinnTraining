package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverFactory {

    public static WebDriver getChromeDriver() {
        
        // 0. Set path to and set up chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vquach\\projects\\FinnTraining\\libs\\chromedriver117.exe");
    
        // Specify whether to open in incognito mode or not
        boolean isIncognito = false;

        // Initialize ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Check if incognito mode is not requested
        if (!isIncognito) {
            // If not incognito, add the argument to start in incognito mode
            options.addArguments("--incognito");
        }

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.finn.no/");
  
        return driver; // Add this line to return the WebDriver instance

    }
}