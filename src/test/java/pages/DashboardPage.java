package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement empListOption;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeButton;

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement adminButton;

    @FindBy(id="menu_admin_Qualifications")
    public WebElement qualificationsButton;
    @FindBy(id="menu_admin_viewLanguages")
    public WebElement languageButton;
    @FindBy(id="btnAdd")
    public WebElement addButton;
    @FindBy(name="language[name]")
    public WebElement languageName;
    @FindBy(name="btnSave")
    public WebElement saveBtn;


    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
