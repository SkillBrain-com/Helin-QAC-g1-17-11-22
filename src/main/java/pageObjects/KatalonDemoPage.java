package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KatalonDemoPage {
    public String APP_URL = "https://katalon-demo-cura.herokuapp.com/";
    private final static String MAKE_APPOINTMENT_BTN = "btn-make-appointment";
    private final static String MENU_TOGGLE = "menu-toggle";
    private final static String HEALTHCARE_LINK ="//a[normalize-space()='CURA Healthcare']";
    private final static String HOME = "//a[normalize-space()='Home']";
    private final static String LOGIN_MENU = "//a[normalize-space()='Login']";
    private final static String FORM = "form";

    private final static String USERNAME = "txt-username";
    private final static String PASSWORD = "txt-password";
    private final static String LOGIN_BUTTON_FORM = "btn-login";
    private final static String LOGIN_ERROR_MESSAGE = "//p[@class='lead text-danger']";
    private final static String FACILITY_DROPDOWN = "combo_facility";
    private final static String SELECT_FACILITY_TOKYO = "option[value='Tokyo CURA Healthcare Center']";
    private final static String SELECT_FACILITY_HONGKONG = "//option[@value='Hongkong CURA Healthcare Center']";
    private final static String SELECT_COMBO_FACILITY_SEOUL = "//option[@value='Seoul CURA Healthcare Center']";
    private final static String CHECKBOX_HOSPITAL_READMISSION = "chk_hospotal_readmission";
    private final static String RADIO_PROGRAM_MEDICARE = "radio_program_medicare";
    private final static String RADIO_PROGRAM_MEDICAID = "radio_program_medicaid";
    private final static String RADIO_PROGRAM_NONE = "radio_program_none";
    private final static String DATE_PICKER_VISIT_DATE = "txt_visit_date";
    private final static String DAY_28 = "//td[@class='day'][normalize-space()='28']";
    private final static String APPOINTMENT_TXT_COMMENT = "txt_comment";
    private final static String BOOK_APPOINTMENT_BTN = "btn-book-appointment";
    private final static String APPOINTMENT_CONFIRMATION = "//section[@id='summary']//div[@class='row']";
    private final static String GO_TO_HOMEPAGE = "//a[normalize-space()='Go to Homepage']";
    private final static String LOGOUT_MENU = "//a[@href='authenticate.php?logout']";
    private final static String LOGOUT_BTN = "(//a[@class='btn btn-default'])[1]";
    private final static String SUMMARY = "summary";

    @FindBy(id = SUMMARY)
    public WebElement summary;
    @FindBy(xpath = LOGOUT_BTN)
    public WebElement logoutBtn;
    @FindBy(xpath = LOGOUT_MENU)
    public WebElement logoutMenu;
    @FindBy(xpath = GO_TO_HOMEPAGE)
    public WebElement goToHomepage;
    @FindBy(xpath = APPOINTMENT_CONFIRMATION)
    public WebElement appointmentConfirmation;
    @FindBy(id = BOOK_APPOINTMENT_BTN)
    public WebElement bookAppointmentBtn;
    @FindBy(id = APPOINTMENT_TXT_COMMENT)
    public WebElement appointmentTxtComment;
    @FindBy(xpath = DAY_28)
    public WebElement day28;
    @FindBy(id = DATE_PICKER_VISIT_DATE)
    public WebElement datePickerVisitDate;
    @FindBy(xpath = SELECT_FACILITY_HONGKONG)
    public WebElement selectComboFacilityHongkong;
    @FindBy(xpath = SELECT_COMBO_FACILITY_SEOUL)
    public WebElement selectComboFacilitySeoul;
    @FindBy(xpath = SELECT_FACILITY_TOKYO)
    public WebElement selectComboFacilityTokyo;
    @FindBy(id = RADIO_PROGRAM_NONE)
    public WebElement radioProgramNone;
    @FindBy(id = RADIO_PROGRAM_MEDICAID)
    public WebElement radioProgramMedicaid;
    @FindBy(id = RADIO_PROGRAM_MEDICARE)
    public WebElement radioProgramMedicare;
    @FindBy(id = CHECKBOX_HOSPITAL_READMISSION)
    public WebElement checkboxHospitalReadmission;
    @FindBy(id = FACILITY_DROPDOWN)
    public WebElement facilityDropdown;
    @FindBy(xpath = LOGIN_ERROR_MESSAGE)
    public WebElement loginErrorMessage;
    @FindBy(id = LOGIN_BUTTON_FORM)
    public WebElement loginButtonForm;
    @FindBy(id = PASSWORD)
    public WebElement password;
    @FindBy(id = USERNAME)
    public WebElement userName;
    @FindBy(tagName = FORM)
    public WebElement form;
    @FindBy(xpath = HEALTHCARE_LINK)
    public WebElement healthcareLink;
    @FindBy(xpath = LOGIN_MENU)
    public WebElement loginMenu;
    @FindBy(xpath = HOME)
    public WebElement home;
    @FindBy(id = MENU_TOGGLE)
    public WebElement menuToggle;
    @FindBy(id = MAKE_APPOINTMENT_BTN)
    public WebElement makeAppointmentBtn;


    // login method for login page object
    public void login (String username, String password) {
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        loginButtonForm.click();
    }



    public KatalonDemoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
