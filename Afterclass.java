package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Afterclass {
    @Test(groups = {"Khan"})
    public void test8()
    {
        System.out.println("Test 8 Executaed");
    }
    @Test(groups = {"Khan"})
    public void test9()
    {
        System.out.println("Test 9 Executaed");
    }
    @AfterMethod
    public void test10()
    {
        System.out.println("Test `10` Executaed");
    }
@Test(groups = {"niazi"})
    public void test13()
    {
        System.out.println("Test 13 Executaed");
    }
}

