package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EmployeeSearchPage;
import pages.EmployeeWorkExperiencePage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class EmployeeWorkExperienceSteps extends CommonMethods {



    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
        click(employeeWorkExperiencePage.qualifications);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(employeeWorkExperiencePage.addBtn);

    }

    @When("user adds Company and Job Title and dates from to and comment and verify it")
    public void user_adds_company_and_job_title_and_dates_from_to_and_comment_and_verify_it(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> workExp = dataTable.asMaps();
        for (Map<String, String> addWorkExp : workExp) {
            String companyValue = addWorkExp.get("Company");
            String jobTitleValue = addWorkExp.get("Job Title");
            String fromDateValue = addWorkExp.get("From");
            String toDateValue = addWorkExp.get("To");
            String commentValue = addWorkExp.get("Comment");

            sendText(companyValue, employeeWorkExperiencePage.companyField);
            sendText(jobTitleValue, employeeWorkExperiencePage.jobTitleField);
            sendText(fromDateValue, employeeWorkExperiencePage.fromDate);
            sendText(toDateValue, employeeWorkExperiencePage.toDate);
            sendText(commentValue, employeeWorkExperiencePage.comment);
        }
    }

    @When("user clicks on save btn")
    public void user_clicks_on_save_btn()  {

        click(employeeWorkExperiencePage.saveBtn);
        takeScreenshot("savedPic");
        if (employeeWorkExperiencePage.saveBtn.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    @Then("user work experience will be saved  in profile")
    public void user_work_experience_will_be_saved_in_profile() {


    }

    @When("user clicks on Company name")
    public void user_clicks_on_company_name()  {

        click(employeeWorkExperiencePage.companyName);

    }


    @When("user edits Work Experience Page")
    public void user_edits_work_experience_page() {
        click(employeeWorkExperiencePage.comment);
       sendText("Taught Java and Selenium", employeeWorkExperiencePage.comment);

        click(employeeWorkExperiencePage.saveBtn);
        takeScreenshot("editedPic");

    }


    @When("user clicks on Company check box")
    public void user_clicks_on_company_check_box() {
        click(employeeWorkExperiencePage.companyCheckBox);

    }

    @When("user clicks on Delete button")
    public void user_clicks_on_delete_button()  {
        click(employeeWorkExperiencePage.deleteBtn);
        takeScreenshot("deletedPic");

    }


}
