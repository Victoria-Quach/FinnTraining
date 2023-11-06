package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverFactory {

    private static WebDriver driver;

    public static WebDriver open(String windowType){
        if (driver == null) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vquach\\projects\\FinnTraining\\libs\\chromedriver118.exe");

        if (windowType.equals("incognito")) {
                ChromeOptions option = new ChromeOptions();
                option.addArguments("incognito");
                driver = new ChromeDriver(option);
            } else {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }
}