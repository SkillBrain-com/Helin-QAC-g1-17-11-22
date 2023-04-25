package Selenium_Tema2;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Set;

public class DemoQA extends Utils {

    public static void main(String[] args) throws IOException {
        WebDriver driver = getChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        try {
            actions.moveToElement(driver.findElement(By.xpath("//button[@id='tabButton']")));
            actions.perform();
            driver.findElement(By.xpath("//button[@id='tabButton']")).click();
            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();
            //mutam focusul pe a 2-a pagina; iteram
            for (String window : windowHandles) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
                System.out.println("Textul de pe New Tab: " + driver.findElement(By.id("sampleHeading")).getText());
                driver.close();
                driver.switchTo().window(parentWindow);
                actions.moveToElement(driver.findElement(By.id("windowButton")));
                actions.perform();
                driver.findElement(By.id("windowButton")).click();

                Set<String> windowHandles2 = driver.getWindowHandles();

                for (String window : windowHandles2){
                    if (!window.equals(parentWindow)) {
                        driver.switchTo().window(window);
                        break;
                    }
                }
                System.out.println("Textul de pe New Window este: " +driver.findElement(By.id("sampleHeading")).getText());
                driver.close();
                driver.switchTo().window(parentWindow);

                driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
            Set<String> windowHandles3 = driver.getWindowHandles();
                for (String window : windowHandles3){
                    if (!window.equals(parentWindow)) {
                        driver.switchTo().window(window);
                        break;
                    }
                }
                driver.close();
            System.out.println("Nu stiu cum sa afisez textul din New Window Message");
            driver.switchTo().window(parentWindow);
            // false selector
            //driver.findElement(By.id("false_selector")).click();
            }

            catch (Exception e ){
                try {
                    takeScreenshot(driver);
                } catch (Exception IO) {
                    System.out.println(IO.getMessage());
                }
            }
        finally{
                driver.quit();
            }


        }


    }





