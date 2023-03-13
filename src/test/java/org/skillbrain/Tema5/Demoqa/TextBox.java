package org.skillbrain.Tema5.Demoqa;

import org.skillbrain.Tema7.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox extends Utils {
    public static void main(String[] args) throws Exception {
        goToTextBox();
        goToEmail();
        goToCurrentAddress();
        goToPermanentAddress();
        submitButton();

    }

    private static void goToTextBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Luc Sim");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void goToEmail() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("lucsim@gmail.com");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void goToCurrentAddress() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(" str. Mihail Kogalniceanu, Vaslui");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void goToPermanentAddress() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(" str.Stefan cel Mare, Vaslui");
        Thread.sleep(2000);
        driver.quit();
    }

    public static void submitButton() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement blueSubmitButton = driver.findElement(By.id("submit"));
        blueSubmitButton.click();
        Thread.sleep(2000);
        System.out.println("Submit clicked!");
        driver.quit();
    }

}
