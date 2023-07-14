package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Add;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.AddMembershipPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

import static steps.PageInitializer.*;

public class AddMembershipSteps extends CommonMethods {
    @When("Admin enters valid admin username and password")
    public void admin_enters_valid_admin_username_and_password() {
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);


    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("Admin user is logged in")
    public void admin_user_is_logged_in() {
        String actualMsg = dashboardPage.WelcomeMsg.getText();
        String expectedMsg = "Welcome Admin";
        Assert.assertEquals(expectedMsg, actualMsg);
    }
    @Then("Admin clicks on Admin option")
    public void admin_clicks_on_admin_option() {
        click(dashboardPage.viewAdminOption);
    }
    @When("Admin navigates to Qualifications")
    public void admin_navigates_to_qualifications() {
        click(addMembershipPage.Qualifications);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @When("Admin selects Memberships")
    public void admin_selects_memberships() {
        click(addMembershipPage.MembershipOption);
      // selectFromDropdown("Memberships",addMembershipPage.Membership);
        //selectFromDropdown(addMembershipPage.Qualifications, "Memberships");


    }
    @Then("Admin user can add any Memberships")
    public void admin_user_can_add_any_memberships() {
        click(addMembershipPage.AddButton);
        sendText("Josh Smith", addMembershipPage.AddNewMember);
        click(addMembershipPage.SaveButton);
    }

}
