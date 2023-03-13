package pageObjects.SeleniumBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuApp {

    // variable for basic web page
    private final static String BASIC_WEB_PAGE_EXAMPLE = "#basicpagetest";
    private final static String BASIC_WEB_PAGE_EXAMPLE_HEADER = "div[class='page-body'] h1";
    private final static String BASIC_WEB_PAGE_EXAMPLE_PARAGRAPH2 = "#para2";

    // variable for element attributes examples
    private final static String ELEMENT_ATTRIBUTES_EXAMPLE = "elementattributestest";
    private final static String STYLED_CLICK_BUTTON = ".styled-click-button";
    private final static String PARAGRAPH_DYNAMIC_ATTRIBUTE_= "//p[@id='jsattributes']";

    // variable for locators test page
    private final static String LOCATORS_TEST_PAGE = "//a[@id='findbytest']";
    private final static String O_PARAGRAPH_TEXT = "//p[@id='p15']";
    private final static String PARAGRAPH_NAME38 = "p38";
    private final static String JUMP_TO_P15 = "(//a[normalize-space()='jump to para 15'])[1]";

    // variable for HTML Tag Examples
    private final static String HTML_TAG_EXAMPLES = "//body/div[@class='page-body']/ul[1]/li[4]";
    private final static String TABLE_TEST_PAGE = "#tablestest";
    private final static String TABLE_TEST_INFORMATION = "//div[@class='centered']";
    // END OF HTML TAG EXAMPLES VARIABLES

    // variable for Dynamic HTML TABLE Tag
    private final static String DYNAMIC_TABLE_Page= "dynamictablestest";
    private final static String TABLE_CAPTION = "#tablehere table caption";
    private final static String TABLE = "#tablehere table";
    private final static String SUMMARY = "summary";
    private final static String CAPTION = "caption";
    private final static String TABLE_ID = "//input[@id='tableid']";
    private final static String JSON_DATA = "//textarea[@id='jsondata']";
    private final static String REFRESH_TABLE = "//button[@id='refreshtable']";
    // END OF DYNAMIC HTML TABLE TAG VARIABLES

    // varaible for alert test page
    private final static String ALERT_TEST_PAGE = "//a[@id='alerttest']";
    @FindBy(xpath = ALERT_TEST_PAGE)
    public WebElement alertTestPage;
    private final static String ALERT_BUTTON = "#alertexamples";
    @FindBy(css = ALERT_BUTTON)
    public WebElement alertButton;
    private final static String ALERT_BUTTON_CONFIRM = "confirmexample";
    @FindBy(id = ALERT_BUTTON_CONFIRM)
    public WebElement alertButtonConfirm;
    private final static String ALERT_BUTTON_PROMPT = "promptexample";
    @FindBy(id = ALERT_BUTTON_PROMPT)
    public WebElement alertButtonPrompt;
    // END OF ALERT TEST PAGE VARIABLES

    // variable for form test page
    private final static String FORM_TEST_PAGE =" //a[@id='htmlformtest']";
    @FindBy(xpath = FORM_TEST_PAGE)
    public WebElement formTestPage;
    private final static String INPUT_USERNAME_FORM = "//input[@name='username']";
    @FindBy(xpath = INPUT_USERNAME_FORM)
    public WebElement inputUsernameForm;
    private final static String INPUT_PASSWORD_FORM = "//input[@name='password']";
    @FindBy(xpath = INPUT_PASSWORD_FORM)
    public WebElement inputPasswordForm;
    private final static String INPUT_TEXTAREA_FORM = "//textarea[@name='comments']";
    @FindBy(xpath = INPUT_TEXTAREA_FORM)
    public WebElement inputTextareaForm;
    private final static String INPUT_CHECKBOX_CD1 = "//input[@value='cb1']";
    @FindBy(xpath = INPUT_CHECKBOX_CD1)
    public WebElement inputCheckboxCd1;
    private final static String RADIO_BUTTON_RD3 = "input[value='rd3']";
    @FindBy(css = RADIO_BUTTON_RD3)
    public WebElement radioButtonRd3;
    private final static String OPTION_MS2 = "//option[@value='ms2']";
    @FindBy(xpath = OPTION_MS2)
    public WebElement optionMs2;
    private final static String DROPDOWN_OPTIONS = "//select[@name='dropdown']";
    @FindBy(xpath = DROPDOWN_OPTIONS)
    public WebElement dropdownOptions;
    private final static String DROPDOWN_DD4 = "//option[@value='dd4']";
    @FindBy(xpath = DROPDOWN_DD4)
    public WebElement dropdownDd4;
    private final static String SUBMIT_BUTTON_FORM = "//input[@type='submit']";
    @FindBy(xpath = SUBMIT_BUTTON_FORM)
    public WebElement submitButtonForm;
    private final static String RESET_BUTTON_FORM = "//input[@value='cancel']";
    @FindBy(xpath = RESET_BUTTON_FORM)
    public WebElement resetButtonForm;
    private final static String FORM_RESULT = "//div[@class='centered form-results']";
    @FindBy(xpath = FORM_RESULT)
    public WebElement formResult;
    private final static String BACK_TO_FORM_BUTTON = "back_to_form";
    @FindBy(id = BACK_TO_FORM_BUTTON)
    public WebElement backToFormButton;
    // END OF FORM TEST PAGE VARIABLES

    @FindBy(xpath = REFRESH_TABLE)
    public WebElement refreshTable;
    @FindBy(xpath = JSON_DATA)
    public WebElement jsonData;

    @FindBy(xpath = TABLE_ID)
    public WebElement tableId;
    @FindBy(id = CAPTION)
    public WebElement caption;
    @FindBy(tagName = SUMMARY)
    public WebElement summary;
    @FindBy(css = TABLE)
    public WebElement table;
    @FindBy(css = TABLE_CAPTION)
    public WebElement tableCaption;

    @FindBy(id = DYNAMIC_TABLE_Page)
    public WebElement dynamicTablePage;
    @FindBy(xpath = TABLE_TEST_INFORMATION)
    public WebElement tableTestInformation;

    @FindBy(css = TABLE_TEST_PAGE)
    public WebElement tableTestPage;
    @FindBy(xpath = HTML_TAG_EXAMPLES)
    public WebElement htmlTagExamples;

    @FindBy(xpath = JUMP_TO_P15)
    public WebElement jumpToP15;

    @FindBy(id = PARAGRAPH_NAME38)
    public WebElement paragraphName38;

    @FindBy(xpath = O_PARAGRAPH_TEXT)
    public WebElement oParagraphText;

    @FindBy(xpath = LOCATORS_TEST_PAGE)
    public WebElement locatorsTestPage;

    @FindBy(xpath = PARAGRAPH_DYNAMIC_ATTRIBUTE_)
    public WebElement paragraphDynamicAttribute;

    @FindBy(css = STYLED_CLICK_BUTTON)
    public WebElement styledClickButton;
    @FindBy(id = ELEMENT_ATTRIBUTES_EXAMPLE)
    public WebElement elementAttributesExample;
    @FindBy(css = BASIC_WEB_PAGE_EXAMPLE_PARAGRAPH2)
    public WebElement basicWebPageExampleParagraph2;
    @FindBy(css = BASIC_WEB_PAGE_EXAMPLE_HEADER)
    public WebElement basicWebPageExampleHeader;

    @FindBy(css = BASIC_WEB_PAGE_EXAMPLE)
    public WebElement basicWebPageExample;

    public HerokuApp(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
