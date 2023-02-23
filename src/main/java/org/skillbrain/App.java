package org.skillbrain;


import Utilites.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.DemoqaPage;
import java.util.Iterator;
import java.util.Set;

public class App extends Utils {
    public static void main(String[] args) {
          WebDriver driver=new ChromeDriver();
        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        // WebDriver driver=getChromeDriver();//
try  {

    driver.get("https://demoqa.com/");




}catch (Exception e){
        e.printStackTrace();
        }finally {

        driver.quit();
        }

    }  }


