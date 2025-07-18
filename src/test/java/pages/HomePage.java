package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static config.ConfigurationManager.configuration;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h1[text()='CONTACT US']")
    private WebElement contactUsLink;
    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    private WebElement loginPortalLink;

    public void navigateToHomePage() {
       goPage(configuration().webDriverUniversityUrl());
    }

    public void clickAndNavigateToContactUsPage() {
        click(contactUsLink);
        switchToLastWindow();
    }

    public void clickAndNavigateToLoginPage() {
        click(loginPortalLink);
        switchToLastWindow();
    }

}
