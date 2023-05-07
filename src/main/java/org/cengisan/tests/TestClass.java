package org.cengisan.tests;

import org.cengisan.testbase.TestBaseClass;
import org.cengisan.util.WebElementClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBaseClass {

    WebElementClass webElementClass = new WebElementClass();

    @Test
    public void test(){
        webElementClass.elementFinderById("sp-cc-accept").click();
        webElementClass.elementFinderById("twotabsearchtextbox").sendKeys("Phone");
        webElementClass.elementFinderById("nav-search-submit-button").click();
        webElementClass.elementFinderById("p_72/13136589031").click();
        webElementClass.elementFinderByXPath("//li[@id='p_89/Apple']/child::span").click();
        webElementClass.elementFinderByXPath("//img[@data-image-index='1']").click();
        Assert.assertEquals(webElementClass.elementFinderById("productTitle").getText(),"Apple iPhone 13 (128 GB) - Mavi");
    }
}