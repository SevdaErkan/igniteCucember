package com.ignite.step_defs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SampleAPI {

    @BeforeClass
    public static void setup(){
        RestAssured.baseURI="https://ignite.sis.cool/api/";

    }
    @Test
    public void loginCall(){
        String body="{\n" +
                "\t\"username\":\"serkan\",\n" +
                "\t\"password\":\"S123456E\"\n" +
                "}";
        Response response=
                given().body(body)
                .headers("Content-Type","application/json")
                .headers("X-App-Version","2.1.0")
                .headers("X-Client-Type","ISA")
                .post("account/login")
                .then().log().all().extract().response();

    }
}
