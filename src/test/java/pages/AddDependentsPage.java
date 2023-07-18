package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddDependentsPage extends CommonMethods {

    @FindBy(xpath = "//ul[@id='sidenav']//a[contains(text(),'Dependents')]")
    public WebElement dependentsTab;

    @FindBy(id = "btnAddDependent")
    public WebElement addButton;

    @FindBy(id = "delDependentBtn")
    public WebElement deleteButton;

    @FindBy(xpath = "//input[@id='dependent_name']")
    public WebElement nameTextField;

    @FindBy(xpath = "//select[@id='dependent_relationshipType']")
    public WebElement relationShipDD;

    @FindBy(id="dependent_relationship")
    public WebElement specificationField;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dobField;

    @FindBy(xpath = "//input[@id='btnSaveDependent']")
    public  WebElement saveButton;

    @FindBy(xpath = "//input[@id='delDependentBtn']")
    public  WebElement getDeleteButton;

    @FindBy(xpath = "//table[@id='dependent_list']/tbody/tr[1]/td")
    public WebElement checkBoxSelection;

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement updatedMessage;

    @FindBy(xpath = "//div[@class='message success fadable']")
    public WebElement deletedMessage;

    @FindBy(xpath = "//a[text()='Close']")
    public WebElement closeElement;


    public AddDependentsPage() {
        PageFactory.initElements(driver, this);
    }
}