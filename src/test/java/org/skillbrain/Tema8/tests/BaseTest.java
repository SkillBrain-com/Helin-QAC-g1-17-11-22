package org.skillbrain.Tema8.tests;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.skillbrain.lucianSimon.driver.WebdriverSet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
   // for tema 8
    //protected ChromeDriver driver = null;
// for tema9
    RemoteWebDriver driver;
    @BeforeMethod
    public void AccesareURL(){
        //tema8
      //  driver = WebdriverSet.getChromedriver();
        driver= WebdriverSet.createRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @AfterMethod (alwaysRun = true)
    public void InchidereURL(){
        if(driver != null){
            driver.quit();
        }
    }
}
