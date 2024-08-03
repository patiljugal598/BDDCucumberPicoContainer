package org.example.apis;

import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class APIRequest {

    public static Response post(String endPoint, Headers headers, HashMap<String, Object> formParams, Cookies cookies){
                return given(SpecBuilder.getRequestSpec()).headers(headers).formParams(formParams).cookies(cookies)
                        .when().post(endPoint).then().spec(SpecBuilder.getResponseSpec()).extract().response();
    }

    public static Response get(String endPoint, Cookies cookies){
        return given(SpecBuilder.getRequestSpec()).cookies(cookies)
                .when().get(endPoint).then().spec(SpecBuilder.getResponseSpec()).extract().response();
    }
}
