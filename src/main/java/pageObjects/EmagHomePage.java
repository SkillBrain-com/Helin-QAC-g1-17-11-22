package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
    //incapsulare
    private static final String ACCEPT_BUTTON = "btn.btn-primary.js-accept.gtm_h76e8zjgoo.btn-block";
    private static final String GDPR_FOOTER = "gdpr-cookie-banner.js-gdpr-cookie-banner.pad-sep-xs.pad-hrz-none.show";
    private static final String CLOSE_OFERTA_ZILEI = "//button[@class='close']";
    public EmagHomePage(WebDriver driver) { //constructor care va avea ca intrare un driver generalizat de tip WebDriver .. nu Chrome Edge sau altceva
        PageFactory.initElements(driver, this);
    }


    @FindBy(css=ACCEPT_BUTTON)
    public WebElement acceptButton;

    @FindBy(css = GDPR_FOOTER)
    public WebElement gdprFooter;

    @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZileiButton;
}
