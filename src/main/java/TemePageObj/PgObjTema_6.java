package TemePageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PgObjTema_6 {

    private static final String ALLERT_WEB_PAGE = "alerttest";
    private static final String FIRST_ALLERT_BUTTON = "alertexamples";
    // ======================================================================================================

    private static final String USERNAME_FIELD = "//input[@name='username']";
    private static final String PASSWORD_FIELD = "//input[@name='password']";
    private static final String COMMENTS_FIELD = "comments";
    private static final String FILENAME_FIELD = "//input[@name='filename']";

    private static final String CHECK_BUTTONS = "checkboxes[]";
    private static final String RADIO_BUTTONS = "radioval";
    // ========================================================================================================

    private static final String NEW_WINDOW_BUTTON = "windowButton";
    private static final String TAB_BUTTON = "tabButton";
    private static final String TEXT_NEW_TAB = "sampleHeading";
    private static final String NEW_MESSAGE_WINDOW_BUTTON = "messageWindowButton";
    private static final String WINDOW_MESSAGE = "(//body)[1]";


//    private static final String DROPDOWN = "dropdown";
//    private static final String MULTI_SELECT = "multipleselect[]";


    public PgObjTema_6(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WINDOW_MESSAGE)
    public WebElement windowMessage;
    @FindBy(id = NEW_MESSAGE_WINDOW_BUTTON)
    public WebElement newMessageWindow;
    @FindBy(id = NEW_WINDOW_BUTTON)
    public WebElement newWindow;
    @FindBy(id = TEXT_NEW_TAB)
    public WebElement textNewTab;
    @FindBy(id = TAB_BUTTON)
    public WebElement tabButton;

//================================================================================================================
    @FindBy(id = FIRST_ALLERT_BUTTON)
    public WebElement firstAllertButton;
    @FindBy(id = ALLERT_WEB_PAGE)
    public WebElement alertWebPage;
    // ======================================================================================================

//    @FindBy(name = MULTI_SELECT)
//    public Select multiSelect;
//    @FindBy(name = DROPDOWN)
//    public Select dropdown;
    @FindBy(name = RADIO_BUTTONS)
    public List<WebElement> radioButton;
    @FindBy(name = CHECK_BUTTONS)
    public List<WebElement> checkBox;
    @FindBy(xpath = USERNAME_FIELD)
    public WebElement username;
    @FindBy(xpath = PASSWORD_FIELD)
    public WebElement password;
    @FindBy(name = COMMENTS_FIELD)
    public WebElement comments;
    @FindBy(xpath = FILENAME_FIELD)
    public WebElement fileName;

}
