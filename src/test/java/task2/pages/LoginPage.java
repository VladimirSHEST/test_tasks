package task2.pages;

import com.codeborne.selenide.SelenideElement;
import task2.utils.DataGenerator;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement logInLink = $x("//*[@id='login2']");

    private final SelenideElement userNamelogIn = $x("//*[@id='loginusername']");

    private final SelenideElement passwordlogIn = $x("//*[@id='loginpassword']");

    private final SelenideElement buttonLogIn = $x("//*[@id='logInModal']/div/div/div[3]/button[2]");

    public void logIn() {
        logInLink.click();
        userNamelogIn.sendKeys(DataGenerator.generateUsername());
        passwordlogIn.sendKeys(DataGenerator.generatePassword());
        buttonLogIn.click();

    }

}
