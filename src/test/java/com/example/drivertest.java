package com.example;
 
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class drivertest {
    WebDriver driver;
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vquach\\projects\\FinnTraining\\libs\\chromedriver117.exe");
        driver = new ChromeDriver();
        driver.get("https://www.finn.no");
        Assert.assertEquals("FINN.no - mulighetenes marked", driver.getTitle());
        driver.findElement(By.cssSelector("header > nav > a:nth-child(5)"));
        driver.findElement(By.id("username")).sendKeys("ingvild.svendsen@expleogroup.com");
        driver.findElement(By.id("password")).sendKeys("Expleo123");
    }
 
    @After
    public void afterTest() {
        driver.quit();
    }
}