package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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


    @When("user enters valid employee full name in name text box")
    public void user_enters_valid_employee_full_name_in_name_text_box() {
        searchEmployeeWait();

        sendText("Slobodan Joksimovic", employeeSearchPage.nameTextField);
    }

    @When("user enters partial name match in variations and capitalizations")
    public void user_enters_partial_name_match_in_variations_and_capitalizations() {
        searchEmployeeWait();

        sendText("joksim", employeeSearchPage.nameTextField);
        takeScreenshot("partialName");

    }

    @When("user enters invalid name")
    public void user_enters_invalid_name() {
        searchEmployeeWait();
        sendText("alibaba the boss", employeeSearchPage.nameTextField);
        takeScreenshot("invalidName");
    }
    @Then("user is able to see No Records Found message")
    public void user_is_able_to_see_no_records_found_message() {
        String errorMsgActual = employeeSearchPage.NoRecordsFoundMsg.getText();
        String errorMsgExpected = "No Records Found";
        Assert.assertEquals("No Records Found", errorMsgExpected, errorMsgActual);

    }

    @When("user enters invalid id")
    public void user_enters_invalid_id() {
        searchEmployeeWait();
        sendText("55555555555", employeeSearchPage.idTextField);


    }


}
