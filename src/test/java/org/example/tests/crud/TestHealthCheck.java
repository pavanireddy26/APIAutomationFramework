package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.example.APIConstants;
import org.example.base.BaseTest;
import org.testng.annotations.Test;

public class TestHealthCheck extends BaseTest {



    @Test(groups = "reg", priority = 1)
    @Owner("Pavani")
    @Description("TC#3 - Veify Health")
    public void testCreateBookingPOST(){
        requestSpecification.basePath(APIConstants.PING_URL);
        response = RestAssured.given(requestSpecification)
                .when()
                .get();
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);

    }















}
