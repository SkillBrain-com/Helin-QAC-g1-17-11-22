package org.skillbrain.danielIrimia.SeleniumBasics1;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SeleniumBasics1.LocatorExercises;

public class TestpagesHerokuapp extends Utils {

    WebDriver driver;

    public final static String APP_URL = "https://testpages.herokuapp.com/styled/index.html";

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
    }

    // 1. Parcurgeți primele 4 link-uri de la pagina https://testpages.herokuapp.com/styled/index.html.
    // 2. Localizați elementele de pe fiecare pagină. Elementele care se pot click-ui se vor click-ui,
    //    iar pentru cele care au text se va afișa la consolă textul de pe ele.
    @Test
    public void testBasicWebPage() {
        driver.get(APP_URL);
        LocatorExercises page = new LocatorExercises(driver);
        page.basicWebPageExample.click();
        System.out.println(page.basicWebPageExampleHeader.getText());
        System.out.println(page.basicWebPageExampleParagraph2.getText());
        System.out.println("====================================");
    }
    @Test
    public void testElementAttributesPage() {
        driver.get(APP_URL);
        LocatorExercises page = new LocatorExercises(driver);
        page.elementAttributesExample.click();
        page.styledClickButton.click();
        System.out.println(page.paragraphDynamicAttribute.getText());
        String customValue = page.paragraphDynamicAttribute.getAttribute("nextid");
        System.out.println("Custom value of attribute nextid  " + customValue);
        System.out.println("====================================");
    }

    @Test
    public void testLocatorsTestPage() {
        driver.get(APP_URL);
        LocatorExercises page = new LocatorExercises(driver);
        page.locatorsTestPage.click();
        System.out.println(page.oParagraphText.getText());
        System.out.println(page.paragraphName38.getText());
        page.jumpToP15.click();
        System.out.println("====================================");
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }
}
