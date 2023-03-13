package org.skillbrain.Tema7;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends Utils  {
    protected ChromeDriver driver;

    @BeforeMethod
    public void openCURAHealthPage() {
        //open home page
       driver=new ChromeDriver();
       driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println("Am deschis CURA Healthcare Service page");
    }

    @AfterMethod (alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
        System.out.println("Close browser");
    }
}
