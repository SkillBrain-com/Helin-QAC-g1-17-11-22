package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testpages {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        try {
            driver.get("https://testpages.herokuapp.com/styled/index.html");
            //Basic Web Page Example
            WebElement basicwebpageexample = driver.findElement(By.id("basicpagetest"));
            basicwebpageexample.click();

            WebElement eviltester = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
            WebElement compendiumdevelopments = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
            WebElement Index = driver.findElement(By.cssSelector(".page-navigation"));

            eviltester.click();
            compendiumdevelopments.click();
            Index.click();

            //Element Attributes Examples
            WebElement elementattributesexamples = driver.findElement(By.id("elementattributestest"));
            elementattributesexamples.click();

            WebElement addanotherattribute = driver.findElement(By.cssSelector(".styled-click-button"));

            addanotherattribute.click();
            eviltester.click();
            compendiumdevelopments.click();
            Index.click();

            //Locators - Find By Playground Test Page
            WebElement locatorsfindbyplaygroundtestpage = driver.findElement(By.id("findbytest"));
            locatorsfindbyplaygroundtestpage.click();

            WebElement jumptopara0 = driver.findElement(By.xpath("(//li[@class='normal'])[1]"));

            jumptopara0.click();
            eviltester.click();
            compendiumdevelopments.click();
            Index.click();

            //Table Test Page
            WebElement tabletestpage = driver.findElement(By.id("tablestest"));
            tabletestpage.click();

            WebElement tabledata = driver.findElement(By.xpath("//summary[@xpath='1']"));

            tabledata.click();
            eviltester.click();
            compendiumdevelopments.click();
            Index.click();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();


        }


    }
}