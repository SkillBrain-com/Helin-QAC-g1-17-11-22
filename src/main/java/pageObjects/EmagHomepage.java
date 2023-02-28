package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EmagHomepage {

    WebDriver driver;
    public EmagHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    private WebElement acceptButton;
    public WebElement getAcceptButton() {
        return acceptButton;
    }

    private void setAcceptButton() {
        this.acceptButton = driver.findElement(By.cssSelector(".btn btn-primary js-accept gtm_h76e8zjgoo btn-block"));
    }


}
