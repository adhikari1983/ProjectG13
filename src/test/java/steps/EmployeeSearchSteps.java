package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class EmployeeSearchSteps extends CommonMethods {

    @When("user clicks on PIM option and employee list option")
    public void user_clicks_on_pim_and_employee_list_option() {
        click(dashboardPage.pimOption);
        click(dashboardPage.empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(ConfigReader.getPropertyValue("employeeSearchById"), employeeSearchPage.idTextField);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(employeeSearchPage.searchButton);
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Employee information is displayed");
    }

    @Then("user clicks on same valid employee id on the listed employee data table")
    public void user_clicks_on_same_valid_employee_id_on_the_listed_employee_data_table() {
        click(employeeSearchPage.searchResultById);
    }
}
