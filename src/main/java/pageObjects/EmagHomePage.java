package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

    private static final String ACCEPT_BUTTON = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private static final String CLOSE_OFERTA_ZILEI = "//button[@class='close']";
    private static final String INTRARE_CONT_BANNER= ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.login-view.login-view-ro.show";

    private static final String BANNER_CLOSE_BUTTON = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
    private static final String LOGIN_CONT = ".font-size-ms.strong.login-btn.btn.btn-primary.js-login-btn";
    private static final String EMAG_LOGO = "//a[@class='d-inline-block']";
    private static final String SALUT_MSG = "//div[@class='auth-panel-header']";
    private static final String ENTER_EMAIL = "//label[@class='required']";
    private static final String EMAIL_BOX = "user_login_email";
    private static final String LOGIN_CONTINUE = "user_login_continue";
    public EmagHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = LOGIN_CONTINUE)
    public WebElement loginContinue;

    @FindBy(id = EMAIL_BOX)
    public WebElement emailField;

    @FindBy(xpath = ENTER_EMAIL)
    public WebElement enterEmail;

    @FindBy(xpath = SALUT_MSG)
    public WebElement salutMsg;

    @FindBy(xpath = EMAG_LOGO)
    public WebElement emagLogo;

    @FindBy(css = LOGIN_CONT)
    public WebElement loginCont;

    @FindBy(css = INTRARE_CONT_BANNER)
    public WebElement loginBanner;

    @FindBy(css = BANNER_CLOSE_BUTTON)
    public WebElement bannerCloseButton;


    @FindBy(css = ACCEPT_BUTTON)
    public WebElement acceptBtn;

    @FindBy(css = GDPR_FOOTER)
    public WebElement gdprFooter;

    @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZilei;


}

