package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.N11MainPage;
import utils.Utils;

import static config.ConfigurationManager.configuration;

public class N11StepDefinitions {

    final N11MainPage n11MainPage = new N11MainPage(DriverManager.getThreadDriver());
    @Given("Go to N11 Page")
    public void userGoesGooglePage(){
        Utils.goPage(configuration().n11Url());
        System.out.println("N11 Page is opened");
    }

    @When("User rejects cookies on Main Page")
    public void userRejectsCookiesOnMainPage() {
        n11MainPage.blockCookies();
    }
}
