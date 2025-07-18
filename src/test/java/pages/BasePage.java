package pages;

import driver.DriverManager;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public abstract class BasePage {

    private static ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();
    private static final int DEFAULT_TIMEOUT_SECONDS = 10;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        wait = ThreadLocal.withInitial(() ->
                new WebDriverWait(DriverManager.getThreadDriver(), Duration.ofSeconds(DEFAULT_TIMEOUT_SECONDS)));
        return DriverManager.getThreadDriver();
    }

    public void goPage(String url) {
        getDriver().get(url);
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement getElement (Object element){
        if(element instanceof WebElement) {
            return wait.get().until(ExpectedConditions.visibilityOf((WebElement) element));
        } else {
            return wait.get().until(ExpectedConditions.visibilityOfElementLocated((By) element));
        }
    }

    public void waitForClickability(WebElement element){
        wait.get().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getElement(element));
    }

    public String getTextFromElement(WebElement element) {
        return getElement(element).getText().trim();
    }

    public void click(WebElement element) {
        waitForClickability(element);
        highlightElement(element);
        element.click();
    }

    public void highlightElement(WebElement element) {
        var highlightScript = "arguments[0].style.border='3px solid purple';";
        ((JavascriptExecutor) getDriver()).executeScript(highlightScript, element);
    }


    public void switchToLastWindow() {
        List<String> windowsTab = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windowsTab.get(windowsTab.size() - 1));
    }

    public void fill(WebElement webElement, String value) {
        getElement(webElement).sendKeys(value);
    }

    public void verifyAlertText(String message) {
        wait.get().until(ExpectedConditions.alertIsPresent());
        String alertText = getDriver().switchTo().alert().getText();
        Assert.assertEquals(message, alertText);
    }

}
