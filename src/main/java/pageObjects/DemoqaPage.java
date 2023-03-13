package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {
    private final static String WINDOW_BUTTON="//span[normalize-space()='Browser Windows']";
    @FindBy(xpath = WINDOW_BUTTON)
    public WebElement windowButton;
    private final static String WINDOW_PANEL="//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[3]";
    @FindBy(xpath = WINDOW_PANEL)
    public WebElement windowPanel;
    private final static String OPTION_ROMANIA = "option[value='70']";
    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRO;
    private final static String ALERT_PANEL = "(//div[@class='card mt-4 top-card'])[3]";
    @FindBy(xpath = ALERT_PANEL)
    public WebElement alertPanelButton;
    private final static String ALERT_BUTTON = "(//li[@id='item-1'])[2]";
    @FindBy(xpath = ALERT_BUTTON)
    public WebElement alertButton;
    private final static String BANNER_IMAGE = ".banner-image";
    @FindBy(css = BANNER_IMAGE)
    public WebElement bannerImage;
    private final static String GO_TO_REGISTRATION = "//a[normalize-space()='Go To Registration']";
    @FindBy(xpath = GO_TO_REGISTRATION)
    public WebElement goToRegistrationButton;
    private final static String CLICK_ME_FIRST="alertButton";
    @FindBy(id=CLICK_ME_FIRST)
    public WebElement clickMeFirst;

    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}