package org.skillbrain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {


    public static void main(String[] args) throws InterruptedException {

        //Pasul 1 Unde se afla ChromeDriver
        System.setProperty("webdriver.chrome.driver ", "drivers/chromedriver.exe ");
    //WebDriver driver = new ChromeDriver(); legal

    //Pasul 2 cream in memorie un obiect de tip"ChromeDriver" in memorie
    WebDriver driver = new ChromeDriver();

    // pasul 3 maximizez pagina web cu urmatoarea metoda
        driver.manage().window().maximize();


    // Pasul 4 folosim comanda "get" pentru a accesa o paginna web
        driver.get("https://demoqa.com/");


         //testul1 Header
              Thread.sleep(2000);
                  //definim element de tip header
               WebElement header = driver.findElement(By.tagName("header"));
          Thread.sleep(2000);
               header.click();

        // testul2 accesam pagina:https://demoqa.com/Elements/Text Box
     //  WebElement elements = driver.findElement(By.cssSelector(".card.mt-4.top-card"));
//        Thread.sleep(2000);
       // elements.click();
      // WebElement textBox = driver.findElement(By.id("item-0")); // FARA #!!!
        //textBox.click();
//        Thread.sleep(2000);//este o metoda statica

        //testul3 completam campurile
        // sendKeys este metoda pentru a completa un camp
      // driver.findElement(By.id("userName")).sendKeys("panait stelian");
      //  driver.findElement(By.id("userEmail")).sendKeys("email@email.com");
      //  driver.findElement(By.id("currentAddress")).sendKeys("Home");
      //  driver.findElement(By.id("permanentAddress")).sendKeys("Home");


        //test3 Verificam ca printeaza in consola datele introduce
       //  List<WebElement>mbElement = driver.findElements(By.tagName("p"));
         //for(int i = 0;i < mbElement.size();i++){
           //  System.out.println(mbElement.get(i).getText());
         //}

             // test 4 accesam Check Box
        driver.findElement(By.xpath("(//li[@id='item-1'])[1]"));
     //    Thread.sleep(2000);
        driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
        driver.findElement(By.xpath("//label[@for='tree-node-desktop']"  +
                "//span[@class='rct-checkbox']//*[name()='svg']")).click();
      //  Thread.sleep(3000);
        System.out.println( driver.findElement(By.id("result")).getText());
     driver.findElement(By.xpath("(//li[@id-'item-2'])[1]")).click();
     driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
      Thread.sleep(2000);

       driver.quit();


        // selectori
        // ID -> #id
        // CSS -> .numeleClasei(daca sunt spati libere le inlocuim cu .)
        //Ex css: .card mt-4 top-card ->.card.mt4-4.top-car
        // Xpath -> //tag[@atribut='valoare'][index]
        // Exemplu xpath: //a[@target='_blank'],//div[@class='card mt4 top-card'])[2]
        // tagname ->tagname

           WebElement element1 =driver.findElement(By.xpath("//div[@class='home-banner']/a"));
           WebElement element2 = driver.findElement(By.cssSelector("div.home-banner a"));
           element2.click();

        //By.tagName
       WebElement header1 =  driver.findElement(By.tagName("header"));
       header1.click();

        //By.id
        driver.get("https://demoqa.com/webtables");
        WebElement buttton =driver.findElement(By.id("addNewRecordButton"));
        buttton.click();

        // By.linkText
        //   driver.get("https://demoqa.com/links");
         WebElement link = driver.findElement(By.linkText("Home"));
         link.click();

        //By.partiallinkText
          WebElement link2 = driver.findElement(By.partialLinkText("Content"));
          link2.click();

        //By.name
        driver.get("https://demoqa.com/");
        WebElement meta = driver.findElement(By.name("viewport"));
        meta.getAttribute("content");

        //By.className
      WebElement homeBanner = driver.findElement(By.className("home-banner"));
      homeBanner.click();


           WebElement  forms = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'])[2]"));
           WebElement footer = driver.findElement(By.tagName("footer"));
           System.out.println(footer.getText());
           forms.click();

           driver.quit();
            System.out.println("Finish");


    }



}
