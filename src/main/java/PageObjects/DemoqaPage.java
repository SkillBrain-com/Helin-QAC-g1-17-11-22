package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage {

         WebDriver driver=new ChromeDriver();

       private final static String BANNER_IMAGE=".banner-image";
    //  private final static String GO_TO_REGISTRATION ="//a[normalize-space()='Go To Registration']";

        private final static String OPTION_ROMANIA ="option[value='70']";
     private final static String GO_TO_REGISTRATION =".btn.btn-primary.shadow.btn.block";

    @FindBy(css= " BANNER_IMAGE")
    public   WebElement bannerImage;
      @FindBy(xpath = "GO_TO_REGISTRATION")
    // @FindBy(css =" GO_TO_REGISTRATION")
     public   WebElement gotoregistrationButton;
      @FindBy(xpath = "OPTION_ROMANIA")
    public   WebElement optionRo;
      public DemoqaPage(WebDriver driver ){

        PageFactory.initElements(driver,this);

    }
}
