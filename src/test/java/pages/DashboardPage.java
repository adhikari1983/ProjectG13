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
    @FindBy(xpath = "//a[text()='Welcome Admin']")
    public WebElement WelcomeMsg;
    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement viewAdminOption;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
