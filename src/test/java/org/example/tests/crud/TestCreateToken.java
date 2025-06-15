package org.example.tests.crud;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.APIConstants;
import org.example.base.BaseTest;
import org.example.pojos.Auth;
import org.example.pojos.BookingResponse;
import org.example.pojos.TokenResponse;
import org.testng.annotations.Test;
import sun.security.timestamp.TSResponse;

public class TestCreateToken extends BaseTest {




    @Test(groups = "reg", priority = 1)
    @Owner("Pavani")
    @Description("TC#2 - Create token and verify")
    public void testCreateBookingPOST(){
        requestSpecification.basePath(APIConstants.Auth_URL);
    response = RestAssured.given(requestSpecification)
            .when().body(PayloadManager.setAuthPatload())
            .post();
       validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
   String  token = payloadManagers.getTokenFromJSON(response.asString());
        assertActions.verifyStringKeyNotNull(token);


}


    public String setAuthload(){
       Auth auth = new Auth();
       auth.setUsername("admin");
       auth.setPassword("password123");
        gson = new Gson();

        String jsonPayloadString =gson.toJson(auth);
        System.out.println("pay;oad set to the -> " +jsonPayloadString);
        return jsonPayloadString;


    }

    //JSON to Java

    public String getTokenfromJSON(String tokenResponse){
        gson = new Gson();
        TokenResponse tokenResponse1 =gson.fromJson(tokenResponse,TokenResponse.class)
        return tokenResponse1.getToken();
    }



}
