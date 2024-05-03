package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    @Test
    public void test2(){

        System.out.println("Test 2 Executaed");
    }
    @AfterTest
    public void test3(){

        System.out.println("Test 3 Executaed");
    }
    @BeforeTest
    public void test4(){

        System.out.println("Test 4 Executaed");
    }
    @Test
    public void test5(){

        System.out.println("Test 5 Executaed");
    }

}

