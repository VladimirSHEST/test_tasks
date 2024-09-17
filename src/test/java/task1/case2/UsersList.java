package task1.case2;

import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static io.restassured.RestAssured.given;

@DisplayName("Получить список пользователей")
public class UsersList {

    @DisplayName("проверка на окончание @reqres.in")
    @Test
    public void checkAvatarAndIdTest() {
        List<UserData> users = given(Specs.requestSpecification)
                .filter(new AllureRestAssured())
                .when()
                .get("/users?page=2")
                .then()
                .extract().body().jsonPath()
                .getList("data", UserData.class);

        Assertions.assertTrue(users.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));
    }
}
