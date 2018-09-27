package com;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import utilities.Locators;
import utilities.Property;
import utilities.TestProperties;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShoppingCartPage extends Page {
    private double grossTotal;

    public void increaseProduct1Qty(){
        waitForElementToBeVisibleByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
        clickByXpath(Locators.ADD_QUANTITY_PRODUCT1_XPATH);
    }

    public void verifyProduct1Total(){
        waitForElementToBeVisibleByXpath(Locators.PRODUCT1_PRICE_XPATH);
        double price=getTextByXpath(Locators.PRODUCT1_PRICE_XPATH);
        double quantity=getValueByXpath(Locators.PRODUCT1_QUANTITY_XPATH);
        double total=getTextByXpath(Locators.PRODUCT1_TOTAL_XPATH);
        System.out.println("Product 1:"+price*quantity+" "+total);
        Assert.assertEquals(price*quantity,total,"Total do not match");
    }

    public void increaseProduct2Qty(){
        waitForElementToBeVisibleByXpath(Locators.ADD_QUANTITY_PRODUCT2_XPATH);
        clickByXpath(Locators.ADD_QUANTITY_PRODUCT2_XPATH);
    }

    public void verifyProduct2Total(){
        waitForElementToBeVisibleByXpath(Locators.PRODUCT2_PRICE_XPATH);
        double price=getTextByXpath(Locators.PRODUCT2_PRICE_XPATH);
        double quantity=getValueByXpath(Locators.PRODUCT2_QUANTITY_XPATH);
        double total=getTextByXpath(Locators.PRODUCT2_TOTAL_XPATH);
        System.out.println("Product 2:"+price*quantity+" "+total);
        Assert.assertEquals(price*quantity,total,"Total do not match");
    }

    public void verifyGrossTotal(){
        double product1Total=getTextByXpath(Locators.PRODUCT1_TOTAL_XPATH);
        double product2Total=getTextByXpath(Locators.PRODUCT2_TOTAL_XPATH);
        double total=getTextByXpath(Locators.PRODUCTS_TOTAL_XPATH);
        Double expectedTotal = BigDecimal.valueOf(product1Total+product2Total).setScale(2,RoundingMode.HALF_UP).doubleValue();
        double shippingTotal=getTextByXpath(Locators.PRODUCTS_SHIPPING_TOTAL_XPATH);
        grossTotal=getTextByXpath(Locators.PRODUCTS_GROSS_TOTAL_XPATH);
        Assert.assertEquals(expectedTotal,total,"Total do not match");
        Double expectedGrossTotal = BigDecimal.valueOf(expectedTotal+shippingTotal).setScale(2,RoundingMode.HALF_UP).doubleValue();
        Assert.assertEquals(expectedGrossTotal,grossTotal,"Gross Total do not match");
    }

    public void proceedToCheckoutAndVerifyFinalPrice(){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        waitForElementToBeVisibleByXpath(Locators.PROCEED_TO_CHECKOUT_XPATH);
        clickByXpath(Locators.PROCEED_TO_CHECKOUT_XPATH);
        js.executeScript("window.scrollBy(0,700)");
        waitForElementToBeVisibleByXpath(Locators.SUBMIT_XPATH);
        clickByXpath(Locators.SUBMIT_XPATH);
        js.executeScript("window.scrollBy(0,500)");
        waitForElementToBeVisibleByXpath(Locators.CHECKBOX_XPATH);
        clickByXpath(Locators.CHECKBOX_XPATH);
        clickByXpath(Locators.SUBMIT_XPATH);
        js.executeScript("window.scrollBy(0,500)");
        waitForElementToBeVisibleByXpath(Locators.PAY_BY_WIRE_XPATH);
        clickByXpath(Locators.PAY_BY_WIRE_XPATH);
        clickByXpath(Locators.SUBMIT_XPATH);
        double finalPrice=getTextByXpath(Locators.FETCH_PRICE_XPATH);
        Assert.assertEquals(grossTotal,finalPrice,"Final Price do not match");
    }
}
