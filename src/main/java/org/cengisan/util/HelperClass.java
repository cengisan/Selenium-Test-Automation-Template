package org.cengisan.util;


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
