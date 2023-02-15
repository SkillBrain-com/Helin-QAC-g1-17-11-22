package org.skillbrain.Tema5.Heroku;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementAttributesExamples {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://testpages.herokuapp.com/styled/attributes-test.html");
        WebElement findTitle = driver.findElement(By.tagName("h1"));
        System.out.println("Title displays  " + findTitle.getText());
        WebElement findSubtitle = driver.findElement(By.tagName("h2"));
        System.out.println("Subtitle is " + findSubtitle.getText());
        WebElement centreParagraph= driver.findElement(By.id("domattributes"));
        System.out.println("Text displayed in centre paragraph is: "+ centreParagraph.getText());
        WebElement nextParagraphTitle = driver.findElement(By.xpath("/html/body/div/h2[2]"));
        System.out.println("Title is " +nextParagraphTitle.getText());
        WebElement nextIdParagraph = driver.findElement(By.className("inline-explanation"));
        System.out.println("Paragraph displays: " + nextIdParagraph.getText());
        WebElement dynamicAttributes = driver.findElement(By.id("jsattributes"));
        System.out.println("Title is " +dynamicAttributes.getText());
        WebElement addAnthrAttributeGreenbtn = driver.findElement(By.className("styled-click-button"));
        addAnthrAttributeGreenbtn.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
