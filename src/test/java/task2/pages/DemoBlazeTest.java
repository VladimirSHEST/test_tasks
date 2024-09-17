package task2.pages;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;

@DisplayName("старт тестов")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoBlazeTest {

    @DisplayName("регистрация")
    @Test
    @org.junit.jupiter.api.Order(1)
    public void registration() {
        open("https://www.demoblaze.com/");
        SignUp signUp = new SignUp();
        signUp.singUp();
    }

    @DisplayName("авторизация")
    @Test
    @org.junit.jupiter.api.Order(2)
    public void logIn() {
        open("https://www.demoblaze.com/");
        LoginPage loginPage = new LoginPage();
        loginPage.logIn();

    }

    @DisplayName("добавление в корзину товаров")
    @Test
    @org.junit.jupiter.api.Order(3)
    public void add() {
        open("https://www.demoblaze.com/");
        CartPage cartPage = new CartPage();
        cartPage.addToCart();
    }
}
