package stepDefinitions;
import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class HomePageSteps {


//    private final HomePage homePage = new HomePage(DriverManager.getThreadDriver());

    @Given("I navigate to the webdriveruniversity homepage")
    public void i_navigate_to_the_webdriveruniversity_homepage() {
        DriverManager.getThreadDriver().get("https://webdriveruniversity.com/");
//        homePage.navigateToHomePage();
    }

    @When("I click on the contact us button")
    public void i_click_on_the_contact_us_button() {
        DriverManager.getThreadDriver().findElement(By.xpath("//h1[text()='CONTACT US']")).click();
        List<String> windowsTab = new ArrayList<String>(DriverManager.getThreadDriver().getWindowHandles());
        DriverManager.getThreadDriver().switchTo().window(windowsTab.get(windowsTab.size() - 1));
//        homePage.clickAndNavigateToContactUsPage();
    }

    @When("I opened the login page")
    public void iOpenedTheLoginPage() {
//        homePage.clickAndNavigateToLoginPage();
    }
}
