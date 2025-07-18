package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import pages.BasePage;
import pages.LoginPage;

@AllArgsConstructor
public class LoginSteps extends BasePage {

    private LoginPage loginPage;

    @And("I type username as {string}")
    public void iTypeUsernameAs(String username) {
        loginPage.typeUsername(username);
    }

    @And("I type password as {string}")
    public void iTypePasswordAs(String password) {
        loginPage.typePassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("I should be see the {string} alert message")
    public void iShouldBeSeeTheAlertMessage(String message) {
        loginPage.verifyLoginAlertMessage(message);
    }
}