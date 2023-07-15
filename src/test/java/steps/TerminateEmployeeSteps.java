package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import static steps.PageInitializer.employeeSearchPage;
import static steps.PageInitializer.loginPage;

public class TerminateEmployeeSteps extends CommonMethods {



   @Given("Admin user log in to the system using valid credentials.")
   public void admin_user_log_in_to_the_system_using_valid_credentials() {


       sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
       sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
       WebElement LoginBtn = driver.findElement((By.xpath("//input[contains(@id,'Login')]")));
       click(LoginBtn);


   }


    @When("user accesses the list of employees in the system.")
    public void user_accesses_the_list_of_employees_in_the_system() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        click(pimOption);
    }


    @When("select a specified employee from the list.")
    public void select_a_specified_employee_from_the_list() {
        sendText(ConfigReader.getPropertyValue("terminatedEmployeeID"),employeeSearchPage.idTextField);
        click(employeeSearchPage.searchButton);
        WebElement desiredEmpId = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]/a"));

        click(desiredEmpId);

    }


    @When("navigate to the employee's job page.")
    public void navigate_to_the_employee_s_job_page() {
        WebElement jobButn = driver.findElement(By.xpath("//*[@id='sidenav']/li[6]/a"));
        click(jobButn);
    }


    @When("select the option to terminate the employment of the specified employee.")
    public void select_the_option_to_terminate_the_employment_of_the_specified_employee() {
        WebElement terminateEmpBtn = driver.findElement(By.xpath("//*[@id='btnTerminateEmployement']"));
        click(terminateEmpBtn);
        WebElement confirmTerminationBtn = driver.findElement(By.xpath("//input[@id='dialogConfirm']"));
        click(confirmTerminationBtn);


    }


    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {

        WebElement confirmTerminationBtn = driver.findElement(By.xpath("//*[@id='terminatedDate']/a"));
        String actualConfirmBtn = confirmTerminationBtn.getText();
        String expectedConfirmBtn = "Terminated on : 2023-07-14";


        Assert.assertEquals(actualConfirmBtn,expectedConfirmBtn);

    }




}
