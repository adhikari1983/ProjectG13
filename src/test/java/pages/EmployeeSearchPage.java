package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idTextField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement nameTextField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
    public WebElement searchResultById;

    @FindBy(className = "ac_loading")
    public WebElement loadingMsg;

    @FindBy(xpath = "//td[normalize-space()='No Records Found']")
    public WebElement NoRecordsFoundMsg;

    public EmployeeSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
