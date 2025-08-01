package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;

import pages.BasePage;
import pages.ContactUsPage;
import static data.DataFaker.*;

@AllArgsConstructor
public class ContactUsSteps extends BasePage {

    private ContactUsPage contactUsPage;

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPage.clickOnSubmitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPage.verifySuccessfulContent("Thank You for your Message!");
    }

    @Then("I should be presented with an unsuccessful {string} message")
    public void iShouldBePresentedWithAnUnsuccessfulMessage(String message) {
        contactUsPage.verifyUnsuccessfulContent(message);
    }

    @And("I type a first name as {string}")
    public void iTypeAFirstNameAs(String name) {
        contactUsPage.fillFirstName(name);
    }

    @And("I type a last name as {string}")
    public void iTypeALastNameAs(String surname) {
        contactUsPage.fillLastName(surname);
    }

    @And("I enter an email address as {string}")
    public void iEnterAnEmailAddressAs(String emailAddress) {
        contactUsPage.fillEmailAddress(emailAddress);
    }

    @And("I type a comment as {string} and {int} as numbers")
    public void iTypeACommentAsAndAsNumbers(String comment, int number) {
        contactUsPage.typeComment(comment + " " + number);
    }

    @And("I type a random first name")
    public void iTypeARandomFirstName() {
        contactUsPage.fillFirstName(getRandomFirstname());
    }

    @And("I type a random last name")
    public void iTypeARandomLastName() {
        contactUsPage.fillLastName(getRandomLastname());
    }

    @And("I enter an random email address")
    public void iEnterAnRandomEmailAddress() {
        contactUsPage.fillEmailAddress(getRandomEmail());
    }

    @And("I type a random comment")
    public void iTypeARandomComment() {
        contactUsPage.typeComment(getRandomSentence());
    }
}
