package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Locators;

public class ItemListingPage extends Page {

    public void addProduct1(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Faded Short')]"))).perform();
        //waitForElementToBeVisibleById(Locators.ADD_TO_CART_PRODUCT1_XPATH);
        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT1_XPATH))).click().perform();
        //clickByXpath(Locators.ADD_TO_CART_PRODUCT1_XPATH);
        //waitForElementToBeVisibleById(Locators.CLOSE_WINDOW);
//        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
//        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT1_XPATH))).click().perform();
//        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
    }

    public void addProduct2(){
        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT2_XPATH))).click().perform();
        //clickByXpath(Locators.ADD_TO_CART_PRODUCT1_XPATH);
        //waitForElementToBeVisibleById(Locators.CLOSE_WINDOW);
        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
//        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT2_XPATH))).click().perform();
//        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
    }
}
