package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File source = screenshot.getScreenshotAs(OutputType.FILE);
        String DATE_FORMATTER = "yyyy-MM-dd-HHmmss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
        String formatDateTime = LocalDateTime.now().format(formatter);
        System.out.println("Formatted Time :" + formatDateTime);
        int i = 1;
        FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "\\Logs\\print-" + formatDateTime + ".jpg"));
        i += 1;

    }
    }

