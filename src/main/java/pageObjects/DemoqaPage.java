package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {
    private final static String BANNER_IMAGE = "//img[@alt='Selenium Online Training']";
    private final static String GO_TO_REGISTRATION = "//a[normalize-space()='Go To Registration']";
    private final static String OPTION_ROMANIA = "option[value='70']";


    @FindBy(xpath = BANNER_IMAGE)
    public WebElement bannerImage;
    @FindBy(xpath = GO_TO_REGISTRATION)
    public WebElement goToRegistrationButton;
    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRO;


    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

