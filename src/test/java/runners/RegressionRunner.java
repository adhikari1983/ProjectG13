package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="scr/test/resources/features/", //this is the path to all features files
        glue="steps",                           //keyword to the package with step definitions
        dryRun=false,                          //dryRun=true -> to provide the missing step definition
        tags="@regression",                   //test tag
        monochrome=true,                     //to provide simple out put on the console
        plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"}
                                            //to print all the steps in the console and generate reports
)


public class RegressionRunner {
}
