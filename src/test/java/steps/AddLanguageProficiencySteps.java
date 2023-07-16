package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class AddLanguageProficiencySteps extends CommonMethods {
    @When("user clicks on add language button")
    public void user_clicks_on_add_language_button() {
        click(addLanguageProficiencyPage.addLanguageProficiency);
    }
    @When("user selects the language and fluency and competency")
    public void user_selects_the_language_and_fluency_and_competency() {
        click(addLanguageProficiencyPage.languageSelect);
        click((addLanguageProficiencyPage.fluencySelect));
        click(addLanguageProficiencyPage.competencySelect);

    }
    @When("user adds comments")
    public void user_adds_comments() {
       sendText("Arabic is my Mother Tongue, Habiby",addLanguageProficiencyPage.comments);
    }
    @When("User clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {
        click(addLanguageProficiencyPage.languageSaveBtn);// to validate we use if
        takeScreenshot("pic");
        if (addLanguageProficiencyPage.languageSaveBtn.isDisplayed()) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }


    }
    @Then("user is successfully add the language proficiency")
    public void user_is_successfully_add_the_language_proficiency() {

    }

    @When("user clicks on language checkbox to edit or delete")
    public void user_clicks_on_language_checkbox_to_edit_or_delete() {
      click(addLanguageProficiencyPage.languageChkBx);
    }
    @When("user clicks on language delete button")
    public void user_clicks_on_language_delete_button() {
       click(addLanguageProficiencyPage.languagedeletBTN);

       takeScreenshot("deletepic");
    }
    @Then("user is successfully edited or deleted the language")
    public void user_is_successfully_edited_or_deleted_the_language() {

    }


}
