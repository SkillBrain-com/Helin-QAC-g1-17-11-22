package org.skillbrain.Tema5.TestNG;

import PageObjects.EmagTema;
import Utilitis.Utils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

public class EmagTemaTest extends Utils{

    RemoteWebDriver driver;
     EmagTema page;
    //  WebDriverWait waitFor;
    @BeforeTest
    public void startTest() throws MalformedURLException {
        driver = getRemoteWebdriver();
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }

    @Test
    public void conectareUtilizatorCorectTest() throws InterruptedException {
        driver.get("https://www.emag.ro/");
        EmagTema page=new EmagTema(driver);
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page.email);
        page.acceptButton.click();
        page.gdprFooter.click();
        page.email.click();
        page. introduAdresaDeEmail.click();
        System.out.println("gabrielajitea77@gmail.com");
        Thread.sleep(8000);
        page.parola.click();

        Set<String> listaId = driver.getWindowHandles();
        Iterator<String> iterator = listaId.iterator();
        String parinte = iterator.next();
        String copil = iterator.next();
        String copil1=iterator.next();
        driver.switchTo().window(copil);
        driver.switchTo().window(copil1);
        driver.quit();
    }
    @BeforeTest
    public void startTest1() throws MalformedURLException {
        driver = getRemoteWebdriver();
    }

    @AfterTest
    public void stopTest1() {
        driver.quit();
    }

    @Test
    public void conectareUtilizatorGresitTest() throws InterruptedException {
        driver.get("https://www.emag.ro/");
        EmagTema page=new EmagTema(driver);
        page.acceptButton.click();
        page.gdprFooter.click();
        page.intraInContDinNou.click();
        page. introduAdresaDeEmail.click();
        System.out.println("gabrielajitea7@gmail.com");
        Thread.sleep(8000);
        Set<String> listaId = driver.getWindowHandles();
        Iterator<String> iterator = listaId.iterator();
        String parinte = iterator.next();
        String copil = iterator.next();
        driver.switchTo().window(copil);
        driver.quit();
}

}