package org.cengisan.tests;

import org.cengisan.testbase.TestBaseClass;
import org.cengisan.util.WebElementClass;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBaseClass {

    // Email and password
    String VALID_EMAIL = "login@codility.com";
    String WRONG_EMAIL = "login@login.com";
    String PASSWORD = "password";
    String INVALID_EMAIL = "login@login";

    // Messages
    String WELCOME_MESSAGE = "Welcome to Codility";
    String SUCCESS_MESSAGE = "message success";
    String VALIDATION_ERROR_MESSAGE = "validation error";
    String NOT_PASS_MESSAGE = "You shall not pass! Arr!";
    String VALID_EMAIL_MESSAGE = "Enter a valid email";
    String EMAIL_REQUIRED_MESSAGE = "Email is required";
    String PASSWORD_REQUIRED_MESSAGE = "Password is required";

    WebElementClass webElementClass = new WebElementClass();

    @Test(priority = 1)
    public void checkValidEmailAndPasswordForLogin() {
        webElementClass.elementFinderById("email-input").sendKeys(VALID_EMAIL);
        webElementClass.elementFinderById("password-input").sendKeys(PASSWORD);
        webElementClass.elementFinderById("login-button").click();
        Assert.assertEquals(webElementClass.elementFinderByXPath("//*[@id='container']/div").getText(), WELCOME_MESSAGE);
        Assert.assertTrue(webElementClass.elementFinderByXPath("//*[@id='container']/div").getAttribute("class").contains(SUCCESS_MESSAGE));
        webDriver.navigate().refresh();
    }

    @Test(priority = 2)
    public void checkWrongEmailForLogin() {
        webElementClass.elementFinderById("email-input").sendKeys(WRONG_EMAIL);
        webElementClass.elementFinderById("password-input").sendKeys(PASSWORD);
        webElementClass.elementFinderById("login-button").click();
        Assert.assertEquals(webElementClass.elementFinderById("messages").getText(), NOT_PASS_MESSAGE);
        webDriver.navigate().refresh();
    }

    @Test(priority = 3)
    public void checkInvalidEmailForLogin() {
        webElementClass.elementFinderById("email-input").sendKeys(INVALID_EMAIL);
        webElementClass.elementFinderById("password-input").sendKeys(PASSWORD);
        webElementClass.elementFinderById("login-button").click();
        Assert.assertEquals(webElementClass.elementFinderById("messages").getText(), VALID_EMAIL_MESSAGE);
        Assert.assertTrue(webElementClass.elementFinderByXPath("//*[@id='messages']/div").getAttribute("class").contains(VALIDATION_ERROR_MESSAGE));
        webDriver.navigate().refresh();
    }

    @Test(priority = 4)
    public void checkEmptyEmailAndPasswordForLogin() {
        webElementClass.elementFinderById("login-button").click();
        Assert.assertEquals(webElementClass.elementFinderByXPath("//*[@id='messages']/div[1]").getText(), EMAIL_REQUIRED_MESSAGE);
        Assert.assertEquals(webElementClass.elementFinderByXPath("//*[@id='messages']/div[2]").getText(), PASSWORD_REQUIRED_MESSAGE);
        Assert.assertTrue(webElementClass.elementFinderByXPath("//*[@id='messages']/div[1]").getAttribute("class").contains(VALIDATION_ERROR_MESSAGE));
        Assert.assertTrue(webElementClass.elementFinderByXPath("//*[@id='messages']/div[2]").getAttribute("class").contains(VALIDATION_ERROR_MESSAGE));
        webDriver.navigate().refresh();
    }

    @Test(priority = 5)
    public void checkTabKeyAndEnterKeyForLogin() throws InterruptedException {
        webElementClass.elementFinderById("email-input").sendKeys(VALID_EMAIL);
        webElementClass.elementFinderById("password-input").sendKeys(PASSWORD);
        webElementClass.elementFinderById("password-input").click();
        Thread.sleep(1000);
        webElementClass.elementFinderById("password-input").sendKeys(Keys.TAB);
        Thread.sleep(1000);
        webElementClass.elementFinderById("login-button").sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        Assert.assertEquals(webElementClass.elementFinderByXPath("//*[@id='container']/div").getText(), WELCOME_MESSAGE);
        Assert.assertTrue(webElementClass.elementFinderByXPath("//*[@id='container']/div").getAttribute("class").contains(SUCCESS_MESSAGE));
    }

}