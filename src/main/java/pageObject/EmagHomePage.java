package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
        private static final String ACCEPT_BUTTON = ".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
        private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
       // WebDriver driver;
       private static final String CLOSE_OFERTA_ZILEI ="//button[@class='close']";
       private static final String INTRARE_IN_CONT =".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
       private static  final  String INTRARE_CONT_BANNER = "//a[@class='font-size-ms strong login-btn btn btn-primary js-login-btn']";
       private static final String BANNER_INTRARE_BUTTON =".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
       private static final String INTRARE_IN_CONT_BUTTON ="//a[@class ='font-size-ms strong login-btn btn btn-primary js-login-btn']";
       private static final String EMAG_LOGO ="//img[@alt='eMAG']";
       private static final String SALUT_MSG ="//*[contains(text(),'Salut!')]";
       //================================================================//
       //Urmeaza Test logare pe emag cu date incorecte
     private static final String EMAIL ="user_login_email";
     private static final String LOGIN_BUTTON ="user_login_continue";
     private static final String PASSWORD = "user_login_password";
     private static final String CONTINUE_LOGIN ="user_login_continue";
     private static final String LOGIN_ERROR = "//*[contains(text(),'Ai introdus greșit parola sau adresa de email. Te rugăm completează din nou.')]";
     private static final String PASSWORD_HEADER ="//label[@for='user_login_password']";


     @FindBy(id = EMAIL)
     public WebElement email ;
     @FindBy(id = LOGIN_BUTTON)
     public WebElement loginButton;
      @FindBy(id = PASSWORD)
      public WebElement password;
       @FindBy(id = CONTINUE_LOGIN)
       public WebElement continueButton;
       @FindBy(xpath = LOGIN_ERROR)
       public WebElement loginErrorMessage;
       @FindBy(xpath = PASSWORD_HEADER)
       public WebElement passwordHeader;
//=============================================================================//
     @FindBy(css = ACCEPT_BUTTON)
    public WebElement acceptButton;

    @FindBy(css = GDPR_FOOTER)
    public WebElement gdprFooter;

   @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZileiButton;

    @FindBy(css = INTRARE_IN_CONT)
    public WebElement IntrareInCont;

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


               // public WebElement getAcceptButton() {
               // return acceptButton;
               //}        // una din metode
               //private void setAcceptButton() {
               // this.acceptButton = driver.findElement(By.cssSelector(".btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block"));
               //}






    public EmagHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




}
