package TemePageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgObjTema_5 {

    private static final String EXPLANATION_HOME_PAGE = "//div[@class='explanation'][1]";
    private static final String BASIC_WEB_PAGE = "basicpagetest";
    private static final String A_PARAGRAPH_TEXT = "para1";
    private static final String ANOTHER_PARGRAPH_TEXT = "para2";
    private static final String ELEMENT_ATTRIBUTE = "elementattributestest";
    private static final String LOCATORS_FIND_BY = "findbytest";
    private static final String ATTRIBUTE_PARAGRAPH = ".class-attribute";
    private static final String DYNAMIC_BUTTON = "jsattributes";
    private static final String INDEX_BUTTON = "//a[@href='index.html']";
    private static final String PARAGRAPH_P3 = "p3";
    private static final String JUMP_TO_PARAGRAPH = "//a[@href='#pName7']";
    private static final String TABLE_WE_PAGE = "tablestest";
    private static final String TABLE_INFO = "caption";
    private static final String TABLE = "mytable";
    private static final String ALEISTER = "(//tr)[3]";


    public PgObjTema_5(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ALEISTER)
    public WebElement aleisterInfo;
    @FindBy(id = TABLE)
    public WebElement myTable;
    @FindBy(tagName = TABLE_INFO)
    public WebElement tableInformation;
    @FindBy(id = TABLE_WE_PAGE)
    public WebElement tableWebPage;
    @FindBy(xpath = JUMP_TO_PARAGRAPH)
    public WebElement jumpToParagraph;
    @FindBy(id = PARAGRAPH_P3)
    public WebElement paragraphP3;
    @FindBy(xpath = INDEX_BUTTON)
    public WebElement indexButton;
    @FindBy(id = DYNAMIC_BUTTON)
    public WebElement dynamicButton;
    @FindBy(css = ATTRIBUTE_PARAGRAPH)
    public WebElement attributeParagraph;
    @FindBy(id = ELEMENT_ATTRIBUTE)
    public WebElement elementAttribute;
    @FindBy(id = LOCATORS_FIND_BY)
    public WebElement locatorsFindBy;
    @FindBy(id = A_PARAGRAPH_TEXT)
    public WebElement aParagraphText;
    @FindBy(id = ANOTHER_PARGRAPH_TEXT)
    public WebElement anotherParagraphText;
    @FindBy(id = BASIC_WEB_PAGE)
    public WebElement basicWebPage;
    @FindBy(xpath = EXPLANATION_HOME_PAGE)
    public WebElement explanationHomePage;



}
