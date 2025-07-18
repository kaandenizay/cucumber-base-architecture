package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import pages.BasePage;
import pages.HomePage;

@AllArgsConstructor
public class HomePageSteps extends BasePage {

    private HomePage homePage;

    @Given("I navigate to the webdriveruniversity homepage")
    public void i_navigate_to_the_webdriveruniversity_homepage() {
        homePage.navigateToHomePage();
    }

    @When("I click on the contact us button")
    public void i_click_on_the_contact_us_button() {
        homePage.clickAndNavigateToContactUsPage();
    }

    @When("I opened the login page")
    public void iOpenedTheLoginPage() {
        homePage.clickAndNavigateToLoginPage();
    }
}
