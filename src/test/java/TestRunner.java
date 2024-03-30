import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\yakub\\IdeaProjects\\CRTP_Framework\\Features",
        glue = {"Stepdefinitions"},
        tags = "@test",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

}
