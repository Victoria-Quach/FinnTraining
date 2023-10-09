package com.example;
 
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class drivertest {
    WebDriver driver;
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\isvendsen\\Documents\\Selenium\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.finn.no");
        Assert.assertEquals("FINN.no - mulighetenes marked", driver.getTitle());
    }
 
    @After
    public void afterTest() {
        driver.quit();
    }
}