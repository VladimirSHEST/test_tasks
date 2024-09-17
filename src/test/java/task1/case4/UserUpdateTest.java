package task1.case4;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@DisplayName("Обновляем информацию о пользователе и сравниваем дату обновления с текущей датой в системе")
public class UserUpdateTest {

    @Test
    public void testUpdateUserAndCompareDates() {
        String requestBody = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

        Response response = given()
                .filter(new AllureRestAssured())
                .spec(UserSpecs.updateUserRequestSpec())
                .body(requestBody)
                .when()
                .patch("/users/2")
                .then()
                .spec(UserSpecs.upDateUserResponseSpec())
                .extract().response();

        String updatedAt = response.jsonPath().getString("updatedAt");
        LocalDateTime updatedAtDateTime = LocalDateTime.parse(updatedAt, DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Сравниваем даты с точностью до секунды
        assertEquals(currentDateTime.getYear(), updatedAtDateTime.getYear(), "в системе другой год");
        assertEquals(currentDateTime.getMonth(), updatedAtDateTime.getMonth(), "в системе другой месяц");
        assertEquals(currentDateTime.getDayOfMonth(), updatedAtDateTime.getDayOfMonth(), "в системе другой год");
        assertEquals(currentDateTime.getHour(), updatedAtDateTime.getHour(), "в системе другой час");
        assertEquals(currentDateTime.getMinute(), updatedAtDateTime.getMinute(), "в системе другие минуты");
//
    }

}
