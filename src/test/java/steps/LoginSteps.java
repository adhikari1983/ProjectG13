package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import static utils.Log.error;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application login page")
    public void user_is_navigated_to_hrms_application_login_page() {

        openBrowserAndNavigateToURL();
    }

    @When("user enter valid admin credentials")
    public void user_enter_valid_admin_credentials() {

        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {

        click(loginPage.loginButton);
    }

    @Then("user should be successfully logged in")
    public void user_should_be_successfully_logged_in() {

        WebElement welcomeAdmin = driver.findElement(By.xpath("//*[@id='welcome']"));
        boolean isDisplayed = welcomeAdmin.isDisplayed();
        Assert.assertTrue("User should be successfully logged in", isDisplayed);

    }

    @When("user enters {string} and {string} and verify the {string}")
    public void user_enters_and_and_verify_the
            (String username, String password, String errorMsgExpected) {
     sendText(username,loginPage.usernameField);
     sendText(password,loginPage.passwordField);
     click(loginPage.loginButton);
     String errorMsgActual=loginPage.errorMessageField.getText();
     Assert.assertEquals(errorMsgExpected,errorMsgActual);
    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("error message is displayed")
    public void error_message_is_displayed() {
        String errorMessage="Invalid credential. Please check your username and password and try again";
        Log.error(errorMessage);
    }
    @Then("user can correct the input and attempt to log in again")
    public void user_can_correct_the_input_and_attempt_to_log_in_again() {
       loginPage.usernameField.clear();
       loginPage.passwordField.clear();
        reloadPage();
    }
}


