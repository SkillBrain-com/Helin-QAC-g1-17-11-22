package Teme;

import TemePageObj.PgObjTema_5;
import Utilities.Utils;
import org.openqa.selenium.WebDriver;

public class Tema_5 extends Utils {


    public static void main(String[] args) {
        basicPage();
//        elementsAndLocatorsPages();
//        tablesPage();
    }
    public static void basicPage() {
        WebDriver driver = getChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        PgObjTema_5 pageObj = new PgObjTema_5(driver);
        System.out.println(pageObj.explanationHomePage.getText());
        pageObj.basicWebPage.click();
        System.out.println(pageObj.aParagraphText.getText());
        System.out.println(pageObj.anotherParagraphText.getText());
        driver.quit();

    }

    public static void elementsAndLocatorsPages(){

        WebDriver driver =getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        PgObjTema_5 pageObj = new PgObjTema_5(driver);
        pageObj.elementAttribute.click();
        System.out.println(pageObj.attributeParagraph.getText());
        System.out.println(pageObj.dynamicButton.getDomAttribute("nextid"));
        pageObj.dynamicButton.click();
        pageObj.dynamicButton.click();
        System.out.println(pageObj.dynamicButton.getDomAttribute("nextid"));
        pageObj.indexButton.click();
        pageObj.locatorsFindBy.click();
        System.out.println(pageObj.paragraphP3.getText());
        pageObj.jumpToParagraph.click();
        System.out.println(pageObj.jumpToParagraph.getText());
        driver.quit();
    }


    public static void tablesPage(){

        WebDriver driver = getChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        PgObjTema_5 psgeObj = new PgObjTema_5(driver);
        psgeObj.tableWebPage.click();
        System.out.println(psgeObj.tableInformation.getText());
        System.out.println(psgeObj.aleisterInfo.getText());

        driver.quit();

    }









}
