package org.example.tests.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETRequestNonBDDTestNG {


    @Test
    public void testGetAllBookingNegative()
    {

        //RequestSpecification r = RestAssured.given();
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking/-1").log().all();
        r.when().get();
        r.then().log().all().statusCode(404);
    }

    @Test
    public void testGetAllBookingNegative2()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking/abc").log().all();
        r.when().get();
        r.then().log().all().statusCode(404);
    }

    @Test
    public void testGetAllBookingNPositive()
    {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking/2593").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);
    }
}
