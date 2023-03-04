package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class DemoqaPage {
    private final static String BANNER_IMAGE = "//img[@alt='Selenium Online Training']";
    private final static String GO_TO_REGISTRATION = "//a[normalize-space()='Go To Registration']";
    private final static String FIRST_NAME = "first-name";
    private final static String LAST_NAME = "last-name";
    private final static String EMAIL = "//input[@id='email']";
    private final static String MOBILE = "mobile";
    private final static String OPTION_ROMANIA = "option[value='70']";
    private final static String CITY = "city";
    private final static String MESSAGE = "message";
    private final static String SEND = "//button[normalize-space()='Send']";


    @FindBy(xpath = BANNER_IMAGE)
    public WebElement bannerImage;
    @FindBy(xpath = GO_TO_REGISTRATION)
    public WebElement goToRegistrationButton;
    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRO;
    @FindBy(id = FIRST_NAME)
    public WebElement firstName;
    @FindBy(id = LAST_NAME)
    public WebElement lastName;
    @FindBy(xpath = EMAIL)
    public WebElement email;
    @FindBy(id = MOBILE)
    public WebElement mobile;
    @FindBy(id = CITY)
    public WebElement city;
    @FindBy(id = MESSAGE)
    public WebElement message;
    @FindBy(xpath = SEND)
    public WebElement send;
    public HTMLInputElement registrationButton;


    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

