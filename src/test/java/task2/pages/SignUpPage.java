package task2.pages;

import com.codeborne.selenide.SelenideElement;
import task2.utils.DataGenerator;

import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage {

    private final SelenideElement signUpLink = $x("//*[@id='signin2']");
    private final SelenideElement usernameField = $x("//*[@id='sign-username']");
    private final SelenideElement passwordField = $x("//*[@id='sign-password']");
    private final SelenideElement buttonSingUp = $x("//*[@id='signInModal']/div/div/div[3]/button[2]");

    public void singUp() {
        signUpLink.click();
        usernameField.sendKeys(DataGenerator.generateUsername());
        passwordField.sendKeys(DataGenerator.generatePassword());
        buttonSingUp.click();

    }


}
