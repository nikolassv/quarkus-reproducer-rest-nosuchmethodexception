package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"message\":\"this is my message\"}")
          .when().post("/hello")
          .then()
             .statusCode(200)
             .body(is("this is my message"));
    }

}