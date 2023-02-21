package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmagHomePage {

    private static final String ACCEPT_BUTTON = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private static final String  CLOSE_OFERTA_ZILEI = "(//i[@class='em em-close'])[1]";
    private static final String CLOSE_CONT = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";

    private static final String INTRARE_IN_CONT_BUTTON= "//a[@class='font-size-ms strong login-btn btn btn-primary js-login-btn']";
    private static final String USERNAME = "//input[@id='user_login_email']";
    private static final String PASSWORD = "//input[@id='user_login_password']";
    private static final String CONTINUA_BUTTON = "//button[@id='user_login_continue']";

   public EmagHomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = USERNAME)
    public WebElement username;
   @FindBy(xpath = CONTINUA_BUTTON)
   public  WebElement continuaButton;

   @FindBy(xpath = PASSWORD)
   public WebElement password;

    @FindBy(xpath = INTRARE_IN_CONT_BUTTON)
    public WebElement intraInCont;
    @FindBy(css=ACCEPT_BUTTON)
    public WebElement acceptButton;

    @FindBy(css=GDPR_FOOTER)
    public WebElement gdprFooter;

    @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZilei;

    @FindBy(css=CLOSE_CONT)
    public WebElement closeCont;

}
