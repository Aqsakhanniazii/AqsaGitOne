package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdClass {
    @Test(groups = {"imran"})
    public void test6(){

        System.out.println("Test 6 Executaed");
    }
    @BeforeMethod
    public void test7(){

        System.out.println("Test 7 Executaed");
    }
}
