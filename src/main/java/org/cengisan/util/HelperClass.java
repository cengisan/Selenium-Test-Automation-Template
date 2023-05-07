package org.cengisan.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HelperClass {
    public static Properties propertiesReader(String FilePath) {
        Properties prop = new Properties();

        try {
            FileReader fileReader = new FileReader(FilePath);
            prop.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return prop;
    }



}
