package TemePageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PgObjTema_8 {
    public PgObjTema_8 (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    private static final String CATEGORY_DROPDOWN = "combo1";
    private static final String CATEGORY_ELEMENT = "option";
    private static final String LANGUAGE_DROPDOWN = "combo2";
    private static final String LANGUAGE_ELEMENT = "//option[@value='23']";
    private static final String CODE_IN_IT_BUTTON = "(//input[@name='submitbutton'])[1]";
    private static final String VALUE_ID_CATEGORY = "_valueid";
    private static final String VALUE_ID_LANGUAGE = "_valuelanguage_id";

    //==========================================================================
    private static final String FIVE_SECONDS_DELAY = "delaygotobasic";
    private static final String TWO_SECONDS_DELAY = "delaygotobounce";
    private static final String REDIRECT_LANDING_PAGE = "h1";
    private static final String GO_BACK_BTTN = "goback";
    //==========================================================================

    private static final String TIMESTAMP = "h1";
    private static final String REFRESH_DATE = "refreshdate";
    //==========================================================================

    private static final String START_BUTTON = "button00";
    private static final String ONE_BUTTON = "button01";
    private static final String TWO_BUTTON = "button02";
    private static final String THREE_BUTTON = "button03";
    private static final String BUTTON_MSG = "buttonmessage";

    //==========================================================================


    @FindBy(id = CATEGORY_DROPDOWN)
    public WebElement categoryDropdown;
    @FindBy(tagName = CATEGORY_ELEMENT)
    public List<WebElement> categoryElement;
    @FindBy(id = LANGUAGE_DROPDOWN)
    public WebElement languageDropdown;
    @FindBy(xpath = LANGUAGE_ELEMENT)
    public WebElement languageElement;
    @FindBy(xpath = CODE_IN_IT_BUTTON)
    public WebElement codeInItBtn;
    @FindBy(id = VALUE_ID_CATEGORY)
    public WebElement valueIdCategory;
    @FindBy(id = VALUE_ID_LANGUAGE)
    public WebElement valueIdLanguage;

    //==========================================================================
    @FindBy(id = GO_BACK_BTTN)
    public WebElement goBackButton;
    @FindBy(id = FIVE_SECONDS_DELAY)
    public WebElement fiveSecondsDelayBtn;
    @FindBy(id = TWO_SECONDS_DELAY)
    public WebElement twoSecondsDelayBtn;
    @FindBy(tagName = REDIRECT_LANDING_PAGE)
    public WebElement redirectLandingPageTxt;
    //===========================================================================
    @FindBy(tagName = TIMESTAMP)
    public WebElement timestamp;
    @FindBy(id = REFRESH_DATE)
    public WebElement refreshDate;
    //===========================================================================

    @FindBy(id = START_BUTTON)
    public WebElement startBtn;
    @FindBy(id = ONE_BUTTON)
    public WebElement firstBtn;
    @FindBy(id = TWO_BUTTON)
    public WebElement secondBtn;
    @FindBy(id = THREE_BUTTON)
    public WebElement thirsBtn;
    @FindBy(id = BUTTON_MSG)
    public WebElement buttonsMsg;

}
