package org.example.tests.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOST {

    @Test
    public void testBDDStylePOSTPositive()
    {
        //For POST request:
        //URL
        //Body/Payload - JSON
        //Header - Content Type

        String payload = "{\n" +
                "    \"username\": \"admin\", \n" +
                "     \"password\": \"password123\"\n" +
                "}";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload).when().post().then().log().all().statusCode(200);
    }
}
