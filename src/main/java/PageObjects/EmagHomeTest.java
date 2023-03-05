package PageObjects;

import PageObjects.EmagHomePage;

import Utilitis.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
 public class EmagHomeTest extends Utils {

     private static final String ACCEPT_BUTTON = "btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
     private static final String GDPR_FOOTER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
     private static final String CLOSE_OFERTA_ZILEI = "//button[@class='close']";

     private static final String INTRARE_IN_CONT = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";

     private static final String INTRARE_CONT_BANNER = ".gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.login-view.login-view-ro.show";

     private static final String BANNER_INTRARE_BUTTON = ".js-dismiss-login-notice-btn.dismiss-btn.btn.btn-link.pad-sep-none.pad-hrz-none";
     public void EmagHomePage(WebDriver driver) {
         //constructor care va avea ca intrare un driver generalizat de tip WebDriver .. nu Chrome Edge sau altceva

         PageFactory.initElements(driver, this);
     }

     @FindBy(css = BANNER_INTRARE_BUTTON)
     public WebElement bannerCloseButton;

     @FindBy(css=INTRARE_CONT_BANNER)
     public WebElement loginBanner;
     @FindBy(css=ACCEPT_BUTTON)
     public WebElement acceptButton;

     @FindBy(css = GDPR_FOOTER)
     public WebElement gdprFooter;

     @FindBy(xpath = CLOSE_OFERTA_ZILEI)
     public WebElement closeOfertaZileiButton;

     @FindBy(css = INTRARE_IN_CONT)
     public WebElement intraInCont;

 }









