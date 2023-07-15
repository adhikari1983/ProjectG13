package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use-to provide the path of all the feature files or to one .feature file
        features = "src/test/resources/features",
        //glue keyword we use-to provide the path of the package where all the step defs are available
        glue = {"steps"},
        //executes the step defs
        dryRun = false,
        //executes the test case of our tag selection
        tags = "@incompleteEmpInformation",
        //to avoid irrelevant information from the console for simple output
        monochrome = true,
        //prints all the steps in console, generates report & provides the failed test path
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "rerun:target/failed.txt"}
)
public class RunnerClass {
}
