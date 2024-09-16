package task1.case2;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;

public class Specs {
public static RequestSpecification requestSpecification = with()
        .baseUri("https://reqres.in/")
            .basePath("api")
            .contentType(ContentType.JSON);
}
