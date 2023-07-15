package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeWorkExperiencePage extends CommonMethods {

    @FindBy(linkText="53832479")
    public WebElement idButton;      //added id button

    @FindBy(linkText="Qualifications")
    public WebElement qualifications;

    @FindBy(id="addWorkExperience")
    public WebElement addBtn;

    @FindBy(id="experience_employer")
    public WebElement companyField;

    @FindBy(id="experience_jobtitle")
    public WebElement jobTitleField;

    @FindBy(id="experience_from_date")
    public WebElement fromDate;

    @FindBy(id="experience_to_date")
    public WebElement toDate;

    @FindBy(id="experience_comments")
    public WebElement comment;

    @FindBy(id="btnWorkExpSave")
    public WebElement saveBtn;

    @FindBy(name="delWorkExp[]")
    public WebElement companyCheckBox;

    @FindBy(className = "edit")
    public WebElement companyName;

    @FindBy(id="delWorkExperience")
    public WebElement deleteBtn;

   // @FindBy(css = "message.success.fadable")
   // public WebElement successMsg;





    public EmployeeWorkExperiencePage(){
        PageFactory.initElements(driver, this);
    }
}




