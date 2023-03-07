package Teme;

import TemePageObj.PgObjTema_6;
import Utilities.Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tema_6 extends Utils {

    private static ChromeDriver driver;

//    public static void main(String[] args) throws InterruptedException, IOException {
//
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://testpages.herokuapp.com/styled/index.html");
//        PgObjTema_6 alertPage = new PgObjTema_6(driver);
//
//        alertPage.alertWebPage.click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
//        takeScreenshot(driver);
//        Alert firstAlert = driver.switchTo().alert();
//        firstAlert.accept();
//
//        driver.quit();
//
//    }


    public static void main(String[] args) {

    }

    public static void alerts() {
        WebDriver driver = getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement firstAlert = driver.findElement(By.id("alertexamples"));
        firstAlert.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        driver.quit();
    }


    public static void doubleClick(){
        WebDriver driver = getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//        WebElement doubleClick = driver.findElement();
        Actions actions = new Actions(driver);
//        actions.doubleClick(doubleClick).build().perform();
        driver.quit();
    }

    @Test
    public static void form(){
        WebDriver driver = getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        Select multiSelect = new Select(driver.findElement(By.name("multipleselect[]")));
        Select dropdown = new Select(driver.findElement(By.name("dropdown")));

        PgObjTema_6 pgObj = new PgObjTema_6(driver);
        pgObj.username.sendKeys("ana");
        pgObj.password.sendKeys("1234");
        pgObj.comments.clear();
        pgObj.comments.sendKeys("first comment");
        pgObj.fileName.sendKeys("C:\\Users\\user\\IdeaProjects\\Helin-QAC-g1-17-11-22\\Logs\\printscreen.png");
        pgObj.checkBox.get(1).click();
        pgObj.radioButton.get(2).click();

        multiSelect.deselectAll();
        multiSelect.selectByIndex(3);
        dropdown.selectByIndex(4);
        driver.quit();

    }




}