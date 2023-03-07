package ExercitiiDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class SwagBaseTest {

    protected ChromeDriver driver = null;
    /* @BeforeTest
    public void beforeMethod(){
        driver = SwagDriverConfig.getChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }*/

    @BeforeTest()
    public void beforeMethod(){
        driver = SwagDriverConfig.getChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @AfterTest(alwaysRun = true) // ne inchide driver-ul chiar daca ne pica testul in metoda before
    public  void afterMethod(){
        driver.quit();
    }
}
