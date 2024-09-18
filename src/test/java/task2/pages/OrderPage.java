package task2.pages;

import com.codeborne.selenide.SelenideElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderPage {

    private final SelenideElement buttonPlaceOrder = $x("//*[@id='page-wrapper']/div/div[2]/button");
    private final SelenideElement nameField = $x("//input[@id='name']");
    private final SelenideElement countryField = $x("//input[@id='country']");
    private final SelenideElement cityField = $x("//input[@id='city']");
    private final SelenideElement cardField = $x("//input[@id='card']");
    private final SelenideElement monthField = $x("//input[@id='month']");
    private final SelenideElement yearField = $x("//input[@id='year']");
    private final SelenideElement purchaseButton = $x("//button[contains(text(),'Purchase')]");
    private final SelenideElement dateElement = $x("/html/body/div[13]/p");

    public void PlaceOrder() {

        open("https://www.demoblaze.com/cart.html");
        buttonPlaceOrder.click();
        nameField.setValue("name1");
        countryField.setValue("country1");
        cityField.setValue("city1");
        cardField.setValue("card1");
        monthField.setValue("month");
        yearField.setValue("year");
        purchaseButton.click();

        dateElement.shouldBe(visible);
        String dateText = dateElement.getText();
        System.out.println(dateText);
        Pattern pattern = Pattern.compile("\\b\\d{2}/\\d{1}/\\d{4}\\b");
        Matcher matcher = pattern.matcher(dateText);

        String dateString = null;
        if (matcher.find()) {
            dateString = matcher.group();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date currentDate = new Date();

        assertEquals(currentDate, parsedDate, "дата не соответствует текущей ");

    }
}

