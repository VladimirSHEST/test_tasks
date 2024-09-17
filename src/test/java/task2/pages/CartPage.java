package task2.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {

    private final SelenideElement ButtonPhones = $x("/html/body/div[5]/div/div[1]/div/a[4]");
    private final SelenideElement samsungGalaxyS6 = $x("//*[@id='tbodyid']/div[1]/div/div/h4/a");
    private final SelenideElement addProduct = $x("//*[@id='tbodyid']/div[2]/div/a");
    private final SelenideElement buttonProductStore = $x("//*[@id='nava']");
    private final SelenideElement buttonLaptops = $x("/html/body/div[5]/div/div[1]/div/a[3]");
    private final SelenideElement sonyVaioI7 = $x("//*[@id='tbodyid']/div[2]/div/div/h4/a");
    private final SelenideElement ButtonMonitors = $x("/html/body/div[5]/div/div[1]/div/a[4]");
    private final SelenideElement asusFullHd = $x("//*[@id='tbodyid']/div[2]/div/div/h4/a");

    public void addToCart() {
        ButtonPhones.click();
        samsungGalaxyS6.click();
        addProduct.click();
        buttonProductStore.click();
        buttonLaptops.click();
        sonyVaioI7.click();
        addProduct.click();
        buttonProductStore.click();
        ButtonMonitors.click();
        asusFullHd.click();
        addProduct.click();
        buttonProductStore.click();
    }
}
