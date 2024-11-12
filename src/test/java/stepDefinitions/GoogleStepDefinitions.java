package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GooglePage;
import utils.Utils;

import static config.ConfigurationManager.configuration;

public class GoogleStepDefinitions {

    final GooglePage googlePage = new GooglePage(DriverManager.getThreadDriver());
    @Given("Go to Google Page")
    public void userGoesGooglePage(){
        Utils.goPage(configuration().googleUrl());
        System.out.println("Google Page is opened");
    }

    @When("User types {string} to search box")
    public void userTypesToSearchBox(String text) {
        googlePage.searchByText(text);
    }

    @And("User clicks the query result after search")
    public void userClicksTheQueryResultAfterSearch() {
        googlePage.clickQuery();
    }
}
