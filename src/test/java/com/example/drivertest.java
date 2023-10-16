package com.example;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



 
public class drivertest {
    WebDriver driver;
    @Test
    public void test() {

        // 0. Set path to and set up chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vquach\\projects\\FinnTraining\\libs\\chromedriver117.exe");
        

        // 1. Set up ChromeOptions and add the "incognito" argument to open an incognito window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");


        // 2. Initialize the webdriver, and open in full screen
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        // 3. Navigate to webpage and assert the page title
        driver.get("https://www.finn.no");
        Assert.assertEquals("FINN.no - mulighetenes marked", driver.getTitle());


        // 4. Navigate to frame where the "jegForstårButton" exists (the second frame in this web page with index 1)
        driver.switchTo().frame(1);


        // 5. Click on "jegForstårButton"
        WebElement jegForstårButton = driver.findElement(By.xpath("//button[@title=\"Jeg forstår\"]\r\n"));
        jegForstårButton.click();


        // 6. Switch back to main content
        driver.switchTo().defaultContent();


        // 7. Click on Log in
        WebElement element = driver.findElement(By.xpath("//*[@id=\"frontpage-content\"]/finn-topbar")).getShadowRoot().findElement(By.cssSelector("header > nav > a:nth-child(5)"));
        element.click();


        // 8. Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // 10 seconds timeout
        By yourElementLocator = By.id("username"); 
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));


        // 9. Now, you can interact with the element
        username.sendKeys("ingvild.svendsen@expleogroup.com");
        password.sendKeys("Expleo123");


        // 10. Click log in
        driver.findElement(By.xpath("//*[@id=\"ActionButton_0\"]")).click();


        // 11. Click on Reise
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        By yourElementLocator2 = By.id("reise"); 
        WebElement reiseElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Reise")));
        reiseElement.click();


        // 12. Type in Oslo
        WebElement FlyFra = driver.findElement(By.xpath("//*[@id=\"origin-roundtrip\"]"));
        FlyFra.sendKeys("Oslo lufthavn Gardermoen");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FlyFra.sendKeys(Keys.RETURN);


        // 13. Type in Barcelona
        WebElement FlyTil = driver.findElement(By.xpath("//*[@id=\"destination-roundtrip\"]"));
        FlyTil.sendKeys("Barcelona");

         try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        FlyTil.sendKeys(Keys.RETURN);


        // 14. Choose dates departure and return
        WebElement datoUtreise = driver.findElement(By.xpath("//*[@id=\"date-roundtrip-outbound\"]"));
        datoUtreise.click();
        // Press arrow next month
        driver.findElement(By.xpath("//button[@class='button button--pill button--small absolute right-10 top-4']")).click();
        // Choose dates for departure and return
        driver.findElement(By.xpath("//td[@aria-label='onsdag 8. november 2023']")).click();
        driver.findElement(By.xpath("//td[@aria-label='torsdag 16. november 2023']")).click();


        // 15. Unclick on Hotell and click Search
        driver.findElement(By.xpath("//label[@for='openHotelSearch']")).click();
        driver.findElement(By.xpath("//button[@data-testid='flightSearchButton']")).click();


        // 16. Choose direct flight
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        WebElement radioButtonDirekte = driver.findElement(By.xpath("//label[@for='stopoverFilter0']"));
        radioButtonDirekte.click();

       
        // 17. Choose times for departure and return (SLIDER)


        //AVGANG UTREISE
         try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

          // Choose tider (beginning of interval)
          String desiredTravelTimeStart = "06:00";
          String desiredTravelTimeStop = "12:00";
          WebElement sliderTravelTimeStart = driver.findElement(By.xpath("//div[@aria-label='Utreise tidligst'][@role='slider']"));
          String currentTimeStart = sliderTravelTimeStart.getAttribute("aria-valuetext").split(" ")[1];
          sliderTravelTimeStart.click();
  
          //Assert.assertEquals(desiredTravelTimeStart, currentTimeStart);
          while (!desiredTravelTimeStart.equals(currentTimeStart)){
              System.out.println("Desired travel time start:" + desiredTravelTimeStart + "." + "\nCurrent time start:" + currentTimeStart  + ".");
              sliderTravelTimeStart.sendKeys(Keys.ARROW_RIGHT);
              currentTimeStart = sliderTravelTimeStart.getAttribute("aria-valuetext").split(" ")[1];
          }
  
          // Choose tider (end of interval)
          WebElement sliderTravelTimeStop = driver.findElement(By.xpath("//div[@aria-label='Utreise senest'][@role='slider']"));
          String currentTimeStop = sliderTravelTimeStop.getAttribute("aria-valuetext").split(" ")[1];
          sliderTravelTimeStop.click();
          while (!desiredTravelTimeStop.equals(currentTimeStop)){
              sliderTravelTimeStop.sendKeys(Keys.ARROW_LEFT);
              currentTimeStop = sliderTravelTimeStop.getAttribute("aria-valuetext").split(" ")[1];
          }

          System.out.println("Desired travel time start " + desiredTravelTimeStart + "\n current time start " + currentTimeStart);
          System.out.println("Desired travel time stop " + desiredTravelTimeStop + "\n current time stop " + currentTimeStop);


        // 18. Choose maksimum travel time

        // Choose desired maximum travel time and slide until the desired time is reached
        int desiredTravelTime = 8;
        // Locate the slider element for maximum travel time
        WebElement sliderTravelTime = driver.findElement(By.xpath("//div[@aria-label='Maks reisetid'][@role='slider']"));
        // Get the current maximum travel time from the slider's aria-valuetext attribute
        String maxTravelTime = sliderTravelTime.getAttribute("aria-valuetext");
        // Convert the maximum travel time from String to an integer (skille der det står mellomrom, og 0 er det første elementet etter mellomrommet)
        int TravelTime = Integer.parseInt(maxTravelTime.split(" ")[0]);
        // Move the slider left until the desired travel time is reached
        for (int i = 0; i < (TravelTime - desiredTravelTime); i++ ){
            sliderTravelTime.sendKeys(Keys.ARROW_LEFT);
        }
        // Check that the slider has the desired value
        String aria_valuetext = sliderTravelTime.getAttribute("aria-valuetext");
        Assert.assertEquals(desiredTravelTime, Integer.parseInt(aria_valuetext.split(" ")[0]));

        System.out.println("AriaValueText = "+ aria_valuetext);



        // 19. Run excel

          // Open low price calendar and save results in Excel document

        // Define the row and column numbers in the Excel sheet
        int rowNumber = 5;
        int columnNumber = 5;

        try {
            // Pause the execution for 2000 milliseconds (2 seconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Print the stack trace if the sleep is interrupted
            e.printStackTrace();
        }

        // Find the "toggleLowfare" button using its CSS selector
        WebElement toggleLowfareButton = driver.findElement(By.cssSelector("button[data-testid='toggleLowfare']"));

        // Click the "toggleLowfare" button using JavaScript Executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", toggleLowfareButton);

        // Find the element specified by the XPath to get text data
        String data = driver.findElement(By.xpath("//td[@data-row='"+rowNumber+"'][@data-col='"+columnNumber+"']")).getText();

        // Saving one value in Excel file
        try {
            // Specify the path to the Excel file and the sheet name
            String ExcelPath = "C:\\Users\\vquach\\projects\\FinnTraining\\travelResults.xlsx";
            String sheetName = "results";

            // Open the Excel file using FileInputStream
            FileInputStream file = new FileInputStream(new File(ExcelPath));

            // Create a new instance of XSSFWorkbook representing the Excel workbook
            XSSFWorkbook wb = new XSSFWorkbook(file);

            // Get the sheet with the specified name from the workbook
            XSSFSheet sheet = wb.getSheet(sheetName);

            // Get the row at the specified row number from the sheet
            XSSFRow row = sheet.getRow(rowNumber);

            // Get the cell at the specified column number from the row, with handling for null cells
            XSSFCell cell = row.getCell(columnNumber, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);

            // Check if the cell is null
            if (cell == null) {
                // If the cell is null, create a new cell and set its value to 'data'
                cell = row.createCell(columnNumber);
                cell.setCellValue(data);
            } else {
                // If the cell exists, set its value to 'data'
                cell.setCellValue(data);
            }

            // Open an output stream to write the changes back to the Excel file
            FileOutputStream outFile = new FileOutputStream(new File(ExcelPath));

            // Write the changes to the output stream
            wb.write(outFile);

            // Close the output stream
            outFile.close();

            // Close the workbook
            wb.close();

            // Close the input stream for the Excel file
            file.close();

        } catch (IOException io) {
            // Handle IOException (e.g., print the stack trace)
            io.printStackTrace();
        }


    }
 
    @After
    public void afterTest() {

    

        //driver.quit();
    }
}