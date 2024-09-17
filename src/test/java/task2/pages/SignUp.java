package task2.pages;

import com.codeborne.selenide.SelenideElement;
import task2.utils.DataGenerator;

import static com.codeborne.selenide.Selenide.$x;

public class SignUp {


    private final SelenideElement signUpLink = $x("//*[@id='signin2']");

    private final SelenideElement cartLink = $x("//*[@id='cartur']");

    private final SelenideElement userName = $x("//*[@id='sign-username']");

    private final SelenideElement password = $x("//*[@id='sign-password']");


    private final SelenideElement buttonSingUp = $x("//*[@id='signInModal']/div/div/div[3]/button[2]");

    public void singUp() {
        signUpLink.click();
        userName.sendKeys(DataGenerator.generateUsername());
        password.sendKeys(DataGenerator.generatePassword());
        buttonSingUp.click();
    }


}
