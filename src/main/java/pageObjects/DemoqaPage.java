package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {


    private final static String BANNER_IMAGE =".banner-image";
    private final static String GO_TO_REGISTRATION ="//a[normalize-space()='Go To Registration']";
    private final static String OPTION_ROMANIA ="option[value='70']";

    @FindBy(css = OPTION_ROMANIA)
    public WebElement optionRO;

    @FindBy(css = BANNER_IMAGE)
    public WebElement bannerImage;

    @FindBy(xpath =GO_TO_REGISTRATION )
    public WebElement goToRegistrationButton;

    public DemoqaPage(WebDriver driver) {
        PageFactory.initElements(driver, this );
    }

}
