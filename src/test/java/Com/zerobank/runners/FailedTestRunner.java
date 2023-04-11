package Com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-html-reports"
        },
        features = "@target/rerun.txt",
        glue ="src/test/java/Com/zerobank/stepdefinitions"
)
public class FailedTestRunner {
}
