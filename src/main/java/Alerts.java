
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import javax.xml.xpath.XPathExpression;




public class Alerts {
private static ChromeDriver driver; // declar fara initializare
    private static String keytosend;

    public static void main(String[] args) {

        System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
           try {
          driver.manage().window().maximize();
          driver.get("https://demoqa.com/alerts");
          driver.findElement(By.id("alertButton")).click();
          Alert alert=driver.switchTo().alert();
               System.out.println("alertButton");
               // driver.findElement(By.id("promptButton")).click();
               //  Alert alert1=driver.switchTo().alert();
             Thread.sleep(3000);
               //  alert.dismiss();
               //  Thread.sleep(4000);
               // alert.sendKeys(keytosend);
               // System.out.println(driver.findElement(By.id("promptButton.getrezults")));

             driver.quit();

            } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
    }
          }
