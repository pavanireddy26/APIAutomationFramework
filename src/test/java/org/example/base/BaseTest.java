package org.example.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.*;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.*;
import org.example.APIConstants;
import org.example.asserts.AssertActions;
import org.example.modules.PayloadManagers;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class BaseTest {

    //common to all testcase
    //Base Url,Content type -json -common


    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManagers payloadManagers;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validateResponse;

    @BeforeTest
    public void setUp() {
        //Base Uel ,content type - json
//
//        payloadManagers = new PayloadManagers();
//        assertActions = new AssertActions();
//        requestSpecification = RestAssured
//                .given().baseUri(APIConstants.BASE_URL)
//                .contentType(ContentType.JSON).log().all();
//
//

        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application")
                .build().log().all();
    }








}