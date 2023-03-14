package TemePageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgObjTema_7 {

    private static final String MENU_BUTTON = "menu-toggle";
    private static final String LOGIN = "//a[@href='profile.php#login']";
    private static final String USERNAME = "txt-username";
    private static final String PASSWORD = "txt-password";
    private static final String LOGIN_BUTTON = "btn-login";
    private static final String FAIL_LOGIN = ".lead.text-danger";
     //====================================================================================
    private static final String MAKE_AN_APPOIMENT_BUTTON = "btn-make-appointment";
    private static final String APPIOMENT_FIELD = "appointment";

    // ====================================================================================
    private static final String FACILITY = "combo_facility";
    private static final String HEALTH_CARE_RADIO_BUTTON = ".radio-inline";
    private static final String CALENDAR = ".datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-top";
    private static final String VISIT_DATE = "txt_visit_date";
    private static final String COMMENT = "txt_comment";
    private static final String BOOK_APPOIMENT_BUTTON = "btn-book-appointment";
    private static final String SUMMARY = "summary";
    private static final String HOME_BTN = "//a[normalize-space()='Home']";
    private static final String LOGOUT_BTN = "//a[normalize-space()='Logout']";

    public PgObjTema_7 (WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = LOGOUT_BTN)
    public WebElement logoutButton;
    @FindBy(xpath = HOME_BTN)
    public WebElement homeButton;

    @FindBy(id = SUMMARY)
    public WebElement sumarry;
    @FindBy(id =BOOK_APPOIMENT_BUTTON)
    public WebElement bookApoimentBtn;
    @FindBy(id = COMMENT)
    public WebElement comment;
    @FindBy(id = VISIT_DATE)
    public WebElement visitDate;
    @FindBy(css = CALENDAR)
    public WebElement calendar;
    @FindBy(css = HEALTH_CARE_RADIO_BUTTON)
    public WebElement healthCareButton;
    @FindBy(id = FACILITY)
    public WebElement facility;

    // ===================================================================================
    @FindBy(id = APPIOMENT_FIELD)
    public WebElement fieldAppoiment;
    @FindBy(id = MAKE_AN_APPOIMENT_BUTTON)
    public WebElement appoimentButton;

    // ====================================================================================
    @FindBy(css = FAIL_LOGIN)
    public WebElement failLogin;
    @FindBy(id = LOGIN_BUTTON)
    public WebElement loginButton;
    @FindBy(id = PASSWORD)
    public WebElement password;
    @FindBy(id = USERNAME)
    public WebElement userName;
    @FindBy(xpath = LOGIN)
    public WebElement login;
    @FindBy(id = MENU_BUTTON)
    public WebElement menuButton;

}
