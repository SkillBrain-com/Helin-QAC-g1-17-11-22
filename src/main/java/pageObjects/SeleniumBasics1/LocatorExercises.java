package pageObjects.SeleniumBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorExercises {

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

    public LocatorExercises (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
