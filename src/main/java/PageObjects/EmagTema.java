package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmagTema  {
    private static final String ACCEPT_BUTTON = "btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private final static String INTRA_IN_CONT="//a[@class='btn btn-primary btn-emag btn-sm']";
    private final static String INTRODU_ADRESA_DE_EMAIL="//input[@id='user_login_email']";
    private final static String PAROLA="#user_login_password";


    private final static String INTRA_IN_CONT_DIN_NOU="//a[@class='btn btn-primary btn-emag btn-sm']";
    private final static String INTRODU_ADRESA_DE_EMAIL_DIN_NOU="//input[@id='user_login_email']";




    @FindBy(css=ACCEPT_BUTTON)
    public WebElement acceptButton;
    @FindBy(css = GDPR_FOOTER)
    public WebElement gdprFooter;
    @FindBy(xpath=INTRA_IN_CONT)
    public WebElement email;
    @FindBy(xpath = INTRODU_ADRESA_DE_EMAIL)
    public WebElement introduAdresaDeEmail;
    @FindBy(css=PAROLA )
    public WebElement parola;

    @FindBy(xpath=INTRA_IN_CONT_DIN_NOU)
    public WebElement intraInContDinNou;
    @FindBy(xpath = INTRODU_ADRESA_DE_EMAIL_DIN_NOU)
    public WebElement introduAdresaDeEmailDinNou;
    public EmagTema(WebDriver driver ){
        PageFactory.initElements(driver,this);

    }
}
