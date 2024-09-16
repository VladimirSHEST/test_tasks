package task1.case3;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class UserSpecs {
    public static RequestSpecification deleteUserRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/api")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification deleteUserResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(204)
                .build();
    }
}
