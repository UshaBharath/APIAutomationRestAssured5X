package org.example.tests.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylePOST {

    @Test
    public void testBDDStylePOSTPositive()
    {    //Preparation

        //For POST request:
        //URL
        //Body/Payload - JSON
        //Header - Content Type

        RequestSpecification r = RestAssured.given();

        String payload = "{\n" +
                           "    \"username\": \"admin\", \n" +
                           "     \"password\": \"password123\"\n" +
                           "}";

                r.baseUri("https://restful-booker.herokuapp.com/");
                r.basePath("/auth");
                r.contentType(ContentType.JSON);
                r.body(payload);

                //making request
                Response response = r.when().post();

                //validation part
                ValidatableResponse validatableResponse = response.then();
                String responseString = response.asString();
                System.out.println(responseString);

                validatableResponse.statusCode(200);


    }
}
