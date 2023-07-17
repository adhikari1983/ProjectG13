
package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class AddDependentsSteps extends CommonMethods {

    @Then("user clicks on Dependents button")
    public void user_clicks_on_dependents_button() {
        click(addDependentsPage.dependentsTab);
    }

    @Then("user clicks on Add button of that page")
    public void user_clicks_on_add_button_of_that_page() {
        click(addDependentsPage.addButton);
    }

    @When("user add name and relationship and pleaseSpecify and dateOfBirth")
    public void user_add_name_and_relationship_and_please_specify_and_date_of_birth
            (io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        //| name | relationship | pleaseSpecify | dateOfBirth |
        List<Map<String, String>> dependentInfo = dataTable.asMaps();

        for (Map<String, String> dependent : dependentInfo) {
            //Extracting the dependent info
            String dependentName = dependent.get("name");
            String dependentRelationship = dependent.get("relationship");
            String dependentSpecification = dependent.get("pleaseSpecify");
            System.out.println(dependentSpecification);

            String dependentDOB = dependent.get("dateOfBirth");
            //Filing up the dependent info
            sendText(dependentName, addDependentsPage.nameTextField);
            selectFromDropdown(addDependentsPage.relationShipDD, dependentRelationship);

            if (addDependentsPage.relationShipDD.getText().equalsIgnoreCase("Other")) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.visibilityOf(addDependentsPage.specificationField));
                //Thread.sleep(5000);
                addDependentsPage.nameTextField.click();
                sendText(dependentSpecification, addDependentsPage.specificationField);
            }
            // sendText(dependentSpecification, addDependentsPage.specificationField);

            sendText(dependentDOB, addDependentsPage.dobField);
            Thread.sleep(2000);
        }
    }

    @When("user clicks on the save button of that page")
    public void user_clicks_on_the_save_button_of_that_page() {
        click(addDependentsPage.saveButton);
    }

    @Then("user is able to see Successfully Saved message display")
    public void user_is_able_to_see_successfully_saved_message_display() {

        String actualMessageDisplay = addDependentsPage.updatedMessage.getText();
        String expectedMessageDisplay = "Successfully Saved";
        Assert.assertEquals(expectedMessageDisplay, actualMessageDisplay);
        takeScreenshot("dependentInfoSaved");
    }

    @When("user clicks on the checkbox to select the dependent")
    public void user_clicks_on_the_checkbox_to_select_the_dependent() {
        click(addDependentsPage.checkBoxSelection);
    }

    @When("user clicks on the delete button")
    public void user_clicks_on_the_delete_button() {
        click(addDependentsPage.deleteButton);
    }

    @Then("user is able to see Successfully Deleted  message display")
    public void user_is_able_to_see_successfully_deleted_message_display() {
        String actualMessageDisplay = addDependentsPage.deletedMessage.getText();
        String expectedMessageDisplay = "Successfully Deleted";
        Assert.assertEquals(expectedMessageDisplay, actualMessageDisplay);
        takeScreenshot("depententInfoDeleted");
    }

}
