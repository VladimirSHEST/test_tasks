package task2.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import task2.pages.*;

import static com.codeborne.selenide.Selenide.*;

@DisplayName("Задание 2")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoBlazeTest {

    @DisplayName("регистрация")
    @Test
    @org.junit.jupiter.api.Order(1)
    public void registration() {
        open("https://www.demoblaze.com/");
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.singUp();
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

    @DisplayName("сравнение цены в карточке и в корзине")
    @Test
    @org.junit.jupiter.api.Order(4)
    public void comparisonPrice() {
        PrisePage prisePage = new PrisePage();
        prisePage.comparisonPriceCart();
    }

    @DisplayName("подсчёт общей цены в корзине")
    @Test
    @org.junit.jupiter.api.Order(5)
    public void totalPrise() {
        PrisePage prisePage = new PrisePage();
        prisePage.sumPrise();

    }

    @DisplayName("Оформляем заказ и проверяем дату в заказе")
    @Test
    @org.junit.jupiter.api.Order(6)
    public void makePurchase() {
        OrderPage orderPage = new OrderPage();
        orderPage.PlaceOrder();

    }

}
