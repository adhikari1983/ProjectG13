package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import static steps.PageInitializer.addEmployeePage;
import static steps.PageInitializer.dashboardPage;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       click(dashboardPage.pimOption);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        click(dashboardPage.addEmployeeButton);
    }
    @When("user enters firstName and middleName and lastName")
    public void user_enters_first_name_and_middle_name_and_last_name() {

        sendText("Robert", addEmployeePage.firstNameField);
        sendText("Paul",addEmployeePage.middleNameField);
        sendText("Maroon",addEmployeePage.lastNameField);

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }
    @Then("employee was added successfully")
    public void employee_was_added_successfully() {
        System.out.println("Employee was added successfully");
    }
}
