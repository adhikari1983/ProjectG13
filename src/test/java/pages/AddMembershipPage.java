package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddMembershipPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"menu_admin_Qualifications\"]")
    public WebElement Qualifications;

    @FindBy(xpath = "//*[@id=\"menu_admin_membership\"]")
    public WebElement MembershipOption;

    @FindBy(id="btnAdd")
    public WebElement AddButton;

    @FindBy(id="membership_name")
    public WebElement AddNewMember;

    @FindBy(xpath = "//input[@id=\"btnSave\"]")
    public WebElement SaveButton;

    public AddMembershipPage(){
        PageFactory.initElements(driver,this);
    }
}
