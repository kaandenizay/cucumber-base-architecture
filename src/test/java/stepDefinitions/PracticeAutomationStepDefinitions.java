package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticeAutoLoginPage;
import utils.Utils;

import static config.ConfigurationManager.configuration;

public class PracticeAutomationStepDefinitions {

    final PracticeAutoLoginPage practiceAutoLoginPage = new PracticeAutoLoginPage(DriverManager.getThreadDriver());
    @Given("Go to Login Page")
    public void userGoesLoginPage(){
        Utils.goPage(configuration().practiceAutomationUrl());
        System.out.println("Page is opened");
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
        System.out.println("Page is opened");
    }
}
