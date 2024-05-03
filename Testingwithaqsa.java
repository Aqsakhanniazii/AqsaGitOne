package org.example;

import org.testng.annotations.Test;

public class Testingwithaqsa {
    @Test(priority = 4)
    public void test1(){
        System.out.println("Test 1 Executaed");
    }
    @Test(priority = 0 )
    public void test22(){
        System.out.println("Test 22 Executaed");
    }
    @Test(priority =3 )
    public void test23(){
        System.out.println("Test 23 Executaed");
    }
    @Test(priority =1 )
    public void test24(){
        System.out.println("Test 24 Executaed");
    }
}
