package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.WebDriver;
import pageObjects.QADemoPage;

public class QADemoTest extends Utils {

    public static void main(String[] args) {

        WebDriver driver = getChromeDriver();

        try {

            driver.get("https://demoqa.com/");
            QADemoPage qaDemoPage = new QADemoPage(driver);

            qaDemoPage.formsCard.click();
            System.out.println(qaDemoPage.selectText.getText());
            qaDemoPage.practiceFormBtn.click();
            qaDemoPage.name.sendKeys("iuliana");
            qaDemoPage.lastName.sendKeys("olaru");
            qaDemoPage.email.sendKeys("qa@email.com");
            qaDemoPage.gender.click();
            qaDemoPage.phoneNr.sendKeys("0123457689");
            qaDemoPage.hobby.click();
            qaDemoPage.submit.click();

            driver.quit();











        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Test passed!");
        }
















    }






}
