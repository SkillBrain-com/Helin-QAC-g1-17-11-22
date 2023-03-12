package org.skillbrain.danielIrimia.SeleniumBasics1;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SeleniumBasics1.LocatorExercises;

public class TestpagesHerokuapp extends Utils {

    WebDriver driver;
    LocatorExercises page;
    private final static String APP_URL = "https://testpages.herokuapp.com/styled/index.html";

    @BeforeTest
    public void startTest() {
        driver = getChromeDriver();
    }

    @BeforeMethod
    public void setupObject() {
        page = new LocatorExercises(driver);
        driver.get(APP_URL);
    }

    // 1. Parcurgeți primele 4 link-uri de la pagina https://testpages.herokuapp.com/styled/index.html.
    // 2. Localizați elementele de pe fiecare pagină. Elementele care se pot click-ui se vor click-ui,
    //    iar pentru cele care au text se va afișa la consolă textul de pe ele.
    @Test
    public void testBasicWebPage() {
        page.basicWebPageExample.click();
        System.out.println(page.basicWebPageExampleHeader.getText());
        System.out.println(page.basicWebPageExampleParagraph2.getText());
        System.out.println("====================================");
    }

    @Test
    public void testElementAttributesPage() {
        page.elementAttributesExample.click();
        page.styledClickButton.click();
        System.out.println(page.paragraphDynamicAttribute.getText());
        String customValue = page.paragraphDynamicAttribute.getAttribute("nextid");
        System.out.println("Custom value of attribute nextid  " + customValue);
        System.out.println("====================================");
    }

    @Test
    public void testLocatorsTestPage() {
        page.locatorsTestPage.click();
        System.out.println(page.oParagraphText.getText());
        System.out.println(page.paragraphName38.getText());
        page.jumpToP15.click();
        System.out.println("====================================");
    }

    @Test
    public void testHtmlTagExamplesPage() {
        System.out.println(page.htmlTagExamples.getText());
        page.tableTestPage.click();
        System.out.println(page.tableTestInformation.getText());
        System.out.println("====================================");
    }

    @Test
    public void testDynamicTablePage() {
        page.dynamicTablePage.click();
        System.out.println("Caption: " + page.tableCaption.getText());
        System.out.println("Id attribute: " + page.table.getAttribute("id"));
        // update table
        page.summary.click();
        page.caption.clear();
        page.caption.sendKeys("New table");
        // update table id
        page.tableId.clear();
        page.tableId.sendKeys("newTableId");

        // update table content
        page.jsonData.sendKeys("[{\"name\": \"Bob\", \"age\": 20}, {\"name\": \"George\", \"age\": 42}, {\"name\": \"Daniel\", \"age\": 35}]");
        System.out.println(page.jsonData.getAttribute("value"));
        page.refreshTable.click();
        System.out.println("====================================");
    }

    @AfterTest
    public void stopTest() {
        driver.quit();
    }
}
