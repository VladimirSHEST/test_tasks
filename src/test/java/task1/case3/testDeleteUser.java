package task1.case3;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


public class testDeleteUser {
    @Test
    public void testDeleteUser() {
        Response response = given()
                .filter(new AllureRestAssured())
                .spec(UserSpecs.deleteUserRequestSpec())
                .when()
                .delete("/users/2")
                .then()
                .spec(UserSpecs.deleteUserResponseSpec())
                .extract().response();

        System.out.println("Response: " + response.asString());
    }
}
