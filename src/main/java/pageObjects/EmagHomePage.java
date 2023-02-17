package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmagHomePage {
    private static final String ACCEPT_BUTTON= ".btn.btn-primary.js-accept.gtm_h76e8zjgoo";
    private static final String GDPR_FOOTER=".gdpr-cookie-banner";

    private static final String CLOSE_OFERTA_ZILEI="//button[@class='close']";
    public EmagHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(css= ".btn.btn-primary.js-accept.gtm_h76e8zjgoo")
    public WebElement acceptButton;

    @FindBy(css =GDPR_FOOTER)
    public WebElement gdprFooter;

    @FindBy(xpath = CLOSE_OFERTA_ZILEI)
    public WebElement closeOfertaZileiButton;


}
