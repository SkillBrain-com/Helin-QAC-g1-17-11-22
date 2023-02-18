package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
    }
    public static void takeScreenshot(WebDriver driver){


        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourse = screenshot.getScreenshotAs(OutputType.FILE);
            String destinationFile = System.getProperty("user.dir")
                    +"\\Logs\\printScreen.png";
            FileUtils.copyFile(sourse, new File(destinationFile));
        }catch (IOException e){
            e.printStackTrace();
            driver.quit();
        }



    }


}