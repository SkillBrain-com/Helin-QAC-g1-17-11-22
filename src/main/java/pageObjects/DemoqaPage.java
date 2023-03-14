package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {

    private final static String BANNER_IMAGE = ".banner-image";
    private final static String GO_TO_REGISTRATION ="//a[normalize-space()='Go To Registration']";


    private final static String OPTION_ROMANIA ="option[value='70']";

    private final static String ALERT_PANEL = "(//div[@class='card mt-4 top-card'])[3]";

    private final static String ALERT_BUTTON = "(//li[@id='item-1'])[2]";

    private final static String  CLICK_ME_1 = "alertButton";

   // private final static String WINDOW_PANEL = "(//div[contains(@class,'header-text')][normalize-space()='Alerts, Frame & Windows'])[1]";
   private final static String WINDOW_BUTTON= "//div[contains(@class,'header-text')][normalize-space()='Alerts, Frame & Windows']";
    private final static String  BROWSER_WINDOW_BUTTON = "(//li[@id='item-0'])[3]";
    private final static String NEWTAB = "tabButton";
    private final static String MESSAGE = "sampleHeading";

    private static final String ELEMENTS_CARD = "(//div[@class='card mt-4 top-card'])[1]";
    private static final String RADIO_BUTTON = "(//span[normalize-space()='Radio Button'])[1]";
    private static final String YES_BUTTON = "label[for='yesRadio']";
    private static final String IMPRESSIVE_BUTTON = "//label[normalize-space()='Impressive']";

    @FindBy(xpath = IMPRESSIVE_BUTTON)
    public WebElement impressiveButton;
    @FindBy(css = YES_BUTTON)
    public WebElement yesButton;
    @FindBy(xpath = RADIO_BUTTON)
    public WebElement radioButton;
    @FindBy(xpath = ELEMENTS_CARD)
    public WebElement elementCard;

    @FindBy(css=BANNER_IMAGE)
    public WebElement bannerImage;

    @FindBy(xpath=GO_TO_REGISTRATION)
   // @FindBy(css=GO_TO_REGISTRATION)
    public WebElement registrationButton;
    @FindBy(css=OPTION_ROMANIA)
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

    @FindBy(id = MESSAGE)
    public WebElement messageBrowser;
    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
