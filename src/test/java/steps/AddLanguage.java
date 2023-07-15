package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static steps.PageInitializer.dashboardPage;
import static utils.CommonMethods.click;
import static utils.CommonMethods.sendText;

public class AddLanguage {

    @When("user clicks on Admin button")
    public void user_clicks_on_admin_button() {

        click(dashboardPage.adminButton);
    }

    @When("user navigates to Qualifications and clicks on language button")
    public void user_navigates_to_qualifications_and_clicks_on_language_button() {
     click(dashboardPage.qualificationsButton);

        click(dashboardPage.languageButton);

    }
    @When("User clicks on add button")
    public void user_clicks_on_add_button() {
       click(dashboardPage.addButton);
    }
    @When("user enters the language name and clicks on save")
    public void user_enters_the_language_name_and_clicks_on_save() {
        sendText("Chinese", dashboardPage.languageName);
        click(dashboardPage.saveBtn);
    }
    @Then("user is successfully add the language")
    public void user_is_successfully_add_the_language() {

    }
}
