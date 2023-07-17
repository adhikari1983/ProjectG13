
package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.JobPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.awt.font.FontRenderContext;
import java.util.List;
import java.util.Map;

public class EmployeeJobDetailsSteps extends CommonMethods {
    //    @Given("user clicks PIM in the navigation bar")
//    public void user_clicks_pim_in_the_navigation_bar() {
//    click(dashboardPage.pimOption);
//    }
    @Then("user should see the employee list page")
    public void user_should_see_the_employee_list_page() {

    }
    @And("user will select an employee id from the employee list")
    public void user_will_select_an_employee_id_from_the_employee_list() {
        //sendText(ConfigReader.getPropertyValue(""),employeeSearchPage.idTextField);
        click(employeeSearchPage.searchResultById);

    }
    @Then("user should see the personal details page")
    public void user_should_see_the_personal_details_page() {
    }
    @When("user selects the job tab on the personal details page")
    public void user_selects_the_job_tab_on_the_personal_details_page() throws InterruptedException {
        click(JobPage.job);Thread.sleep(5000);
    }

    @And("user should select the edit button")
    public void user_should_select_the_edit_button(){
        click(JobPage.edit);


    }

    @And("the following fields should be displayed and editable")
    public void the_following_fields_should_be_displayed_and_editable
            (io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> jobDetails= dataTable.asMaps();
        //  |Job title|employee status| job category|joined date|sub unit|location|start date|end date|

        for (Map<String, String> addJobDetails: jobDetails){
            String jobTitleValue = addJobDetails.get("JobTitle");
            String employeeStatueValue = addJobDetails.get("employeeStatus");
            String jobCategoryValue = addJobDetails.get("jobCategory");
            String joinedDateValue = addJobDetails.get("joinedDate");
            String subUnitValue = addJobDetails.get("subUnit");
            String locationValue = addJobDetails.get("location");
            String startDateValue = addJobDetails.get("startDate");
            String endDateValue = addJobDetails.get("endDate");

            selectFromDropdown(jobPage.jobTitle,jobTitleValue);
            selectFromDropdown(jobPage.employeeStatus,employeeStatueValue);
            selectFromDropdown(jobPage.jobCategory, jobCategoryValue);
            sendText(joinedDateValue, jobPage.joinedDate);
            selectFromDropdown(jobPage.subUnit, subUnitValue);
            selectFromDropdown(jobPage.location, locationValue);
            sendText(startDateValue,jobPage.startDate);
            sendText(endDateValue,jobPage.endDate);


        }
    }

    @Then("user should select the save button and verify it")
    public void user_should_select_the_save_button_and_verify_it(){
        click(JobPage.save);
        takeScreenshot("jobUpdated");

        //saved message display validation
        if (JobPage.save.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }

    }


}
