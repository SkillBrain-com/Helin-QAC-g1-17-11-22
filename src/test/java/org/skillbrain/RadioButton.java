package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton extends Utils {
    public static void main(String[] args) {
        WebDriver driver = getChromeDriver();
        try {
            driver.get("https://demoqa.com/radio-button");
            WebElement radioButtonYes = driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
            radioButtonYes.click();
            WebElement radioButtonImpressive = driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
            radioButtonImpressive.click();
            driver.quit();


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            driver.quit();
        }
    }


}

