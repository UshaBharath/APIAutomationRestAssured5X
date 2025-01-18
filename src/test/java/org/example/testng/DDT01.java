package org.example.testng;

import org.testng.annotations.Test;

public class DDT01 {

    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void testLoginData(String username, String password)
    {
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);
    }
}
