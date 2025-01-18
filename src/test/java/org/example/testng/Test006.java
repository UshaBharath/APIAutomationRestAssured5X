package org.example.testng;

import org.testng.annotations.Test;

public class Test006 {

    //Negative as first priority
    @Test(priority=1)
    public void t1()
    {
        System.out.println("1");
    }

    @Test(priority=-1)
    public void t2()
    {
        System.out.println("2");
    }

    @Test(priority=3)
    public void t3()
    {
        System.out.println("3");
    }
}
