package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {

    private static final String ACCEPT_BUTTON = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER =".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private static final String CLOSE_OFERTA_ZILEI ="//button[@class='close']";
    private static final String INTRARE_IN_CONT = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
    private static final String INTRARE_CONT_BANNER =".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.login-view.login-view-ro.show";
    private static final String BANNER_INTRARE_BUTTON =".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
    private static final String INTRARE_IN_CONT_BUTTON ="//a[@class='font-size-ms strong login-btn btn btn-primary js-login-btn']";
    private static final String EMAG_LOGO = "//img[@alt=\"eMAG\"]";
    private static final String SALUT_MSG ="//*[contains(text(),'Salut!')]";

    @FindBy(xpath = SALUT_MSG)
    public WebElement salutMsg;

    @FindBy(xpath = EMAG_LOGO)
    public WebElement emagLogo;

    @FindBy(xpath = INTRARE_IN_CONT_BUTTON)
    public WebElement intraInContButton;

    @FindBy(css = BANNER_INTRARE_BUTTON)
    public WebElement bannerCloseButton;

    @FindBy(css = INTRARE_CONT_BANNER)
    public WebElement loginBanner;

    @FindBy(css = ACCEPT_BUTTON)
    public WebElement acceptButton;

    @FindBy(css = GDPR_FOOTER )
    public WebElement gdprFooter;

    @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZileiButton;

    @FindBy(css = INTRARE_IN_CONT)
    public WebElement intraInCont;



    public EmagHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




}
