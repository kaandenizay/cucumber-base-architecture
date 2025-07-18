package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import log.LoggingManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static config.ConfigurationManager.configuration;
import static driver.DriverManager.*;

public class Hooks {

    @Before
    public static void setupBrowser() {
        setThreadDriver(configuration().browser());
        getThreadDriver();
        LoggingManager.info( "Browser launched"  + "\n" + "Test is starting.");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getThreadDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        cleanupDriver();
        LoggingManager.info("Browser closed" + "\n" + "Thread is cleaned up");
    }
}