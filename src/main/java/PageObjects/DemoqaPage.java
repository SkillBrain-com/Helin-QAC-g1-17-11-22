package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {

    // WebDriver driver=new ChromeDriver();

    // private final static String BANNER_IMAGE=".banner-image";
    //  private final static String GO_TO_REGISTRATION ="//a[normalize-space()='Go To Registration']";

    //  private final static String OPTION_ROMANIA ="option[value='70']";
    // private final static String GO_TO_REGISTRATION =".btn.btn-primary.shadow.btn.block";
    private final static String WINDOW_PANEL="//h5[normalize-space()='Alerts, Frame & Windows']";
    private final static String WINDOW_BUTTON=" //span[normalize-space()='Browser Windows']";
    private  final static String NEW_TAB_BUTTON="//button[@id='tabButton']";
    private final static String PAGE_MESAGE="sampleHeading";

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
      public DemoqaPage(WebDriver driver ){

        PageFactory.initElements(driver,this);

    }
}
