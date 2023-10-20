package com.example;

import tests.loggInnTest;
import tests.reiseInfoTest;
import tests.reiseResultatTest;


public class App {

    public static void main(String[] args) {

        loggInnTest.setUp();
        loggInnTest.performLogin();
        //loggInnTest.tearDown();
        reiseInfoTest.performReiseTest();
        reiseResultatTest.performReiseResultatTest();
    }
    
}
