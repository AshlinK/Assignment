package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Locators;

public class ItemListingPage extends Page {

    public void addProduct1() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Faded Short')]"))).perform();
        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT1_XPATH))).click().perform();
        waitForElementToBeVisibleByXpath(Locators.CLOSE_WINDOW);
        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
    }

    public void addProduct2() throws InterruptedException{
//        waitForElementToBeVisibleByXpath("//a[@title='Printed Dress']]");
        actions.moveToElement(driver.findElement(By.xpath("//a[@title='Printed Dress']"))).perform();
        actions.moveToElement(driver.findElement(By.xpath(Locators.ADD_TO_CART_PRODUCT2_XPATH))).click().perform();
        waitForElementToBeVisibleByXpath(Locators.CLOSE_WINDOW);

        actions.moveToElement(driver.findElement(By.xpath(Locators.CLOSE_WINDOW))).click().perform();
    }
}
