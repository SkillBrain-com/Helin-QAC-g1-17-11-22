package Selenium_Tema1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        //header
        WebElement forms = driver.findElement(By.xpath("/html/body/div/h1"));
        forms.click();
        System.out.println(forms.getText());
        //driver.quit();
        forms = driver.findElement(By.className("explanation"));
        forms.click();
        System.out.println(forms.getText());
       // driver.quit();
        forms =driver.findElement(By.id("para1"));
        System.out.println("Textul din paragraful 1 este: " + forms.getText());
   //   driver.quit();
     //A-2a pagina Web din Tema
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        forms = driver.findElement(By.className("styled-click-button"));
        System.out.println("Textul de pe buton este:" + forms.getText());
        forms = driver.findElement(By.cssSelector(".inline-explanation"));
        System.out.println("Paragraful din header 2 : " + forms.getText());
//driver.quit();
   //A-3a pagina din Tema
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        forms = driver.findElement(By.xpath("//p[@id='p14']"));
        System.out.println("Paragraful n :"+ forms.getText());
   //driver.quit();
        forms = driver.findElement(By.linkText("EvilTester.com"));
        forms.click();
  //    driver.quit();
   //A 4-a pagina
driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
 forms = driver.findElement(By.cssSelector("tbody tr:nth-child(1)"));
        System.out.println("Capul tabelului este:"+forms.getText());
driver.quit();

}
}







