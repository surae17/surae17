package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/featurefile"},
        glue ={"Stepdefinition"},
        plugin = {"pretty"},
        tags = " @lmti02"
)

public class FeatureRunner {

}
