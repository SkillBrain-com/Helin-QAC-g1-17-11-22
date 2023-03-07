public class WebTableTest {

     public static void main(String[] args) {
            accessWebTables();
       }
       public static void accessWebTables() {
           WebdriverManager BrowserManager = null;
           ChromeDriver driver = BrowserManager.createChromeDriver();
           driver.get("https://demoqa.com/webtables");
           WebElement addNewRecordButton = driver.findElement(By.id("addNewRecordButton"));
            addNewRecordButton.click();
           WebElement firstName = driver.findElement(By.id("firstName"));
           firstName.sendKeys("George");WebElement lastName = driver.findElement(By.id("lastName"));
           lastName.sendKeys("Popescu");
           WebElement emailInput = driver.findElement(By.id("userEmail"));
           emailInput.sendKeys("g.popescu@george.com");
           WebElement ageNumber = driver.findElement(By.id("age"));
           ageNumber.sendKeys("40");
           WebElement salaryAmount = driver.findElement(By.id("salary"));
           salaryAmount.sendKeys("2000");
           WebElement departmentName = driver.findElement(By.id("department"));
           departmentName.sendKeys(" HR");
           WebElement submitButton = driver.findElement(By.id("submit"));
           submitButton.click();
           System.out.println("Toate informatiile au fost completate cu succes!");
           driver.quit();

       }


}
