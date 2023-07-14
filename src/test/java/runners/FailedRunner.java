package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //in failed Runner just 2 things are required features and glue
        features ="@target/failed.txt",
        //glue keyword we use to provide the path of the package where step defs are available
        glue ="steps",
        //dryRun-true it stops actual execution, it quickly scans all the steps and will
        // dryRun = false,//false will execute no need of this line the failed runner
        //we can assign any name like "@sprint14", of your choice , even two tags , 3, 4
        // tags = "@login1",no need of this line in a failed runner
        //"@sprint1 and @sprint2"- if both exist and conditions true it will execute otherwise
        //will not even execute 1 out of 2
        //it means sometimes the console output for cucumber test is having some irrelevant
        //info, when you set it to true , it removes all the irrelevant info from
        //console and will give you simple output
        //monochrome = true,no need in thiss failed runner
        //it used to print all the steps in console
        //html plugin is generating the report.All types of reports will be found/generated in target folder
        plugin={"pretty"}//will print steps in console
)
public class FailedRunner {

}
