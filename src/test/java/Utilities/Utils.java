package Utilities;

public class Utils {
    /* public void takeScreenshot (WebDriver driver){
          try {
              TakesScreenshot screenshot = (TakesScreenshot) driver;
              File source = screenshot.getScreenshotAs(OutputType.FILE);
              String destinationFile = System.getProperty("user.dir") + "/Logs/printScreen-" + LocalDateTime.now() + ".png";
              FileUtils.copyFile(source, new File(destinationFile));
          } catch (IOException e) {
              e.printStackTrace();
          }
      }*/
   /* public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        destinationFile = System.getProperty("user.dir")
                + "/Logs/printScreen-" + LocalDateTime.now() + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
    }*/
    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        //destinationFile = "Logs/printScreen-" + LocalDateTime.now() + ".png";
        //destinationFile = System.getProperty("user.dir")+"C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png";
        //FileUtils.copyFile(source, new File(


    }
}
