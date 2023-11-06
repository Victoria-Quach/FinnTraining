package com.example;


import org.openqa.selenium.WebDriver;

import tests.eiendomsTest;
import tests.loggInnTest;
import tests.reiseTest;


public class App {

    public static void main(String[] args) {

        //LOGG INN
        //loggInnTest loggInn = new loggInnTest();
        //loggInn.performLoggInn();


        //REISETEST
        // We create an instance of reiseTest by passing the driver in the constructor.
        
        // reiseTest nyReiseTest = new reiseTest();
        // nyReiseTest.setUp();
        // nyReiseTest.performReiseTest();
        // nyReiseTest.tearDown();


        // EIENDOMSTEST

        eiendomsTest nyEiendomsTest = new eiendomsTest();
        nyEiendomsTest.setUp();
        nyEiendomsTest.performEiendomTest();

        


    }
    
}
