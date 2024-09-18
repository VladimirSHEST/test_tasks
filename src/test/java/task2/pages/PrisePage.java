package task2.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrisePage {

    private final SelenideElement priseSamsungGalaxyS6 = $x("//*[@id='tbodyid']/div[1]/div/div/h5");
    private final SelenideElement priseInCartSamsungGalaxyS6 = $x("//*[@id='tbodyid']//img[@src='imgs/galaxy_s6.jpg']/../following-sibling::td[2]");
    private final SelenideElement priseInCartAsusFullHD = $x("//*[@id='tbodyid']//img[@src='imgs/asusm.jpg']/../following-sibling::td[2]");
    private final SelenideElement priseInCartSonyVaioI7 = $x("//*[@id='tbodyid']//img[@src='imgs/sony_vaio_5.jpg']/../following-sibling::td[2]");
    private final SelenideElement totalInCartPrise = $x("//*[@id='totalp']");
    private final SelenideElement buttonCartField = $x("//*[@id='cartur']");


    public void comparisonPriceCart() {
        open("https://www.demoblaze.com/");
        int intPriseSamsungGalaxyS6 = Integer.parseInt(priseSamsungGalaxyS6.getText().replaceAll("[^0-9]", ""));
        open("https://www.demoblaze.com/cart.html");
        int intPriseInCartSamsungGalaxyS6 = Integer.parseInt(priseInCartSamsungGalaxyS6.getText().replaceAll("[^0-9]", ""));
        assertEquals(intPriseSamsungGalaxyS6, intPriseInCartSamsungGalaxyS6);
    }

    public void sumPrise() {
        open("https://www.demoblaze.com/");
        buttonCartField.click();
        int intPriseInCartSamsungGalaxyS6 = Integer.parseInt(priseInCartSamsungGalaxyS6.getText().replaceAll("[^0-9]", ""));
        int intPriseInCartAsusFullHD = Integer.parseInt(priseInCartAsusFullHD.getText().replaceAll("[^0-9]", ""));
        int intPriseInCartSonyVaioI7 = Integer.parseInt(priseInCartSonyVaioI7.getText().replaceAll("[^0-9]", ""));
        int intTotalPrise = Integer.parseInt(totalInCartPrise.getText().replaceAll("[^0-9]", ""));

        assertEquals(intTotalPrise, (intPriseInCartSamsungGalaxyS6+intPriseInCartAsusFullHD+intPriseInCartSonyVaioI7), "сумма не верна");
        System.out.println(intPriseInCartSamsungGalaxyS6);
        System.out.println(intPriseInCartAsusFullHD);
        System.out.println(intPriseInCartSonyVaioI7);
        System.out.println(intTotalPrise);
    }
}
