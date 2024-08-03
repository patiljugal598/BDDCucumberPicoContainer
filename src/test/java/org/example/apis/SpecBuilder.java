package org.example.apis;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.utils.ConfigLoader;

public class SpecBuilder {

    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder().setBaseUri(ConfigLoader.getInstance().getBaseURL())
                .log(LogDetail.ALL).build();
    }

    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().log(LogDetail.ALL).build();
    }
}
