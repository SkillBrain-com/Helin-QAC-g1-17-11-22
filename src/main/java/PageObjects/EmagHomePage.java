package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class EmagHomePage {

    private static final String ACCEPT_BUTTON = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    // private static final String CLOSE_OFERTA_ZILEI ="//button[@class=`close`] "; //
    private static final String INTRARE_IN_CONT = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none  ";
    // private final String GDPR_FOOTER="autoParams"; //

    private final String EMAG_LOGO = "//img[@alt=\"eMag\"]";

    private final String SALUT_MSG = "//*[contains(text(),'Salut!')]";
    public WebElement loginBanner;
    public HTMLInputElement intraInContButton;
    public Alert email;
    public HTMLInputElement loginButton;
    public WebElement passwordHeader;
    public Alert password;
    public HTMLInputElement continueButton;
    public Alert loginErrorMessage;

    @FindBy(css = "ACCEPT_BUTTON")
    public WebElement acceptButton;
    @FindBy(css = "GDPR_FOOTER ")
    public WebElement gdprFooter;
    @FindBy(xpath = " CLOSE_OFERTA_ZILEI ") //
    public WebElement closeOfertaZileiButton; //
    @FindBy(css = "INTRARE_IN_CONT")
    public WebElement intraInCont;
    @FindBy(xpath = "EMAG_LOGO")
    public WebElement emagLogo;
    @FindBy(xpath = "SALUT_MSG ")
    public WebElement salutMsg;

    public EmagHomePage(WebDriver driver) {
    }
}


