package org.skillbrain.Tema5.Demoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTables {
    public static void main(String[] args) throws Exception {
        accessWebTables();
    }

    public static void accessWebTables() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        WebElement addNewRecordButton = driver.findElement(By.id("addNewRecordButton"));
        addNewRecordButton.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys( "Luc");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Sim");
        Thread.sleep(2000);
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("lucsim@yahoo.com");
        Thread.sleep(2000);
        WebElement ageNumber = driver.findElement(By.id("age"));
        ageNumber.sendKeys("58");
        Thread.sleep(2000);
        WebElement salaryAmount = driver.findElement(By.id("salary"));
        salaryAmount.sendKeys("8500");
        Thread.sleep(2000);
        WebElement departmentName = driver.findElement(By.id("department"));
        departmentName.sendKeys(" Accounting");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(2000);
        System.out.println("All information was successfully submitted!");
        driver.quit();
    }
}
