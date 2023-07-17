package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
public class JobPage extends CommonMethods {

    @FindBy(xpath = "//ul[@id='sidenav']//a[contains(text(),'Job')]")
    public static WebElement job;

    @FindBy(xpath = "//input[@id='btnSave']")
    public static WebElement edit;

    @FindBy(xpath = "//select[@id='job_job_title']")
    public static WebElement jobTitle;

    @FindBy(id = "job_emp_status")
    public static WebElement employeeStatus;

    @FindBy(xpath = "//select[@id='job_eeo_category']")
    public static WebElement jobCategory;

    @FindBy(id = "job_joined_date")
    public static WebElement joinedDate;

    @FindBy(id = "job_sub_unit")
    public static WebElement subUnit;

    @FindBy(id = "job_location")
    public static WebElement location;

    @FindBy(id = "job_contract_start_date")
    public static WebElement startDate;

    @FindBy(id = "job_contract_end_date")
    public static WebElement endDate;

    @FindBy(id="btnSave")
    public static WebElement save;

    // Other elements and methods specific to the Jobs page
    public JobPage(){
        PageFactory.initElements(driver,this);
    }
}

