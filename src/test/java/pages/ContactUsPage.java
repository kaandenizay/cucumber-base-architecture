package pages;

import org.openqa.selenium.WebDriver;


public class ContactUsPage extends BasePage {


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(String firstName) {
//        fillField("First Name", firstName);
    }

    public void fillLastName(String lastName) {
//        fillField("Last Name", lastName);
    }

    public void fillEmailAddress(String email) {
//        fillField("Email Address", email);
    }

    public void typeComment(String comment) {
//        fillField("Comments", comment);
    }

    public void clickOnSubmitButton() {
//        clickByRole("BUTTON", "SUBMIT");
    }

    public void verifySuccessfulContent(String message){
//        Locator locator = getPage().locator("#contact_reply h1");
//        assertThat(locator).isVisible();
//        assertThat(locator).hasText(message);
    }

    public void verifyUnsuccessfulContent(String message){
//        String messages = getPage().locator("body").textContent();
//        Assert.assertTrue(messages.contains(message));
    }
}
