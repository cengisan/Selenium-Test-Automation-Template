package org.cengisan.util;

import org.cengisan.testbase.TestBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElementClass extends TestBaseClass {

    public WebElement elementFinderById(String Id) {
        //wait until the web element become visible.
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Id)));
    }
    public WebElement elementFinderByClassName(String className) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }
    public WebElement elementFinderByXPath(String xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
