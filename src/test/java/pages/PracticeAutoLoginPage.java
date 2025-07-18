package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class PracticeAutoLoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindAll({
            @FindBy(id="books-wrapper"),
            @FindBy(id="userName-value")
    })
    private WebElement user;
    @FindBy(xpath = "//efilli-layout-dynamic")
    private WebElement shadowFrame;

    public PracticeAutoLoginPage(WebDriver driver) {
//        super(driver);
    }

    public void fillUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void fillPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickSubmit(){
        submitButton.click();
    }

    public void blockCookies(){
        sleep(5);
        SearchContext shadowRoot = shadowFrame.getShadowRoot();
        // Only CSS Selector is working inside of shadow elements
        WebElement rejectCookies = shadowRoot.findElement(By.cssSelector("div[data-name='Reject Button']"));
        rejectCookies.click();
    }
}
