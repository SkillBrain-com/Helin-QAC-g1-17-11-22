import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {
    public static void main(String[] args) {
     //   System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe ");
     //   ChromeDriver driver=new ChromeDriver();
        WebDriverManager.chromedriver().driverVersion("110.0").setup();
        ChromeDriver driver = new ChromeDriver();

       // driver.get("https://demoqa.com");

        //  WebElement element1 = driver.findElement(By.xpath("//div[@class='home-banner']//a)"));
        //  WebElement element2 = driver.findElement(By.cssSelector("div.home-banner a"));


           // localizare cu Tag name(tag name-uri sunt head, body,div,header, footer,img,a, )
        // WebElement header=  driver.findElement(By.tagName("header"));
        //header.click();

               // localizare prin ID
      //  driver.get("https://demoqa.com/webtables");
      //  WebElement button = driver.findElement(By.id("addNewRecordButton"));
      //  button.click();

                       // indentificare prin linkText
          //driver.get("https://demoqa.com/links");
          //WebElement link = driver.findElement(By.linkText("Home"));
          //link.click();

               //indentificare dupa nume(By.name)
        driver.get("https://demoqa.com");
        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println( meta.getAttribute("content"));// ne va printa in consola valoarea atributului content adica"width=device-width,initial-scale=1"


       driver.close();// inchide doar tabul pe care are focusul driverul nostru
        driver.quit();//inchide toate taburile si omoara sesiunea de chromedrive

        System.out.println("Finish");

    }
}
