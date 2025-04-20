package com.example.component_test_demo;

import dev.lydtech.component.framework.client.service.ServiceClient;
import dev.lydtech.component.framework.extension.ComponentTestExtension;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.Matchers.equalTo;

@ExtendWith(ComponentTestExtension.class)
public class MyComponentTestCT {
    @Test
    public void test() {
        RestAssured.baseURI = ServiceClient.getInstance().getBaseUrl();
        RestAssured.get("api/v1/hello").then().assertThat()
                .statusCode(200)
                .body(equalTo("Hello there"));
    }
}
