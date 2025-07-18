package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html"
        },
        features = "classpath:features",
        glue = "stepDefinitions",
        dryRun =false,
        tags ="@regression"


)
public class CukesRunner {
}
