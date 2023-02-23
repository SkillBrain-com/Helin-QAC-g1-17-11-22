package org.skillbrain;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator;
//  import jdk.incubator.vector.VectorOperators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.xml.xpath.XPathExpression;

public  class Selenium {
    private static Object card;

    public static void main(String[] args) {


System.setProperty("Chromedriver.chrome.driver"," .idea/drivers/chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 // WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/ ");

        //selectori : se cauta cu ctrl f
        //ID #id
        //css .numeClasEI(daca sunt spatii libere le inlocuiti cu .)
        //exemplu css:  .card mt-4 top-card  .card.mt-4.top-card
        // Xpath  : //tag[@atribut=`valoare`]
        //exemplu Xpath:a[@target=`_blank` ],//div[@class=`card mt-4 top-card` ])[2 ]

         driver.get(" https://demoqa.com");
        String s = "//div[@class='card mt-4 top-card'])[2]";
          WebElement forms= driver.findElement(By.xpath("//div[@class='body-height']"));
         WebElement forms1=driver.findElement(By.xpath(" (//div[@class='card mt-4 top-card'])[2]"));
         System.out.println("(//div[@class='card mt-4 top-card'])[2] ");
         System.out.println("//div[@class='body-height']");
        forms.click();
        WebElement footer=driver.findElement(By.tagName("footer"));
        System.out.println("footer");

        WebElement header=driver.findElement(By.tagName("header"));
        System.out.println("header");
        header.click();
        Object top;
        // WebElement elements = driver.findElement(By.cssSelector(”card.mt-4.top-card”));
        //System.out.println(”card.mt-4.top-card ” );
        // WebElement textBox = driver.findElement(By.id(”iten-0 ”)) ;





   driver.quit();

    }
}
