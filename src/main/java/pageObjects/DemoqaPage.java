package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoqaPgage {
    private final static String BANNER_IMAGE = ".banner-image";


    @FindBy(css = BANNER_IMAGE)
    public WebElement bannerImage;

    public demoqaPgage() {
    }
}
