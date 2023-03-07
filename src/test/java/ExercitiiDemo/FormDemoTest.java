package ExercitiiDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class FormDemoTest {
    public static void main(String[] args) {
//        fillFormDetails();
        windows();
    }

    public static void windows(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();
        String parrentWindow = driver.getWindowHandle(); // ne returneaza un id-ul acelui tab la care selenium are focus
        Set<String> windowHandlers = driver.getWindowHandles(); // ne returneaza o lista cu id-urile tutor tab-urilor care sunt deschise la momentul apelarii acestei metode//
        // Set se aseamana cu o lista, numai ca acesta contine numai elemente unice si acestea nu pot fi accesate pe baza indexului

        // iteram setul nostru de window handlers
        for (String window : windowHandlers){
            if (!window.equals(parrentWindow)){
                driver.switchTo().window(window); // schimbam focusul la un window care nu este parrentul
                break;
            }
        }

        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close(); // inchide doar fereastra curenta

        driver.switchTo().window(parrentWindow);
        driver.findElement(By.id("windowButton")).click();
        Set<String> windowHandlers2 = driver.getWindowHandles();
        for (String window : windowHandlers2){
            if (!window.equals(parrentWindow)){
                driver.switchTo().window(window); // schimbam focusul la un window care nu este parrentul
                break;
            }
        }
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();

        System.out.println("FINISH!");

        driver.quit();
    }

    public static void fillFormDetails(){
        ChromeDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

            WebElement form = driver.findElement(By.id("HTMLFormElements"));
            WebElement userName = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement comment = driver.findElement(By.name("comments"));
            WebElement fileUpload = driver.findElement(By.name("filename"));
//            WebElement hiddenImput = driver.findElement(By.name("hiddenField"));
            List<WebElement> checkBoxes = driver.findElements(By.name("checkboxes[]"));
            List<WebElement> radioButtons = driver.findElements(By.name("radioval"));
            Select select = new Select(driver.findElement(By.name("multipleselect[]")));
            Select dropdown = new Select(driver.findElement(By.name("dropdown")));
            WebElement cancelButton = driver.findElement(By.cssSelector("input[type='reset']"));
            WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

            userName.sendKeys("test_demo");
            password.sendKeys("passwordTest");
            comment.clear(); //golim zona, deoarece este scris ceva in el
            comment.sendKeys("Acesta este comment-ul meu custom.");
            fileUpload.sendKeys("C:\\Users\\user\\IdeaProjects\\Helin-QAC-g1-17-11-22\\Logs\\printscreen.png");
//            hiddenImput.sendKeys("Acesta este un imput hidden."); //ne da exceptia ElementNotInteractableException
            checkBoxes.get(1).click();
            radioButtons.get(2).click();
            select.deselectAll();
            select.selectByValue("ms1");
            select.selectByValue("ms2");
            dropdown.selectByIndex(2);
//            submitButton.click();

            form.submit();

        }finally {
            if (driver != null){
                driver.quit();
            }
        }




    }


}
