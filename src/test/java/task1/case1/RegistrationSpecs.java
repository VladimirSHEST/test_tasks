package task1.case1;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;

public class RegistrationSpecs {
    public static RequestSpecification successfulRegistrationRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/api")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification successfulRegistrationResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("id", equalTo(4))
                .expectBody("token", equalTo("QpwL5tke4Pnpja7X4"))
                .build();
    }

    public static RequestSpecification registrationWithoutPasswordRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/api")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification registrationWithoutPasswordResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectBody("error", equalTo("Missing password"))
                .build();
    }
}
