package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "text")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;


    public void typeUsername(String username) {
        fill(usernameInput, username);
    }

    public void typePassword(String password) {
        fill(passwordInput, password);
    }

    public void clickOnLoginButton() {
        click(loginButton);
    }

    public void verifyLoginAlertMessage(String message) {
        verifyAlertText(message);
    }
}
