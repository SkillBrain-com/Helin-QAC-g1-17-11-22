package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HerokuappTemaChromeOptions {
    private final static String USER_NAME="//input[@name='username']";
    private final static String PASSWORD="//input[@name='password']";
    private final static String COMMENT="//textarea[@name='comments']";
    private final static String SUBMIT="//input[@value='submit']";
    private final static String CHECK_BOX_1="//td[contains(text(),'Checkbox Items:')]";

@FindBy(xpath = USER_NAME)
public WebElement userName;
@FindBy(xpath =USER_NAME )
public WebElement password;
@FindBy(xpath = USER_NAME)
public WebElement comment;
@FindBy(xpath =SUBMIT )
public WebElement submit;
@FindBy(xpath = CHECK_BOX_1)
public WebElement ckeckBox1;
    public HerokuappTemaChromeOptions (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}