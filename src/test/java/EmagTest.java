import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.EmagHomePage;

import java.time.Duration;

public class EmagTest extends Utils {


    public static void main(String[] args){

        WebDriver driver = getChromeDriver();

        try {
            driver.get("https://www.emag.ro/");
            EmagHomePage homePage = new EmagHomePage(driver);
//            homePage.gdprFooter.click();
//            homePage.acceptBtn.click();



//            if (homePage.loginBanner.isDisplayed()) {
//                homePage.bannerCloseButton.click();
//            }

//            driver.navigate().refresh();
//            Thread.sleep(3000);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            if (homePage.gdprFooter.isDisplayed()){
                wait.until(ExpectedConditions.visibilityOf(homePage.gdprFooter));

                homePage.acceptBtn.click();}
//
//
//
            if (homePage.bannerCloseButton.isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOf(homePage.loginBanner));
//                homePage.bannerCloseButton.click();/
            }

            homePage.loginCont.click();
//            homePage.emagLogo.click();
            System.out.println(homePage.salutMsg.getText());
            System.out.println(homePage.enterEmail.getText());
            homePage.emailField.click();
            homePage.emailField.sendKeys("ovi");
            homePage.loginContinue.click();

            System.out.println("Test finish!");

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }




        // intra in login => emag logo => verificam daca textul Salut! exista (  //*[contains(text(),'Salut!')]







    }
























}
