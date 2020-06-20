package com.ignite.step_defs;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class SampleApi2 {


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

        String appNo="5908000133";
        Response response=
                given().body(body)
                        .header("Content-Type","application/json")
                        .header("X-App-Version","2.1.0")
                        .header("X-Client-Type","ISA")
                        .post("account/login")
                        .then().log().all().extract().response();

        String ASPXAUTH=response.getCookie(".ASPXAUTH");
        String CoolSIS_SessionId=response.getCookie("CoolSIS_SessionId");
        System.out.println("Session id = "+CoolSIS_SessionId+" "+"\nASPXAUTH ="+ASPXAUTH);

        String cookieHeader=".ASPXAUTH="+ ASPXAUTH
                +"; path=/; HttpOnly;CoolSIS_SessionId="+CoolSIS_SessionId+"; path=/; HttpOnly";

        Response applicationResponse=given()
                .header("Cookie",cookieHeader)
                .header("X-App-Version","2.1.0")
                .header("X-Client-Type","ISA")
                .get("academic/applications/"+appNo)
                .then().log().all().extract().response();

        String key="applicationsList";
        List<HashMap<String,String>> applicationList=applicationResponse.jsonPath().getList(key);

        HashMap<String, String> application=applicationList.get(0);

        System.out.println("Student first name = "+application.get("studentFirstName"));

    }
}
