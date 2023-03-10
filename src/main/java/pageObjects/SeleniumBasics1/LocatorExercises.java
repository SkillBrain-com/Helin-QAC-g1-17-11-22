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
