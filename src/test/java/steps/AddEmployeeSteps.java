package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import java.util.Map;
import java.util.List;

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
    @When("user enters firstName and middleName and lastName and employeeID")
    public void user_enters_first_name_and_middle_name_and_last_name_and_employee_id
            (io.cucumber.datatable.DataTable dataTable){

        List<Map<String, String>> employeeNames=dataTable.asMaps();
        for (Map<String, String> employee:employeeNames){
            //to get the value
            String firstNameValue=employee.get("firstName");
            String middleNameValue=employee.get("middleName");
            String lastNameValue= employee.get("lastName");
            String employeeIDValue=employee.get("employeeID");

           //to fill the fields
            sendText(firstNameValue,addEmployeePage.firstNameField);
            sendText(middleNameValue,addEmployeePage.middleNameField);
            sendText(lastNameValue,addEmployeePage.lastNameField);
            sendText(employeeIDValue,addEmployeePage.employeeIdField);
            click(addEmployeePage.saveButton);

            click(dashboardPage.addEmployeeButton);

        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("user enters {string} and {string} and verify {string}")
    public void user_enters_and_and_verify
            (String firstname, String lastname, String errorMessageExpected) {

       sendText(firstname,addEmployeePage.firstNameField);
       sendText(lastname,addEmployeePage.lastNameField);
       click(addEmployeePage.saveButton);

      //getting the error message from web element
        String errorMessageActual=addEmployeePage.errorTextFieldBox.getText();

        //to compare error message from feature file and web element
        Assert.assertEquals("please fill the required fields",errorMessageExpected,errorMessageActual);
    }
}
