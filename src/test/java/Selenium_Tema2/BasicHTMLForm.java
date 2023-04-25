package Selenium_Tema2;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

    public class BasicHTMLForm extends Utils {
        public static void main(String[] args) throws IOException {
            WebDriver driver = getChromeDriver();
            Actions actions = new Actions(driver);
            driver.manage().window().maximize();
            driver.get("https://testpages.herokuapp.com/styled/index.html");

            try {
                actions.moveToElement(driver.findElement(By.xpath("//a[@id='htmlformtest']")));
                actions.perform();

                driver.findElement(By.xpath("//a[@id='htmlformtest']")).click();
                driver.findElement(By.xpath("//input[@name='username']")).sendKeys("alexandraNegulescu");
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("parola");
                driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Hello");
                driver.findElement(By.xpath("//input[@value='cb2']")).click();
                driver.findElement(By.xpath("//input[@value='cb1']")).click();
                actions.moveToElement(driver.findElement(By.xpath("//input[@value='rd1']")));
                actions.perform();
                driver.findElement(By.xpath("//input[@value='rd1']")).click();
                actions.moveToElement(driver.findElement(By.xpath("//option[@value='ms1']")));
                actions.perform();
                driver.findElement(By.xpath("//option[@value='ms1']")).click();
                actions.moveToElement(driver.findElement(By.xpath("//select[@name='dropdown']")));
                actions.perform();
                driver.findElement(By.xpath("//select[@name='dropdown']")).click();
                actions.moveToElement(driver.findElement(By.xpath("//input[@value='submit']")));
                actions.perform();
                driver.findElement(By.xpath("//input[@value='submit']")).click();

                System.out.println(driver.findElement(By.cssSelector("div[class='explanation'] p")).getText());
                System.out.println(driver.findElement(By.cssSelector("#_valueusername")).getText());
                System.out.println(driver.findElement(By.cssSelector("#_valuepassword")).getText());
                System.out.println(driver.findElement(By.cssSelector("#_valuecomments")).getText());
                System.out.println(driver.findElement(By.cssSelector("#_valuecheckboxes0")).getText());
                System.out.println(driver.findElement(By.cssSelector("#_valuemultipleselect0")).getText());

                driver.findElement(By.cssSelector("#back_to_form")).click();

                // false selector
                driver.findElement(By.id("false_selector"));
//                actions.moveToElement(driver.findElement(By.id("htmlform"))).click();
//                actions.perform();
//                driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Alexandra");
//                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("parola");
//                driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("Hello");
//                driver.findElement(By.xpath("//input[@value='cb1']")).click();
//                driver.findElement(By.xpath("//input[@value='rd1']")).click();
//
//                driver.findElement(By.xpath("//select[@name='multipleselect")).click();
//                driver.findElement(By.xpath("//select[@name='dropdown']")).click();
//                driver.findElement(By.xpath("//input[@value='submit']")).click();
//
//                driver.findElement(By.xpath("//input[@value='submit']")).click();
//                System.out.println(driver.findElement(By.id("_valueusername")).getText());
//                System.out.println(driver.findElement(By.id("_valuepassword")).getText());
//                driver.findElement(By.id("back_to_form")).click();

            }

            catch (Exception e) {
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













