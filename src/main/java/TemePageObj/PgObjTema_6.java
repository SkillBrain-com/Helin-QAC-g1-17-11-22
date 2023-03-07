package TemePageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PgObjTema_6 {

    private static final String ALLERT_WEB_PAGE = "alerttest";
    private static final String FIRST_ALLERT_BUTTON = "alertexamples";
    // ======================================================================================================

    private static final String USERNAME_FIELD = "//input[@name='username']";
    private static final String PASSWORD_FIELD = "//input[@name='password']";
    private static final String COMMENTS_FIELD = "comments";
    private static final String FILENAME_FIELD = "//input[@name='filename']";

    private static final String CHECK_BUTTONS = "checkboxes[]";
    private static final String RADIO_BUTTONS = "radioval";

//    private static final String DROPDOWN = "dropdown";
//    private static final String MULTI_SELECT = "multipleselect[]";


    public PgObjTema_6(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = FIRST_ALLERT_BUTTON)
    public WebElement firstAllertButton;
    @FindBy(id = ALLERT_WEB_PAGE)
    public WebElement alertWebPage;
    // ======================================================================================================

//    @FindBy(name = MULTI_SELECT)
//    public Select multiSelect;
//    @FindBy(name = DROPDOWN)
//    public Select dropdown;
    @FindBy(name = RADIO_BUTTONS)
    public List<WebElement> radioButton;
    @FindBy(name = CHECK_BUTTONS)
    public List<WebElement> checkBox;
    @FindBy(xpath = USERNAME_FIELD)
    public WebElement username;
    @FindBy(xpath = PASSWORD_FIELD)
    public WebElement password;
    @FindBy(name = COMMENTS_FIELD)
    public WebElement comments;
    @FindBy(xpath = FILENAME_FIELD)
    public WebElement fileName;

}
