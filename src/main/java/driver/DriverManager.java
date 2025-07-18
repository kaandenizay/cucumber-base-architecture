package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static void setThreadDriver(String browser) {
        if (browser.equals("firefox")) {
            driverPool.set(new FirefoxDriver());
        } else if (browser.equals("chrome")) {
            driverPool.set(new ChromeDriver(chromeOptions()));
        }
        driverPool.get().manage().window().maximize();
    }

    public static WebDriver getThreadDriver() {
        return driverPool.get();
    }

    public static void cleanupDriver() {
        if (driverPool.get() != null) {
            getThreadDriver().quit();
        }
        driverPool.remove();
    }


    public static ChromeOptions chromeOptions() {
        ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER); // WebDriver waits until DOMContentLoaded event fire is returned.
            options.setImplicitWaitTimeout(Duration.ofSeconds(10));
            options.addArguments("--headless");
        return options;
    }

}
