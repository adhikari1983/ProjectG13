package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;
import utils.ConfigReader;

import static steps.PageInitializer.loginPage;

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

        WebElement welcomeAdmin = driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
        boolean isDisplayed = welcomeAdmin.isDisplayed();
        Assert.assertTrue("User should be successfully logged in", isDisplayed);

    }
}


