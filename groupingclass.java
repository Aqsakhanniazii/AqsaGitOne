package org.example;

import org.testng.annotations.Test;

public class groupingclass {
    @Test
    public void test18(){
        System.out.println("Test 18 Executaed");
    }
    @Test(groups = {"Aqsa"})
    public void test19(){
        System.out.println("Test 19 Executaed");
    }
    @Test(groups = {"Aqsa"})
    public void test20(){
        System.out.println("Test 20 Executaed");
    }
    @Test
    public void test21(){
        System.out.println("Test 21 Executaed");
    }
}
