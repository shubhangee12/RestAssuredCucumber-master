package com.companyname.projectname.utilities;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.response.Response;

public class RestAssuredUtil {

    public static Response sendGETRequest(String host, String path, Map<String,String> headers){

       return  given().baseUri(host).basePath(path).headers(headers).get().then().extract().response();
    }
}
