package org.example;

import org.junit.Test;

public class Assert {
    @Test
    public void test()
    {
        int a=18;
        int b=10;
        int result;
        result = 18 - 10;
        org.testng.Assert.assertEquals(result,88,"Abstraction result is not ok");
    }
}