package org.example.testng;

import org.testng.annotations.Test;

public class TestNG011 {

    @Test(groups = {"init"})
    public void serverStartedOk()
    {
        System.out.println("serverStartedOk");
    }

    @Test(groups = {"init"})
    public void initEnvironment()
    {
        System.out.println("initEnvironments");
    }

    @Test(dependsOnGroups = {"init.*"})
    public void method1()
    {
        System.out.println("Now i will run");
    }
}
