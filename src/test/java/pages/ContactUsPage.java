package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactUsPage extends BasePage {

    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement commentTextarea;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(css = "#contact_reply h1")
    private WebElement contactReplyText;
    @FindBy(xpath = "//title[text()='Contact form handler']/parent::head/following-sibling::body")
    private WebElement errorTextBody;

    public void fillFirstName(String firstName) {
        fill(firstNameInput, firstName);
    }

    public void fillLastName(String lastName) {
        fill(lastNameInput, lastName);
    }

    public void fillEmailAddress(String email) {
        fill(emailInput, email);
    }

    public void typeComment(String comment) {
        fill(commentTextarea, comment);
    }

    public void clickOnSubmitButton() {
        click(submitButton);
    }

    public void verifySuccessfulContent(String message){
        String messageText = getTextFromElement(contactReplyText);
        Assert.assertEquals(message, messageText);
    }

    public void verifyUnsuccessfulContent(String message){
        String messages = getTextFromElement(errorTextBody);
        Assert.assertTrue(messages.contains(message));
    }
}
