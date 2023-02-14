package org.skillbrain.teodorRadulescu.Utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Utils {


    public static void takeScreenshot(WebDriver driver) throws IOException {

        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            String destinationFile = System.getProperty("user.dir") +"/Logs/printScreen-"
                    + LocalDateTime.now() +".png";
            FileUtils.copyFile(source, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}