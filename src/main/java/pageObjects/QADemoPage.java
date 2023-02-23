package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QADemoPage {

    private static final String FORMS_CARD = "//div[@class='card mt-4 top-card'][2]";
    private static final String SELECT_ITEM_TEXT = "//div[@class='col-12 mt-4 col-md-6']";
    private static final String PRACTICE_FORM_BTN ="(//li[@id='item-0'])[2]";
    private static final String NAME = "//input[@id='firstName']";
    private static final String LAST_NAME = "lastName";
    private static final String EMAIL = "userEmail";
    private static final String PHONE_NUMBER = "userNumber";
    private static final String GENDER = "(//div[@class='custom-control custom-radio custom-control-inline'])[2]";
    private static final String HOBBY = "(//div[@class='custom-control custom-checkbox custom-control-inline'])[3]";
    private static final String SUBMIT = "submit";


    public QADemoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = SUBMIT)
    public WebElement submit;

    @FindBy(xpath = HOBBY)
    public WebElement hobby;

    @FindBy(xpath = GENDER)
    public WebElement gender;

    @FindBy(id = PHONE_NUMBER)
    public WebElement phoneNr;

    @FindBy(id = EMAIL)
    public WebElement email;

    @FindBy(id = LAST_NAME)
    public WebElement lastName;

    @FindBy(xpath = NAME)
    public WebElement name;

    @FindBy(xpath = PRACTICE_FORM_BTN)
    public WebElement practiceFormBtn;

    @FindBy(xpath = SELECT_ITEM_TEXT)
    public WebElement selectText;

    @FindBy(xpath = FORMS_CARD)
    public WebElement formsCard;
}
