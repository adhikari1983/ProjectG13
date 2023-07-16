package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddLanguageProficiencyPage extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"addLanguage\"]")
    public WebElement addLanguageProficiency;

    @FindBy(xpath = "//*[@id=\"language_comments\"]")
    public WebElement addComment;

    @FindBy(xpath = "//*[@id=\"btnLanguageSave\"]")
    public WebElement languageSaveBtn;
    @FindBy(xpath = "//*[@id=\"language_code\"]/option[2]")
    public WebElement languageSelect;
    @FindBy(xpath = "//*[@id=\"language_lang_type\"]/option[4]")
    public WebElement fluencySelect;
    @FindBy(xpath = "//*[@id=\"language_competency\"]/option[5]")
    public WebElement competencySelect;
    @FindBy(xpath = "//*[@id=\"language_comments\"]")
    public WebElement comments;

    @FindBy(xpath = "//*[@id=\"btnLanguageSave\"]")
    public WebElement languageProSaveBtn;
    @FindBy(xpath = "//*[@id=\"lang_data_table\"]/tbody/tr[1]/td[1]/input[5]")
    public WebElement languageChkBx;
    @FindBy(xpath = "//*[@id=\"delLanguage\"]")
    public WebElement languagedeletBTN;





    public AddLanguageProficiencyPage(){

            PageFactory.initElements(driver,this);

    }
}
