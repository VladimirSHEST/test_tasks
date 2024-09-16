package task1.case1;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

@DisplayName(" Кейс 1 регистрация пользователя")
public class UserRegistration {
    //    private final String ;

    @DisplayName("успешная регистрация")
    @Test
    public void successfulRegistrationTest() {
        String requestBody = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

        Response response = given()
                .filter(new AllureRestAssured())
                .spec(RegistrationSpecs.successfulRegistrationRequestSpec())
                .body(requestBody)
                .when()
                .post("/register")
                .then()
                .spec(RegistrationSpecs.successfulRegistrationResponseSpec())
                .extract().response();

        System.out.println("Response: " + response.asString());
    }
    @DisplayName("неуспешная регистрация")
    @Test
    public void unSuccessUserReg(){
        String requestBody = "{\"email\": \"sydney@fife\"}";

        Response response = given()
                .filter(new AllureRestAssured())
                .spec(RegistrationSpecs.registrationWithoutPasswordRequestSpec())
                .body(requestBody)
                .when()
                .post("/register")
                .then()
                .spec(RegistrationSpecs.registrationWithoutPasswordResponseSpec())
                .extract().response();

        System.out.println("Response: " + response.asString());
    }
}
