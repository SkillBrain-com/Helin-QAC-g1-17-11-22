import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;


public class MainSelenium {
  //  ChromeDriver driver = getChromeDriverByManager();
    public static void main(String[] args)   {
       ChromeDriver driver = getChromeDriverByManager();
     //   System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe ");
     //   ChromeDriver driver=new ChromeDriver();
    // ChromeDriver driver = getChromeDriverByManager();
       // ChromeDriver driver = null;
        // driver.get("https://demoqa.com/");
      //  WebDriverManager.chromedriver().driverVersion("110.0").setup();
     //   ChromeDriver driver = new ChromeDriver();
     //   Thread.sleep(2000);

        //   try {
     //       WebElement card = driver.findElement(By.className("card"));
     //       driver.navigate().refresh();// facem refresh la pagina dar la compilare vom primi erarea StaleElementReferenceException
     //       card = driver.findElement(By.className("card"));// pentru a fixa eraorea va trebui sa recautam elementul in pagina

     //       card.click();
     //   }catch (NoSuchElementException | ElementClickInterceptedException e){
     //       System.out.println("Am prins o exceptie");
     //   }finally {
     //       System.out.println("Inchid driverul");
     //       driver.quit();//inchide toate taburile si omoara sesiunea de chromedrive
     //   }


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
        //  driver.get("https://demoqa.com/links");
       //   WebElement link = driver.findElement(By.linkText("Home"));
       //   link.click();
                      // Partial link-text
      //  WebElement link1 = driver.findElement(By.partialLinkText("Content"));
      //   link1.click();
                       //indentificare dupa nume(By.name)
       // driver.get("https://demoqa.com");
       // WebElement meta = driver.findElement(By.name("viewport"));
       // System.out.println( meta.getAttribute("content"));// ne va printa in consola valoarea atributului content
                                                            // adica"width=device-width,initial-scale=1"
                       // indentificare dupa className
        //    WebElement homeBanner =  driver.findElement(By.className("home-banner"));
        //    homeBanner.click();


      // driver.close();// inchide doar tabul pe care are focusul driverul nostru


               // 6.14 BUTTONS
      // ChromeDriver driver = getChromeDriverByManager();
          // driver.get("https://demoqa.com/buttons");
        //   driver.findElements(By.cssSelector(".btn.btn-primary")).get(2).click();// id dinamic
       // driver.get("https://demoqa.com/browser-windows");
      //    ChromeDriver driver = null;
        try {
            driver = getChromeDriverByManager();
            driver.get("https://demoqa.com/browser-windows");

            String parentWindow = driver.getWindowHandle();// ne returneaza mereu ID-ul acelui Tag la care Selenium are Focus
            Set<String> WindowHandles = driver.getWindowHandles();//ne returneaza (un set de String-uri) ID-urile tuturor Tag-urilor care sunt deschise
                                                               // la momentul apelarii acestei metode;

            WebElement tabButton = driver.findElement(By.id("tabButton"));
            tabButton.click();



            System.out.println("Finish");
        }finally {
            if (driver != null){
                driver.quit();
            }
        }






    }








    public static void AlPatruleaButton(){
        ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/alerts");

        WebElement fourthButton = driver.findElement(By.cssSelector("#promtButton"));
        fourthButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Al patrulea Buton");
        alert.accept();

    }
    public static void AlTreileaButon(){// 6.15
        ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/alerts");
        WebElement threeButton = driver.findElement(By.cssSelector("#confirmButton"));
        threeButton.click();
        Alert alert = driver.switchTo().alert();
       // alert.accept();// apesi butonul accept
        alert.dismiss();// apesi butonul Cancel
    }

     public static void AlertsFirstButton(){//6.15 Alerts
         ChromeDriver driver = getChromeDriverByManager();
        driver.get("https://demoqa.com/alerts");

        WebElement firstButton = driver.findElement(By.id("alertButton"));
        firstButton.click();

         Alert alert = driver.switchTo().alert();
         alert.accept();
     }

     public static void rightClick(){//  6.14cum facem click dreapta pe un buton
         ChromeDriver driver = getChromeDriverByManager();
         driver.get("https://demoqa.com/buttons");
         WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
         Actions actions = new Actions(driver);
         actions.contextClick(rightClickButton).build().perform();
         driver.close();
     }
     public static void doubleClick(){//6.14 Buttons cum facem dubluClick
         ChromeDriver driver = getChromeDriverByManager();
         driver.get("https://demoqa.com/buttons");

         WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
         Actions actions = new Actions(driver);
         actions.doubleClick(doubleClick).build().perform();
         driver.close();

     }


    public static void actionsClass() throws IOException {
        ChromeDriver driver = null;
                                //CLASA ACTIONS
        //contine metode ajutattoare pentru a simula interactiuni ale User-ului cu Mouse-ul sau cu tastatura
        // cea mai des folosita metoda din aceasta clasa este mouve to element care scroleaza Mouse-ul pana la elementul nostru
        try {
            // ChromeDriver driver = getChromeDriverByManager();
            driver = getChromeDriverByManager();
            driver.get("https://demoqa.com/");


            List<WebElement> cards =driver.findElements(By.cssSelector(".card"));
            WebElement sixthCard = cards.get(5);

            Actions actions = new Actions(driver);
            actions.moveToElement(sixthCard).build().perform();
            sixthCard.click();
            Thread.sleep(5000);
            File file = driver.getScreenshotAs(OutputType.FILE);
             File destinationFile = new File("C:\\Users\\Lenovo\\IdeaProjects\\poza.png");
              FileUtils.copyFile(file,destinationFile);

            sixthCard.click();
            throw new NoSuchElementException("Exceptie custom");
        }catch (Exception e){
            System.out.println("Am intrat in ramura de catch");
            if (driver != null){
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destinationFile = new File("C:\\Users\\Lenovo\\IdeaProjects\\poza.png");
                FileUtils.copyFile(file,destinationFile);
            }

        }finally {
            if(driver != null){// driver nu trebuie sa fie nul
                driver.quit();
            }

        }
        System.out.println("Finish");
    }

    public static ChromeDriver getChromeDriverByExecutable(){
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        return new ChromeDriver();
    }

    public static ChromeDriver getChromeDriverByManager(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
   }


}
