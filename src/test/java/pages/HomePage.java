package pages;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
       Utils.goPage("https://webdriveruniversity.com/");
    }

    public void clickAndNavigateToContactUsPage() {
//        setPageChangeAfterClickByRole("LINK","CONTACT US Contact Us Form");
//        getPage().bringToFront();
    }

    public void clickAndNavigateToLoginPage() {
//        setPageChangeAfterClickByRole("LINK","LOGIN PORTAL Login Portal Are");
    }
}
