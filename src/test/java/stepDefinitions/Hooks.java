package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public static void setupBrowser() {
        DriverManager.setThreadDriver("chrome");
        DriverManager.getThreadDriver();
        System.out.println("Browser launched");
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            final byte[] screenshot = ((TakesScreenshot) DriverManager.getThreadDriver()).getScreenshotAs(OutputType.BYTES);
            if (scenario.isFailed()) {
                scenario.attach(screenshot, "image/png", "screenshots");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This is After annotation");
            DriverManager.quitDriver();
            System.out.println("Browser closed");
            DriverManager.removeThreadPool();
        }
    }
}