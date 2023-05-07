package org.cengisan.testbase;

import org.cengisan.enums.Driver;
import org.cengisan.enums.Url;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;


public class TestBaseClass {
    public WebDriver webDriver = new ChromeDriver();
    public static WebDriverWait wait;
    @BeforeSuite
    public void driverAwake(){
        System.setProperty(Driver.CHROMEDRIVER.getDriverInfo(), Driver.CHROMEPATH.getDriverInfo());
        webDriver.manage().window().maximize();
        webDriver.get(Url.AMAZON.getUrlInfo());
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
    }
    @AfterSuite
    public void tearDown(){
        webDriver.close();
        webDriver.quit();
    }
}
