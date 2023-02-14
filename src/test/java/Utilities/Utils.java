package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
//    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//    }
//

    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
       // LocalDate today = LocalDate.now();
        //LocalDateTime today_time = LocalDateTime.now();
        String DATE_FORMATTER= "yyyy-MM-dd-HHmmss";
       // System.out.println("Current Date="+today_time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Formatted Time :" +formatDateTime);
        //destinationFile = "Logs/printScreen-" + LocalDateTime.now() + ".png";
        //destinationFile = System.getProperty("user.dir")+"C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png";
        //FileUtils.copyFile(source, new File("C:\\Users\\stelu\\IdeaProjects\\Helin-QAC-g1-17-11-22\\imagine.png"));
        int i=1;
        FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Logs\\print-"+ formatDateTime + ".png"));
        i+=1;

    }
}
