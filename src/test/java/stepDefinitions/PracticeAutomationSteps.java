package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log.LoggingManager;
import lombok.AllArgsConstructor;
import pages.BasePage;
import pages.PracticeAutoLoginPage;

import static config.ConfigurationManager.configuration;

@AllArgsConstructor
public class PracticeAutomationSteps extends BasePage {

    private PracticeAutoLoginPage practiceAutoLoginPage;

    @Given("Go to Login Page")
    public void userGoesLoginPage(){
        goPage(configuration().practiceAutomationUrl());
        LoggingManager.info("Page is opened");
    }

    @When("User types {string} as username")
    public void userTypesUsername(String username) {
        practiceAutoLoginPage.fillUsername(username);

    }

    @And("User types {string} as password")
    public void userTypesPassword(String password) {
        practiceAutoLoginPage.fillPassword(password);

    }

    @And("User clicks button")
    public void userClicksButton() {
        practiceAutoLoginPage.clickSubmit();

    }

    @Then("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        LoggingManager.info("Page is opened");
    }
}
