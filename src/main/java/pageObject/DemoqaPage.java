package pageObject;

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
    private final static String CLIC_KME_1 = "alertButton";
    private final static String WINDOW_PANEL = "//h5[normalize-space()='Alerts, Frame & Windows']";
    private static final String WINDOW_BUTTON = "//span[normalize-space()='Browser Windows']";
    private static final String NEW_TAB_BUTTON = "//button[@id='tabButton']";
    private static final String PAGE_MESSAGE = "sampleHeading";

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
    @FindBy(id = PAGE_MESSAGE)
    public WebElement pageMessage;
    @FindBy(xpath = NEW_TAB_BUTTON)
    public WebElement newTabButton;
    @FindBy(xpath = WINDOW_BUTTON)
    public WebElement windowButton;

    @FindBy(xpath = WINDOW_PANEL)
    public WebElement windowPanelButton;
    @FindBy(id = CLIC_KME_1)
    public WebElement clickMeButton_1;

    @FindBy(xpath = ALERT_BUTTON)
    public WebElement alertButton;
    @FindBy(xpath = ALERT_PANEL)
    public WebElement alertPanelButton;

    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRomania;
    @FindBy(css = BANNER_IMAGE)
    public WebElement bannerImage;
    @FindBy(css = GO_TO_REGISTRATION)
    public WebElement goToRegistrationButton;

    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
