package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ContactUsPage;

import static data.DataFaker.*;

public class ContactUsSteps {

//    private final ContactUsPage contactUsPage = new ContactUsPage(DriverManager.getThreadDriver());

    @And("I type a first name")
    public void i_type_a_first_name() {
        DriverManager.getThreadDriver().findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kaan");
//        contactUsPage.fillFirstName("Kaan");
    }

    @And("I type a last name")
    public void i_type_a_last_name() {
        DriverManager.getThreadDriver().findElement(By.xpath("//input[@name='last_name']")).sendKeys("Denizay");
//        contactUsPage.fillLastName("Denizay");
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() {
        DriverManager.getThreadDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("abc@qwerty.com");
//        contactUsPage.fillEmailAddress("abc@qwerty.com");
    }

    @And("I type a comment")
    public void i_type_a_comment() {
        DriverManager.getThreadDriver().findElement(By.xpath("//textarea[@name='message']")).sendKeys("I'm Test Specialist");
//        contactUsPage.typeComment("I'm Test Specialist");

    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        DriverManager.getThreadDriver().findElement(By.xpath("//input[@type='submit']")).click();
//        contactUsPage.clickOnSubmitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        String message = DriverManager.getThreadDriver().findElement(By.cssSelector("#contact_reply h1")).getText();
        Assert.assertEquals("Thank You for your Message!", message);
//        contactUsPage.verifySuccessfulContent("Thank You for your Message!");

    }

    @Then("I should be presented with an unsuccessful {string} message")
    public void iShouldBePresentedWithAnUnsuccessfulMessage(String message) {
//        contactUsPage.verifyUnsuccessfulContent(message);
    }

    @And("I type a first name as {string}")
    public void iTypeAFirstNameAs(String name) {
//        contactUsPage.fillFirstName(name);
    }

    @And("I type a last name as {string}")
    public void iTypeALastNameAs(String surname) {
//        contactUsPage.fillLastName(surname);
    }

    @And("I enter an email address as {string}")
    public void iEnterAnEmailAddressAs(String emailAddress) {
//        contactUsPage.fillEmailAddress(emailAddress);
    }

    @And("I type a comment as {string} and {int} as numbers")
    public void iTypeACommentAsAndAsNumbers(String comment, int number) {
//        contactUsPage.typeComment(comment + " " + number);
    }

    @And("I type a random first name")
    public void iTypeARandomFirstName() {
//        contactUsPage.fillFirstName(getRandomFirstname());
    }

    @And("I type a random last name")
    public void iTypeARandomLastName() {
//        contactUsPage.fillLastName(getRandomLastname());
    }

    @And("I enter an random email address")
    public void iEnterAnRandomEmailAddress() {
//        contactUsPage.fillEmailAddress(getRandomEmail());
    }

    @And("I type a random comment")
    public void iTypeARandomComment() {
//        contactUsPage.typeComment(getRandomSentence());
    }
}
