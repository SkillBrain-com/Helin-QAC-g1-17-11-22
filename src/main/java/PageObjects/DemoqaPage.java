package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class DemoqaPage {

    // WebDriver driver=new ChromeDriver();

     private final static String BANNER_IMAGE=".banner-image";
     private final static String GO_TO_REGISTRATION ="//a[normalize-space()='Go To Registration']";

      private final static String OPTION_ROMANIA ="option[value='70']";
    // private final static String GO_TO_REGISTRATION =".btn.btn-primary.shadow.btn.block";
     private final static String WINDOW_PANEL="//h5[normalize-space()='Alerts, Frame & Windows']";
     private final static String WINDOW_BUTTON=" //span[normalize-space()='Browser Windows']";
    private  final static String NEW_TAB_BUTTON="//button[@id='tabButton']";
    private final static String PAGE_MESAGE="sampleHeading";

    private final static String ALERT_PANEL_BUTTON="(//div)[27]";
    private final static String  ALERT_BUTTON="(//li[@id='item-1'])[2]";
    private final static String  CLICKME_BUTTON_1="alertButton";

    // private final static String WINDOW_BUTTON= "//div[contains(@class,'header-text')][normalize-space()='Alerts, Frame & Windows']";
    // private final static String WINDOW_BUTTON= "(//div[@class='card mt-4 top-card'])[3]";
    private final static String  BROWSER_WINDOW_BUTTON = "(//li[@id='item-0'])[3]";
    private final static String NEWTAB = "tabButton";

    private final static String ELEMENTS_CARD="//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']";
    private final static String RADIO_BUTON="//span[normalize-space()='Radio Button']";
    private final static String  YES="//label[@for='yesRadio']";
    private final static String IMPRESIVE="//label[@for='impressiveRadio']";
    private final static String NO="//label[@for='noRadio']";

    @FindBy(xpath =ELEMENTS_CARD)
    public WebElement elemementsCard;
    @FindBy(xpath = RADIO_BUTON)
    public WebElement radioButton;
    @FindBy(xpath =YES)
    public WebElement yes;
    @FindBy(xpath =IMPRESIVE)
    public WebElement impresive;
    @FindBy(xpath =NO)
    public WebElement no;

    @FindBy(xpath =ALERT_PANEL_BUTTON)
    public WebElement alertpanelbutton;
    @FindBy(xpath =ALERT_BUTTON)
    public WebElement alertbutton;
    @FindBy(id = CLICKME_BUTTON_1)
    public WebElement clickMebutton_1;

    @FindBy(xpath = WINDOW_PANEL)
    public  WebElement windowPanel;
    @FindBy(xpath = WINDOW_BUTTON)
    public WebElement windowButton;
    @FindBy(xpath =NEW_TAB_BUTTON )
    public WebElement newtabbutton;
    @FindBy(id =PAGE_MESAGE )
    public WebElement pagemesage;

    @FindBy(css= " BANNER_IMAGE")
    public   WebElement bannerImage;
      @FindBy(xpath = "GO_TO_REGISTRATION")
    // @FindBy(css =" GO_TO_REGISTRATION")
     public   WebElement gotoregistrationButton;
      @FindBy(xpath = "OPTION_ROMANIA")
    public   WebElement optionRo;
    public HTMLInputElement clickwindowButton;
    public HTMLInputElement clickBrowserWindowButton;
    public HTMLInputElement newTabMessageButton;
    public HTMLInputElement elements;

    //  @FindBy(css=BANNER_IMAGE)
    //  public WebElement bannerImage;
      public DemoqaPage(WebDriver driver ){

        PageFactory.initElements(driver,this);

    }
}
