package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {

    private final static String BANNER_IMAGE = ".banner-image";
    private final static String GO_TO_REGISTRATION = "//a[normalize-space()='Go To Registration']";

    private final static String OPTION_ROMANIA = "option[value='70']";

    private final static String ALERT_PANEL = "(//div[@class='card mt-4 top-card'])[3]";

    private final static String ALERT_BUTTON = "(//li[@id='item-1'])[2]";

    private final static String CLICK_ME_1 = "alertButton";

    // private final static String WINDOW_PANEL = "(//div[contains(@class,'header-text')][normalize-space()='Alerts, Frame & Windows'])[1]";
    private final static String WINDOW_BUTTON = "(//div[@class='card mt-4 top-card'])[3]";
    private final static String BROWSER_WINDOW_BUTTON = "(//li[@id='item-0'])[3]";
    private final static String NEWTAB = "tabButton";
    private final static String MESSAGE = "//h1[@id='sampleHeading']";

    private final static String NEW_TAB_MESSAGE = "messageWindowButton";
    private final static String ELEMENT_CARD = "(//div[@class='card mt-4 top-card'])[1]";
    private final static String RADIO_BUTTON = "(//li[@id='item-2'])[1]";
    private final static String HEADER_RADIO_BUTTON = "(//div[@class='main-header'])[1]";
    private final static String YES_BUTTON = "//label[normalize-space()='Yes']";
    private final static String IMPRESSIVE_BUTTON = "//label[normalize-space()='Impressive']";

    // TEXT BOX variables declaration and initialization
    private final static String TEXT_BOX = "(//li[@id='item-0'])[1]";
    @FindBy(xpath = TEXT_BOX)
    public WebElement textBox;
    private final static String FULL_NAME = "userName";
    @FindBy(id = FULL_NAME)
    public WebElement fullName;
    private final static String EMAIL = "userEmail";
    @FindBy(id = EMAIL)
    public WebElement email;
    private final static String CURRENT_ADDRESS = "currentAddress";
    @FindBy(id = CURRENT_ADDRESS)
    public WebElement currentAddress;
    private final static String PERMANENT_ADDRESS = "//textarea[@id='permanentAddress']";
    @FindBy(xpath = PERMANENT_ADDRESS)
    public WebElement permanentAddress;
    private final static String SUBMIT_BUTTON = "//button[@id='submit']";
    @FindBy(xpath = SUBMIT_BUTTON)
    public WebElement submitButton;
    private final static String OUTPUT_AFTER_SUMMIT = "//div[@id='output']";
    @FindBy(xpath = OUTPUT_AFTER_SUMMIT)
    public WebElement outputAfterSummit;
    // end of TEXT BOX variables declaration and initialization

    // CHECK BOX variables declaration and initialization
    private final static String CHECK_BOX = "(//li[@id='item-1'])[1]";
    @FindBy(xpath = CHECK_BOX)
    public WebElement checkBox;
    private final static String TOOGLE_BUTTON = "(//button[@title='Toggle'])[1]";
    @FindBy(xpath = TOOGLE_BUTTON)
    public WebElement toogleButton;
    private final static String DOWNLOADS_CHECK_BOX = "//label[@for='tree-node-downloads']" +
            "//span[@class='rct-checkbox']//*[name()='svg']";
    @FindBy(xpath = DOWNLOADS_CHECK_BOX)
    public WebElement downloadsCheckBox;
    private final static String DISPLAY_RESULT = "//div[@id='result']";
    @FindBy(xpath = DISPLAY_RESULT)
    public WebElement displayResult;
    // end of CHECK BOX variables declaration and initialization

    // WEB TABLES variables declaration and initialization
    private final static String WEB_TABLES = "(//li[@id='item-3'])[1]";
    @FindBy(xpath = WEB_TABLES)
    public WebElement webTables;
    private final static String ADD_BUTTON = "addNewRecordButton";
    @FindBy(id = ADD_BUTTON)
    public WebElement addButton;
    // end of WEB TABLES variables declaration and initialization

    // Buttons variables declaration and initialization
    private final static String BUTTONS = "(//li[@id='item-4'])[1]";
    @FindBy(xpath = BUTTONS)
    public WebElement buttons;
    private final static String DOUBLE_CLICK_BUTTON = "doubleClickBtn";
    @FindBy(id = DOUBLE_CLICK_BUTTON)
    public WebElement doubleClickButton;
    private final static String RIGHT_CLICK_BUTTON = "rightClickBtn";
    @FindBy(id = RIGHT_CLICK_BUTTON)
    public WebElement rightClickButton;
    private final static String CLICK_ME_BUTTON = "(//button[normalize-space()='Click Me'])[1]";
    @FindBy(xpath = CLICK_ME_BUTTON)
    public WebElement clickMeButton;
    private final static String DOUBLE_CLICK_MESSAGE = "doubleClickMessage";
    @FindBy(id = DOUBLE_CLICK_MESSAGE)
    public WebElement doubleClickMessage;
    private final static String RIGHT_CLICK_MESSAGE = "rightClickMessage";
    @FindBy(id = RIGHT_CLICK_MESSAGE)
    public WebElement rightClickMessage;
    private final static String CLICK_ME_MESSAGE = "dynamicClickMessage";
    @FindBy(id = CLICK_ME_MESSAGE)
    public WebElement clickMeMessage;
    // end of Buttons variables declaration and initialization

    // LINKS variables declaration and initialization
    private final static String LINKS = "(//li[@id='item-5'])[1]";
    @FindBy(xpath = LINKS)
    public WebElement links;
    private final static String HOME_LINK = "simpleLink";
    @FindBy(id = HOME_LINK)
    public WebElement homeLink;
    private final static String CREATED_LINK = "(//a[normalize-space()='Created'])[1]";
    @FindBy(xpath = CREATED_LINK)
    public WebElement createdLink;
    private final static String NO_CONTENT_LINK = "no-content";
    @FindBy(id = NO_CONTENT_LINK)
    public WebElement noContentLink;
    private final static String MOVED_LINK = "moved";
    @FindBy(id = MOVED_LINK)
    public WebElement movedLink;
    private final static String BAD_REQUEST_LINK = "bad-request";
    @FindBy(id = BAD_REQUEST_LINK)
    public WebElement badRequestLink;
    private final static String UNAUTHORIZED_LINK = "unauthorized";
    @FindBy(id = UNAUTHORIZED_LINK)
    public WebElement unauthorizedLink;
    private final static String FORBIDDEN_LINK = "forbidden";
    @FindBy(id = FORBIDDEN_LINK)
    public WebElement forbiddenLink;
    private final static String INVALID_LINK = "invalid-url";
    @FindBy(id = INVALID_LINK)
    public WebElement invalidLink;
    // end of LINKS variables declaration and initialization

    // Windos link variables declaration and initialization
    private final static String WINDOWS_NEW_TAB= "tabButton";
    @FindBy(id = WINDOWS_NEW_TAB)
    public WebElement windowsNewTab;
    private final static String WINDOWS_NEW_WINDOW = "windowButton";
    @FindBy(id = WINDOWS_NEW_WINDOW)
    public WebElement windowsNewWindow;
    private final static String WINDOW_MESSAGE_BUTTON = "messageWindowButton";
    @FindBy(id = WINDOW_MESSAGE_BUTTON)
    public WebElement windowMessageButton;
    private final static String MESSAGE_FROM_WINDOW_MS_BT = "body";
    @FindBy(tagName = MESSAGE_FROM_WINDOW_MS_BT)
    public WebElement messageFromWindowMsBt;
    // end of Windos link variables declaration and initialization


    @FindBy(xpath = IMPRESSIVE_BUTTON)
    public WebElement impressiveButton;
    @FindBy(xpath = YES_BUTTON)
    public WebElement yesButton;

    @FindBy(xpath = HEADER_RADIO_BUTTON)
    public WebElement headerRadioButton;

    @FindBy(xpath = RADIO_BUTTON)
    public WebElement radioButton;

    @FindBy(xpath = ELEMENT_CARD)
    public WebElement elementCard;

    @FindBy(css = BANNER_IMAGE)
    public WebElement bannerImage;

    @FindBy(xpath = GO_TO_REGISTRATION)
    // @FindBy(css=GO_TO_REGISTRATION)
    public WebElement goToRegistrationButton;
    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRO;

    @FindBy(xpath = ALERT_PANEL)
    public WebElement alertPanelButton;

    @FindBy(xpath = ALERT_BUTTON)
    public WebElement alertButton;
    @FindBy(id = CLICK_ME_1)
    public WebElement clickMeButton_1;
    //    @FindBy(xpath = WINDOW_PANEL)
//    public WebElement clickMeButton_1;
    @FindBy(xpath = WINDOW_BUTTON)
    public WebElement clickWindowButton;

    @FindBy(xpath = BROWSER_WINDOW_BUTTON)
    public WebElement clickBrowserWindowButton;
    @FindBy(id = NEWTAB)
    public WebElement newTabButton;

    @FindBy(xpath = MESSAGE)
    public WebElement messageBrowser;

    @FindBy(id = NEW_TAB_MESSAGE)
    public WebElement newTabMessageButton;

    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}